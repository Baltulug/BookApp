package uz.gita.bookapp.domain.repository

import android.content.Context
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.ktx.storage
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.data.source.local.dao.BookDao
import uz.gita.bookapp.data.source.local.database.BookDatabase
import uz.gita.bookapp.domain.downloadmanager.AndroidDownloader
import java.io.File

class BookRepositoryImpl private constructor(
    private val fireStore: FirebaseFirestore = Firebase.firestore,
    private val storageReference: StorageReference = Firebase.storage.reference,
    private val dao: BookDao = BookDatabase.getInstance().getBookDao()
) : BookRepository {

    companion object {
        private lateinit var instance: BookRepository

        fun getInstance(): BookRepository {
            if (!(::instance.isInitialized)) {
                instance = BookRepositoryImpl()
            }

            return instance
        }
    }

    override fun downloadBook(context: Context, data: BookData): Flow<Result<BookData>> = callbackFlow {
        if (File(context.filesDir, data.title).exists()) {
            trySend(Result.success(data))
        } else {
            storageReference
                .child(data.reference)
                .getFile(File(context.filesDir, data.title))
                .addOnSuccessListener {
                    dao.insertBook(data.toEntity())
                    trySend(Result.success(data))
                }
                .addOnFailureListener {
                    trySend(Result.failure(it))
                }
        }

        awaitClose()
    }

    fun downloadBookByDownloader(context: Context, data: BookData): Flow<Result<String>> = callbackFlow {
        val download = AndroidDownloader(context)
        download.downloadFile(data.bookUrl)
        awaitClose()
    }

    override fun getRecomendedBooks(): Flow<Result<List<BookData>>> = callbackFlow {
        fireStore.collection("books")
            .whereGreaterThanOrEqualTo("rate", 5)
//            .whereArrayContains("genre", "thriller")
//            .whereArrayContainsAny("genre", listOf("thriller", "fantasy", "romance"))
            .get()
            .addOnSuccessListener {
                Log.d("TTT", "Repository Success: ${it.documents.size}")
                val list = arrayListOf<BookData>()
                it.documents.forEach {
                    it.toObject(BookData::class.java)?.let { it1 -> list.add(it1) }
                }
                trySend(Result.success(list))
            }
            .addOnFailureListener {
                Log.d("TTT", "Repository Failure: ${it.message}")
                trySend(Result.failure(it))
            }
        awaitClose()
    }
}

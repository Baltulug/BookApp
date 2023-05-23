package uz.gita.bookapp.data.source.datastore

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.google.firebase.firestore.remote.Datastore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.data.model.LastReadBook

private val AUTHOR_NAME = stringPreferencesKey("book_author_name")
private val BOOK_NAME = stringPreferencesKey("book_name")
private val READED_PAGES = intPreferencesKey("readed_pages_count")
private val TOTAL_PAGES = intPreferencesKey("total_pages_count")

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "storage")

class MyDataStore private constructor(
    private val context: Context
){
    companion object {
        @SuppressLint("StaticFieldLeak")
        private lateinit var instance: MyDataStore

        fun init(context: Context) {
            instance = MyDataStore(context)
        }

        fun getInstance() = instance
    }

    suspend fun saveLastBookReaded(data: BookData, currentPage: Int = 0) {
        Log.d("TTT", "Saving Book in MyDataStore: $data")
        context.dataStore.edit {
            it[AUTHOR_NAME] = data.author
            it[BOOK_NAME] = data.title
            it[READED_PAGES] = currentPage
            it[TOTAL_PAGES] = data.page
        }

    }

    fun getLastReadedBook(): Flow<LastReadBook> = context.dataStore.data.map {
        LastReadBook(
            author = it[AUTHOR_NAME] ?: "",
            title = it[BOOK_NAME] ?: "",
            pages = it[TOTAL_PAGES] ?: 0,
            readedPages = it[READED_PAGES] ?: 0
        )
    }
}
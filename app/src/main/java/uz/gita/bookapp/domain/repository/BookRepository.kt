package uz.gita.bookapp.domain.repository

import android.content.Context
import kotlinx.coroutines.flow.Flow
import uz.gita.bookapp.data.model.BookData

interface BookRepository {
    fun getRecomendedBooks(): Flow<Result<List<BookData>>>

    fun downloadBook(context: Context, data: BookData): Flow<Result<BookData>>

//    fun downloadBook(): Flow<Result<String>>
}
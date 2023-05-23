package uz.gita.bookapp.domain.usecase

import android.content.Context
import kotlinx.coroutines.flow.Flow
import uz.gita.bookapp.data.model.BookData

interface BookUseCase {
    fun getRecommendedBooks(): Flow<Result<List<BookData>>>

    fun downloadBook(context: Context, data: BookData): Flow<Result<BookData>>

}
package uz.gita.bookapp.domain.usecase

import android.content.Context
import kotlinx.coroutines.flow.Flow
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.data.source.local.entity.BookEntity
import uz.gita.bookapp.domain.repository.BookRepository
import uz.gita.bookapp.domain.repository.BookRepositoryImpl

class BookUseCaseImpl(
    private val repository: BookRepository = BookRepositoryImpl.getInstance()
): BookUseCase {

    override fun getRecommendedBooks(): Flow<Result<List<BookData>>> = repository.getRecomendedBooks()

    override fun downloadBook(context: Context, data: BookData): Flow<Result<BookData>> =
        repository.downloadBook(context, data)

    companion object {
        private lateinit var instance: BookUseCase

        fun getInstance(): BookUseCase {
            if(!(::instance.isInitialized)) {
                instance = BookUseCaseImpl()
            }
            return instance
        }
    }

}
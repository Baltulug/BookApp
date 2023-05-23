package uz.gita.bookapp.presentation.ui.screen.home.viewmodel

import androidx.lifecycle.LiveData
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.data.model.LastReadBook

interface HomeViewModel {

    fun getRecommendedBooks()
    fun getLastReadedBook()

    val recommendedBooksLiveData: LiveData<List<BookData>>
    val lastReadedBookLiveData: LiveData<LastReadBook>
}

package uz.gita.bookapp.presentation.ui.screen.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.data.model.LastReadBook
import uz.gita.bookapp.data.source.datastore.MyDataStore
import uz.gita.bookapp.domain.usecase.BookUseCase
import uz.gita.bookapp.domain.usecase.BookUseCaseImpl

class HomeViewModelImpl(
    private val useCase: BookUseCase = BookUseCaseImpl.getInstance(),
    private val dataStore: MyDataStore = MyDataStore.getInstance()
): ViewModel(), HomeViewModel {
    override val recommendedBooksLiveData = MutableLiveData<List<BookData>>()

    override val lastReadedBookLiveData = MutableLiveData<LastReadBook>()

    override fun getLastReadedBook() {
        viewModelScope.launch {
            dataStore.getLastReadedBook().collectLatest {
                lastReadedBookLiveData.value = it
            }
        }
    }

    override fun getRecommendedBooks() {
        useCase.getRecommendedBooks()
            .onEach {
                it.onSuccess {
                    Log.d("TTT", "VM Success: $it")
                    recommendedBooksLiveData.value = it
                }
                it.onFailure {
                    Log.d("TTT", "VM Failure: ${it.message}")
                }
            }
            .catch {  }
            .launchIn(viewModelScope)
    }
}

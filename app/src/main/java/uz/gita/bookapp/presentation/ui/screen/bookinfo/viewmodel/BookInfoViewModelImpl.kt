package uz.gita.bookapp.presentation.ui.screen.bookinfo.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.domain.usecase.BookUseCase
import uz.gita.bookapp.domain.usecase.BookUseCaseImpl

class BookInfoViewModelImpl(
    private val useCase: BookUseCase = BookUseCaseImpl.getInstance()
) : ViewModel(), BookInfoViewModel {

    override val fileDownloadedLiveData = MutableLiveData<BookData>()
    override val errorDownloadLiveData = MutableLiveData<String>()


    override fun downloadBook(context: Context, data: BookData) {
        useCase.downloadBook(context, data)
            .onEach { result ->
                result.onSuccess {
                    fileDownloadedLiveData.value = it
                }

                result.onFailure {
                    errorDownloadLiveData.value = it.message
                }
            }
            .launchIn(viewModelScope)
    }
}

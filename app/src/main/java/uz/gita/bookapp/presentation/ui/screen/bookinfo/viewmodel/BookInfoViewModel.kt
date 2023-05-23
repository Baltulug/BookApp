package uz.gita.bookapp.presentation.ui.screen.bookinfo.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import uz.gita.bookapp.data.model.BookData

interface BookInfoViewModel {
    val fileDownloadedLiveData: LiveData<BookData>
    val errorDownloadLiveData: LiveData<String>

    fun downloadBook(context: Context, data: BookData)
}

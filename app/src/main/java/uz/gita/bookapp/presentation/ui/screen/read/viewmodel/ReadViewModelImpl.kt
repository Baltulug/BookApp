package uz.gita.bookapp.presentation.ui.screen.read.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import uz.gita.bookapp.data.model.BookData
import uz.gita.bookapp.data.source.datastore.MyDataStore

class ReadViewModelImpl(
    private val dataStore: MyDataStore = MyDataStore.getInstance()
): ViewModel(), ReadViewModel {


    override fun saveBookAsRead(data: BookData, currentPage: Int) {
        Log.d("TTT", "Saving Book in ReadViewModel: $data")
        viewModelScope.launch {
            dataStore.saveLastBookReaded(data, currentPage)
        }
    }
}

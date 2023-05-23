package uz.gita.bookapp.presentation.ui.screen.read.viewmodel

import uz.gita.bookapp.data.model.BookData

interface ReadViewModel {
    fun saveBookAsRead(data: BookData, currentPage: Int)
}

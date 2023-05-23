package uz.gita.bookapp.data.model

data class LastReadBook(
    val author: String,
    val title: String,
    val pages: Int = 0,
    val readedPages: Int = 0,
)

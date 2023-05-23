package uz.gita.bookapp.data.model

import uz.gita.bookapp.data.source.local.entity.BookEntity
import java.io.Serializable

data class BookData(
    val author: String = "",
    val bookUrl: String = "",
    val coverUrl: String = "",
    val genre: String = "",
    val id: Int = 0,
    val page: Int = 0,
    val rate: Int = 0,
    val reference: String = "",
    val title: String = "",
    val year: String = ""
): Serializable {
    fun toEntity(): BookEntity = BookEntity(
        author = author,
        bookUrl = bookUrl,
        coverUrl = coverUrl,
        genre = genre,
        id = id,
        page = page,
        rate = rate,
        reference = reference,
        title = title,
        year = year
    )
}

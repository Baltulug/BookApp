package uz.gita.bookapp.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.gita.bookapp.data.model.BookData

@Entity(tableName = "books")
data class BookEntity(
    val author: String = "",
    val bookUrl: String = "",
    val coverUrl: String = "",
    val genre: String = "",
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val page: Int = 0,
    val rate: Int = 0,
    val reference: String = "",
    val title: String = "",
    val year: String = "",
    val readerPages: Int = 0
) {
    fun toData() = BookData(
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

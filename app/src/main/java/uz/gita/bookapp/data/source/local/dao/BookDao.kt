package uz.gita.bookapp.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import uz.gita.bookapp.data.source.local.entity.BookEntity

@Dao
interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBook(book: BookEntity)

    @Update
    fun updateBook(book: BookEntity)

    @Query("SELECT * FROM books")
    fun getBooks(): List<BookEntity>

}
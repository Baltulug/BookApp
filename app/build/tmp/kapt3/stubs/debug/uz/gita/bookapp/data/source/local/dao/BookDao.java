package uz.gita.bookapp.data.source.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\t"}, d2 = {"Luz/gita/bookapp/data/source/local/dao/BookDao;", "", "getBooks", "", "Luz/gita/bookapp/data/source/local/entity/BookEntity;", "insertBook", "", "book", "updateBook", "app_debug"})
public abstract interface BookDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertBook(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.source.local.entity.BookEntity book);
    
    @androidx.room.Update
    public abstract void updateBook(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.source.local.entity.BookEntity book);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM books")
    public abstract java.util.List<uz.gita.bookapp.data.source.local.entity.BookEntity> getBooks();
}
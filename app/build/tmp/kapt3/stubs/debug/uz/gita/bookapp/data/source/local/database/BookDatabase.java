package uz.gita.bookapp.data.source.local.database;

import java.lang.System;

@androidx.room.Database(entities = {uz.gita.bookapp.data.source.local.entity.BookEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Luz/gita/bookapp/data/source/local/database/BookDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getBookDao", "Luz/gita/bookapp/data/source/local/dao/BookDao;", "Companion", "app_debug"})
public abstract class BookDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.bookapp.data.source.local.database.BookDatabase.Companion Companion = null;
    private static uz.gita.bookapp.data.source.local.database.BookDatabase database;
    private static final java.lang.String NAME_DATABASE = "book_list.db";
    
    public BookDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract uz.gita.bookapp.data.source.local.dao.BookDao getBookDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/bookapp/data/source/local/database/BookDatabase$Companion;", "", "()V", "NAME_DATABASE", "", "database", "Luz/gita/bookapp/data/source/local/database/BookDatabase;", "getInstance", "init", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void init(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.bookapp.data.source.local.database.BookDatabase getInstance() {
            return null;
        }
    }
}
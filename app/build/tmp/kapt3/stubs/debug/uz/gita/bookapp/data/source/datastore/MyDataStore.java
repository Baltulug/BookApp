package uz.gita.bookapp.data.source.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J#\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Luz/gita/bookapp/data/source/datastore/MyDataStore;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getLastReadedBook", "Lkotlinx/coroutines/flow/Flow;", "Luz/gita/bookapp/data/model/LastReadBook;", "saveLastBookReaded", "", "data", "Luz/gita/bookapp/data/model/BookData;", "currentPage", "", "(Luz/gita/bookapp/data/model/BookData;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class MyDataStore {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.bookapp.data.source.datastore.MyDataStore.Companion Companion = null;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static uz.gita.bookapp.data.source.datastore.MyDataStore instance;
    
    private MyDataStore(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveLastBookReaded(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data, int currentPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<uz.gita.bookapp.data.model.LastReadBook> getLastReadedBook() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Luz/gita/bookapp/data/source/datastore/MyDataStore$Companion;", "", "()V", "instance", "Luz/gita/bookapp/data/source/datastore/MyDataStore;", "getInstance", "init", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void init(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.bookapp.data.source.datastore.MyDataStore getInstance() {
            return null;
        }
    }
}
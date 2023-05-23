package uz.gita.bookapp.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016\u00f8\u0001\u0000J%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f\u00f8\u0001\u0000J\u001d\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u000b0\nH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Luz/gita/bookapp/domain/repository/BookRepositoryImpl;", "Luz/gita/bookapp/domain/repository/BookRepository;", "fireStore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "dao", "Luz/gita/bookapp/data/source/local/dao/BookDao;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/storage/StorageReference;Luz/gita/bookapp/data/source/local/dao/BookDao;)V", "downloadBook", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Luz/gita/bookapp/data/model/BookData;", "context", "Landroid/content/Context;", "data", "downloadBookByDownloader", "", "getRecomendedBooks", "", "Companion", "app_debug"})
public final class BookRepositoryImpl implements uz.gita.bookapp.domain.repository.BookRepository {
    private final com.google.firebase.firestore.FirebaseFirestore fireStore = null;
    private final com.google.firebase.storage.StorageReference storageReference = null;
    private final uz.gita.bookapp.data.source.local.dao.BookDao dao = null;
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.bookapp.domain.repository.BookRepositoryImpl.Companion Companion = null;
    private static uz.gita.bookapp.domain.repository.BookRepository instance;
    
    private BookRepositoryImpl(com.google.firebase.firestore.FirebaseFirestore fireStore, com.google.firebase.storage.StorageReference storageReference, uz.gita.bookapp.data.source.local.dao.BookDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.bookapp.data.model.BookData>> downloadBook(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> downloadBookByDownloader(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.bookapp.data.model.BookData>>> getRecomendedBooks() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Luz/gita/bookapp/domain/repository/BookRepositoryImpl$Companion;", "", "()V", "instance", "Luz/gita/bookapp/domain/repository/BookRepository;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.bookapp.domain.repository.BookRepository getInstance() {
            return null;
        }
    }
}
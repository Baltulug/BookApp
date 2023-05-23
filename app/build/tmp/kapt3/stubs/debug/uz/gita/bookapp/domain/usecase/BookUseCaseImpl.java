package uz.gita.bookapp.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016\u00f8\u0001\u0000J\u001d\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00070\u0006H\u0016\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Luz/gita/bookapp/domain/usecase/BookUseCaseImpl;", "Luz/gita/bookapp/domain/usecase/BookUseCase;", "repository", "Luz/gita/bookapp/domain/repository/BookRepository;", "(Luz/gita/bookapp/domain/repository/BookRepository;)V", "downloadBook", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Luz/gita/bookapp/data/model/BookData;", "context", "Landroid/content/Context;", "data", "getRecommendedBooks", "", "Companion", "app_debug"})
public final class BookUseCaseImpl implements uz.gita.bookapp.domain.usecase.BookUseCase {
    private final uz.gita.bookapp.domain.repository.BookRepository repository = null;
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.bookapp.domain.usecase.BookUseCaseImpl.Companion Companion = null;
    private static uz.gita.bookapp.domain.usecase.BookUseCase instance;
    
    public BookUseCaseImpl() {
        super();
    }
    
    public BookUseCaseImpl(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.domain.repository.BookRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.bookapp.data.model.BookData>>> getRecommendedBooks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<uz.gita.bookapp.data.model.BookData>> downloadBook(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Luz/gita/bookapp/domain/usecase/BookUseCaseImpl$Companion;", "", "()V", "instance", "Luz/gita/bookapp/domain/usecase/BookUseCase;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final uz.gita.bookapp.domain.usecase.BookUseCase getInstance() {
            return null;
        }
    }
}
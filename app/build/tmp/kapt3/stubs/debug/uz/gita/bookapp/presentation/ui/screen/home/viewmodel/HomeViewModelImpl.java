package uz.gita.bookapp.presentation.ui.screen.home.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/home/viewmodel/HomeViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/bookapp/presentation/ui/screen/home/viewmodel/HomeViewModel;", "useCase", "Luz/gita/bookapp/domain/usecase/BookUseCase;", "dataStore", "Luz/gita/bookapp/data/source/datastore/MyDataStore;", "(Luz/gita/bookapp/domain/usecase/BookUseCase;Luz/gita/bookapp/data/source/datastore/MyDataStore;)V", "lastReadedBookLiveData", "Landroidx/lifecycle/MutableLiveData;", "Luz/gita/bookapp/data/model/LastReadBook;", "getLastReadedBookLiveData", "()Landroidx/lifecycle/MutableLiveData;", "recommendedBooksLiveData", "", "Luz/gita/bookapp/data/model/BookData;", "getRecommendedBooksLiveData", "getLastReadedBook", "", "getRecommendedBooks", "app_debug"})
public final class HomeViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.bookapp.presentation.ui.screen.home.viewmodel.HomeViewModel {
    private final uz.gita.bookapp.domain.usecase.BookUseCase useCase = null;
    private final uz.gita.bookapp.data.source.datastore.MyDataStore dataStore = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.bookapp.data.model.BookData>> recommendedBooksLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<uz.gita.bookapp.data.model.LastReadBook> lastReadedBookLiveData = null;
    
    public HomeViewModelImpl() {
        super();
    }
    
    public HomeViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.domain.usecase.BookUseCase useCase, @org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.source.datastore.MyDataStore dataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.bookapp.data.model.BookData>> getRecommendedBooksLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<uz.gita.bookapp.data.model.LastReadBook> getLastReadedBookLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void getLastReadedBook() {
    }
    
    @java.lang.Override
    public void getRecommendedBooks() {
    }
}
package uz.gita.bookapp.presentation.ui.screen.home.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/home/viewmodel/HomeViewModel;", "", "lastReadedBookLiveData", "Landroidx/lifecycle/LiveData;", "Luz/gita/bookapp/data/model/LastReadBook;", "getLastReadedBookLiveData", "()Landroidx/lifecycle/LiveData;", "recommendedBooksLiveData", "", "Luz/gita/bookapp/data/model/BookData;", "getRecommendedBooksLiveData", "getLastReadedBook", "", "getRecommendedBooks", "app_debug"})
public abstract interface HomeViewModel {
    
    public abstract void getRecommendedBooks();
    
    public abstract void getLastReadedBook();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.bookapp.data.model.BookData>> getRecommendedBooksLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<uz.gita.bookapp.data.model.LastReadBook> getLastReadedBookLiveData();
}
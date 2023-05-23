package uz.gita.bookapp.presentation.ui.screen.bookinfo.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/bookinfo/viewmodel/BookInfoViewModel;", "", "errorDownloadLiveData", "Landroidx/lifecycle/LiveData;", "", "getErrorDownloadLiveData", "()Landroidx/lifecycle/LiveData;", "fileDownloadedLiveData", "Luz/gita/bookapp/data/model/BookData;", "getFileDownloadedLiveData", "downloadBook", "", "context", "Landroid/content/Context;", "data", "app_debug"})
public abstract interface BookInfoViewModel {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<uz.gita.bookapp.data.model.BookData> getFileDownloadedLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.lang.String> getErrorDownloadLiveData();
    
    public abstract void downloadBook(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data);
}
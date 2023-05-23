package uz.gita.bookapp.presentation.ui.screen.bookinfo.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/bookinfo/viewmodel/BookInfoViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/bookapp/presentation/ui/screen/bookinfo/viewmodel/BookInfoViewModel;", "useCase", "Luz/gita/bookapp/domain/usecase/BookUseCase;", "(Luz/gita/bookapp/domain/usecase/BookUseCase;)V", "errorDownloadLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorDownloadLiveData", "()Landroidx/lifecycle/MutableLiveData;", "fileDownloadedLiveData", "Luz/gita/bookapp/data/model/BookData;", "getFileDownloadedLiveData", "downloadBook", "", "context", "Landroid/content/Context;", "data", "app_debug"})
public final class BookInfoViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.bookapp.presentation.ui.screen.bookinfo.viewmodel.BookInfoViewModel {
    private final uz.gita.bookapp.domain.usecase.BookUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<uz.gita.bookapp.data.model.BookData> fileDownloadedLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorDownloadLiveData = null;
    
    public BookInfoViewModelImpl() {
        super();
    }
    
    public BookInfoViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.domain.usecase.BookUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<uz.gita.bookapp.data.model.BookData> getFileDownloadedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorDownloadLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void downloadBook(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data) {
    }
}
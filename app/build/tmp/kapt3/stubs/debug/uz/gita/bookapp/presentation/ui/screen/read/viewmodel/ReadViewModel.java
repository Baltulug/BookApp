package uz.gita.bookapp.presentation.ui.screen.read.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/read/viewmodel/ReadViewModel;", "", "saveBookAsRead", "", "data", "Luz/gita/bookapp/data/model/BookData;", "currentPage", "", "app_debug"})
public abstract interface ReadViewModel {
    
    public abstract void saveBookAsRead(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data, int currentPage);
}
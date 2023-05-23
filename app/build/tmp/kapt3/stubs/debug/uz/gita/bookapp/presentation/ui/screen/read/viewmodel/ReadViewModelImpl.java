package uz.gita.bookapp.presentation.ui.screen.read.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/read/viewmodel/ReadViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/bookapp/presentation/ui/screen/read/viewmodel/ReadViewModel;", "dataStore", "Luz/gita/bookapp/data/source/datastore/MyDataStore;", "(Luz/gita/bookapp/data/source/datastore/MyDataStore;)V", "saveBookAsRead", "", "data", "Luz/gita/bookapp/data/model/BookData;", "currentPage", "", "app_debug"})
public final class ReadViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.bookapp.presentation.ui.screen.read.viewmodel.ReadViewModel {
    private final uz.gita.bookapp.data.source.datastore.MyDataStore dataStore = null;
    
    public ReadViewModelImpl() {
        super();
    }
    
    public ReadViewModelImpl(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.source.datastore.MyDataStore dataStore) {
        super();
    }
    
    @java.lang.Override
    public void saveBookAsRead(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data, int currentPage) {
    }
}
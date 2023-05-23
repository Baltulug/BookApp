package uz.gita.bookapp.presentation.ui.screen.read;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/read/ReadBookScreenArgs;", "Landroidx/navigation/NavArgs;", "data", "Luz/gita/bookapp/data/model/BookData;", "(Luz/gita/bookapp/data/model/BookData;)V", "getData", "()Luz/gita/bookapp/data/model/BookData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "", "Companion", "app_debug"})
public final class ReadBookScreenArgs implements androidx.navigation.NavArgs {
    @org.jetbrains.annotations.NotNull
    private final uz.gita.bookapp.data.model.BookData data = null;
    @org.jetbrains.annotations.NotNull
    public static final uz.gita.bookapp.presentation.ui.screen.read.ReadBookScreenArgs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.bookapp.presentation.ui.screen.read.ReadBookScreenArgs copy(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ReadBookScreenArgs(@org.jetbrains.annotations.NotNull
    uz.gita.bookapp.data.model.BookData data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.bookapp.data.model.BookData component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final uz.gita.bookapp.data.model.BookData getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final androidx.lifecycle.SavedStateHandle toSavedStateHandle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"DEPRECATION"})
    @kotlin.jvm.JvmStatic
    public static final uz.gita.bookapp.presentation.ui.screen.read.ReadBookScreenArgs fromBundle(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final uz.gita.bookapp.presentation.ui.screen.read.ReadBookScreenArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Luz/gita/bookapp/presentation/ui/screen/read/ReadBookScreenArgs$Companion;", "", "()V", "fromBundle", "Luz/gita/bookapp/presentation/ui/screen/read/ReadBookScreenArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"DEPRECATION"})
        @kotlin.jvm.JvmStatic
        public final uz.gita.bookapp.presentation.ui.screen.read.ReadBookScreenArgs fromBundle(@org.jetbrains.annotations.NotNull
        android.os.Bundle bundle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public final uz.gita.bookapp.presentation.ui.screen.read.ReadBookScreenArgs fromSavedStateHandle(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
            return null;
        }
    }
}
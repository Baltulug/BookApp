package uz.gita.bookapp.domain.downloadmanager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Luz/gita/bookapp/domain/downloadmanager/AndroidDownloader;", "Luz/gita/bookapp/domain/downloadmanager/Downloader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "downloadManager", "Landroid/app/DownloadManager;", "kotlin.jvm.PlatformType", "downloadFile", "", "url", "", "app_debug"})
public final class AndroidDownloader implements uz.gita.bookapp.domain.downloadmanager.Downloader {
    private final android.content.Context context = null;
    private final android.app.DownloadManager downloadManager = null;
    
    public AndroidDownloader(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public long downloadFile(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return 0L;
    }
}
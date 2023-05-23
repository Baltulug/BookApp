package uz.gita.bookapp.domain.downloadmanager

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

interface Downloader {
    fun downloadFile(url: String): Long
}

class AndroidDownloader(
    private val context: Context
): Downloader {
    private val downloadManager = context.getSystemService(DownloadManager::class.java)

    override fun downloadFile(url: String): Long {
        val request = DownloadManager.Request(url.toUri())
//            .setMimeType("application/pdf")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE or DownloadManager.Request.NETWORK_WIFI)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED) // process not finish
//            .addRequestHeader("Authorization", "Bearer <token>") //token maybe
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "BOOKAPP/$url.pdf")
        return downloadManager.enqueue(request)
    }
}
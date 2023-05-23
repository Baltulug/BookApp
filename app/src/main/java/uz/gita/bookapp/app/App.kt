package uz.gita.bookapp.app

import android.app.Application
import uz.gita.bookapp.data.source.datastore.MyDataStore
import uz.gita.bookapp.data.source.local.database.BookDatabase

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        BookDatabase.init(this)
        MyDataStore.init(this)
    }
}
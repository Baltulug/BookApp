package uz.gita.bookapp.presentation.ui.screen.read

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.launch
import uz.gita.bookapp.R
import uz.gita.bookapp.data.source.datastore.MyDataStore
import uz.gita.bookapp.databinding.ScreenReadBookBinding
import uz.gita.bookapp.presentation.ui.screen.bookinfo.BookInfoScreenArgs
import uz.gita.bookapp.presentation.ui.screen.read.viewmodel.ReadViewModel
import uz.gita.bookapp.presentation.ui.screen.read.viewmodel.ReadViewModelImpl
import java.io.File

class ReadBookScreen: Fragment(R.layout.screen_read_book) {
    private val binding by viewBinding(ScreenReadBookBinding::bind)
    private val args: ReadBookScreenArgs by navArgs()

    private val viewModel: ReadViewModel by viewModels<ReadViewModelImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        openBook()
    }

    private fun openBook() {
        binding.pdfView.fromFile(File(requireContext().filesDir, args.data.title)).load()
    }

    override fun onPause() {
        super.onPause()
        viewModel.saveBookAsRead(args.data, binding.pdfView.currentPage)
    }

}
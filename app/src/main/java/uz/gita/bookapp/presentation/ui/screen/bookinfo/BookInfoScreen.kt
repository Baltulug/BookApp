package uz.gita.bookapp.presentation.ui.screen.bookinfo

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import uz.gita.bookapp.R
import uz.gita.bookapp.databinding.ScreenBookInfoBinding
import uz.gita.bookapp.domain.downloadmanager.AndroidDownloader
import uz.gita.bookapp.presentation.ui.screen.bookinfo.viewmodel.BookInfoViewModel
import uz.gita.bookapp.presentation.ui.screen.bookinfo.viewmodel.BookInfoViewModelImpl
import java.io.File

class BookInfoScreen: Fragment(R.layout.screen_book_info) {
    private val binding by viewBinding(ScreenBookInfoBinding::bind)
    private val viewModel: BookInfoViewModel by viewModels<BookInfoViewModelImpl>()

    private val args: BookInfoScreenArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            val data = args.data
            bookAuthor.text = data.author
            bookTitle.text = data.title
            bookReview.text = data.rate.toString() + " " + data.genre
            Glide
                .with(requireContext())
                .load(data.coverUrl)
                .into(bookImage)

            downloadBtn.setOnClickListener {
                viewModel.downloadBook(requireContext(), data)
            }

            linearLayout.setOnClickListener {
                val action = BookInfoScreenDirections.actionBookInfoScreenToReadBookScreen(data)
                findNavController().navigate(action)
            }

            viewModel.fileDownloadedLiveData.observe(viewLifecycleOwner) {
                downloadBtn.setImageResource(R.drawable.ic_downloaded)
            }

            viewModel.errorDownloadLiveData.observe(viewLifecycleOwner) {
                Toast.makeText(requireContext(), "Error!", Toast.LENGTH_SHORT).show()
                Log.d("TTT", "Error downloading file: $it")
            }
        }
    }
}
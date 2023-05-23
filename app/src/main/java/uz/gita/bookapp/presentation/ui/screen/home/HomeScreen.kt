package uz.gita.bookapp.presentation.ui.screen.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.bookapp.R
import uz.gita.bookapp.data.source.datastore.MyDataStore
import uz.gita.bookapp.databinding.ScreenHomeBinding
import uz.gita.bookapp.presentation.adapter.HorizontalAdapter
import uz.gita.bookapp.presentation.ui.screen.home.viewmodel.HomeViewModel
import uz.gita.bookapp.presentation.ui.screen.home.viewmodel.HomeViewModelImpl

class HomeScreen : Fragment(R.layout.screen_home) {
    private val binding by viewBinding(ScreenHomeBinding::bind)
    private val viewModel: HomeViewModel by viewModels<HomeViewModelImpl>()

    private val adapter: HorizontalAdapter = HorizontalAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.getRecommendedBooks()
        viewModel.getLastReadedBook()

        adapter.setClickListener {
            val action = HomeScreenDirections.actionHomeScreenToBookInfoScreen(it)
            findNavController().navigate(action)
        }

        binding.recomendationRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = this@HomeScreen.adapter
        }

        viewModel.recommendedBooksLiveData.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        viewModel.lastReadedBookLiveData.observe(viewLifecycleOwner) {
            Log.d("TTT", "Last Readed Book: $it")
            if(it.author.isEmpty()) {
                binding.lastReadedBook.visibility = View.GONE
            } else {
                binding.lastReadedBook.visibility = View.VISIBLE
                binding.lastReadBookAuthor.text = it.author
                binding.lastReadBookTitle.text = it.title
                binding.readedPercentage.text = "${it.readedPages/it.pages}%"
            }
        }
    }
}
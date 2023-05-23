package uz.gita.bookapp.presentation.ui.screen.explore

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.bookapp.R
import uz.gita.bookapp.databinding.ScreenExploreBinding
import uz.gita.bookapp.presentation.ui.screen.explore.viewmodel.ExploreViewModel
import uz.gita.bookapp.presentation.ui.screen.explore.viewmodel.ExploreViewModelImpl


class ExploreScreen : Fragment(R.layout.screen_explore) {
    private val binding by viewBinding(ScreenExploreBinding::bind)
    private val viewModel: ExploreViewModel by viewModels<ExploreViewModelImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}
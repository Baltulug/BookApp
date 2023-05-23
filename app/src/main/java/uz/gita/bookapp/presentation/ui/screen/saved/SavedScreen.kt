package uz.gita.bookapp.presentation.ui.screen.saved

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.bookapp.R
import uz.gita.bookapp.databinding.ScreenSavedBinding
import uz.gita.bookapp.presentation.ui.screen.saved.viewmodel.SavedViewModel
import uz.gita.bookapp.presentation.ui.screen.saved.viewmodel.SavedViewModelImpl


class SavedScreen : Fragment(R.layout.screen_saved) {
    private val binding by viewBinding(ScreenSavedBinding::bind)
    private val viewModel: SavedViewModel by viewModels<SavedViewModelImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}
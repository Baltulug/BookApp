package uz.gita.bookapp.presentation.ui.screen.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.bookapp.R
import uz.gita.bookapp.databinding.ScreenProfileBinding
import uz.gita.bookapp.presentation.ui.screen.profile.viewmodel.ProfileViewModel
import uz.gita.bookapp.presentation.ui.screen.profile.viewmodel.ProfileViewModelImpl

class ProfileScreen : Fragment(R.layout.screen_profile) {
    private val binding by viewBinding(ScreenProfileBinding::bind)
    private val viewModel: ProfileViewModel by viewModels<ProfileViewModelImpl>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}
package com.dteam.newsapplication.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dteam.newsapplication.R
import kotlinx.android.synthetic.main.fragment_first_login.*

/**
 * An example full-screen fragment that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FirstLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_login_first_login.setOnClickListener{
            findNavController().navigate(R.id.action_firstLoginFragment_to_secondLoginFragment)
        }

        btn_register_first_login.setOnClickListener{
            findNavController().navigate(R.id.action_firstLoginFragment_to_firstRegisterFragment)
        }
    }
}
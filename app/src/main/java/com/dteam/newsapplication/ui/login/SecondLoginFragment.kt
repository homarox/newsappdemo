package com.dteam.newsapplication.ui.login

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dteam.newsapplication.R
import kotlinx.android.synthetic.main.fragment_second_login.*

class SecondLoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_register_second_login.setOnClickListener{
            findNavController().navigate(R.id.action_secondLoginFragment_to_mainNewsFragment)
        }

        tw_info_second_login.setOnClickListener{
            findNavController().navigate(R.id.action_secondLoginFragment_to_thirdLoginFragment)
        }
    }
}
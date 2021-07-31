package com.dteam.newsapplication.ui.login

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.dteam.newsapplication.databinding.FragmentSecondRegisterBinding

import com.dteam.newsapplication.R
import kotlinx.android.synthetic.main.fragment_first_login.*
import kotlinx.android.synthetic.main.fragment_first_login.btn_login_first_login
import kotlinx.android.synthetic.main.fragment_first_login.btn_register_first_login
import kotlinx.android.synthetic.main.fragment_second_register.*

class SecondRegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_register_second_register.setOnClickListener{
            findNavController().navigate(R.id.action_secondRegisterFragment_to_secondLoginFragment)
        }

        btn_continue_second_register.setOnClickListener{
            findNavController().navigate(R.id.action_secondRegisterFragment_to_firstRegisterFragment)
        }
    }
}
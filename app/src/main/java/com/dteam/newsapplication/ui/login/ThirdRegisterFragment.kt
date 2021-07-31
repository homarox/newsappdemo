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
import com.dteam.newsapplication.databinding.FragmentThirdRegisterBinding

import com.dteam.newsapplication.R
import kotlinx.android.synthetic.main.fragment_first_login.*
import kotlinx.android.synthetic.main.fragment_first_login.btn_login_first_login
import kotlinx.android.synthetic.main.fragment_third_register.*

class ThirdRegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_register_third_register.setOnClickListener{
            findNavController().navigate(R.id.action_thirdRegisterFragment_to_fourthRegisterFragment)
        }
    }
}
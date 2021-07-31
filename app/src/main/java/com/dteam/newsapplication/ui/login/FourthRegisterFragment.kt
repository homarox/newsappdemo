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
import com.dteam.newsapplication.databinding.FragmentFourthRegisterBinding

import com.dteam.newsapplication.R
import kotlinx.android.synthetic.main.fragment_fourth_register.*
import kotlinx.android.synthetic.main.fragment_second_register.*
import kotlinx.android.synthetic.main.fragment_second_register.btn_register_second_register

class FourthRegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fourth_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_register_fourth_register.setOnClickListener{
            findNavController().navigate(R.id.action_fourthRegisterFragment_to_mainNewsFragment)
        }
    }
}
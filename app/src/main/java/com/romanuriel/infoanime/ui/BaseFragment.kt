package com.romanuriel.infoanime.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel

abstract class BaseFragment<B: ViewDataBinding, V: ViewModel>(private val layout: Int):Fragment(), IBaseView {
    lateinit var binding: B
    abstract val viewModel: V

    override fun onCreate(savedInstanceState: Bundle?) {
        setMenuVisibility(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(!this::binding.isInitialized){
            binding = DataBindingUtil.inflate(layoutInflater, layout, container, false)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialComponent(view, savedInstanceState)
    }

    abstract fun initialComponent(view: View, savedInstanceState: Bundle?)

}
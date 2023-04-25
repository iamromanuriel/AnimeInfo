package com.romanuriel.infoanime.ui.detailanime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.romanuriel.infoanime.R
import com.romanuriel.infoanime.databinding.FragmentDetailAnimeBinding
import com.romanuriel.infoanime.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailAnimeFragment : BaseFragment<FragmentDetailAnimeBinding, DetailAnimeViewModel>(R.layout.fragment_detail_anime) {
    override val viewModel: DetailAnimeViewModel by viewModels()

    override fun initialComponent(view: View, savedInstanceState: Bundle?) {
        viewModel.showData()
        viewModel.dataAnimeLiveData.observe(this.viewLifecycleOwner){
            println(it)
        }

    }

}
package com.romanuriel.infoanime.ui.listanime

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.romanuriel.infoanime.R
import com.romanuriel.infoanime.databinding.FragmentListAnimeBinding
import com.romanuriel.infoanime.ui.BaseFragment
import com.romanuriel.infoanime.utils.adapters.AnimeBaseAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ListAnimeFragment : BaseFragment<FragmentListAnimeBinding, ListAnimeViewModel>(R.layout.fragment_list_anime) {
    override val viewModel: ListAnimeViewModel by viewModels()
    private lateinit var adapter : AnimeBaseAdapter

    override fun initialComponent(view: View, savedInstanceState: Bundle?) {
        viewModel.showList()
        adapter = AnimeBaseAdapter { Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show() }

        binding.recyclerAnime.hasFixedSize()
        binding.recyclerAnime.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerAnime.adapter = adapter
        lScope.launch{
            viewModel.listAnime.collect{
                println(it.toString())
                adapter.setListIteAnime(it)
            }
        }
    }

}
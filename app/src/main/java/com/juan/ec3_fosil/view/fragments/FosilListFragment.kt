package com.juan.ec3_fosil.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juan.ec3_fosil.R
import com.juan.ec3_fosil.RVFosilListAdapter
import com.juan.ec3_fosil.databinding.FragmentFosilListBinding


class FosilListFragment : Fragment() {

    private lateinit var binding : FragmentFosilListBinding
    private lateinit var viewModel: FosilLisViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(FosilLisViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentFosilListBinding.inflate(inflater,container,false)
        return  binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVFosilListAdapter(listOf())
        binding.rvFosilList.adapter = adapter
        binding.rvFosilList.layoutManager = GridLayoutManager(requireContext(),2,
            RecyclerView.VERTICAL,false)
        viewModel.fosilList.observe(requireActivity()){
            adapter.fosiles = it
            adapter.notifyDataSetChanged()
        }
        viewModel.getFosilFromService()

    }


}

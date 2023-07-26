package com.juan.ec3_fosil.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juan.ec3_fosil.R
import com.juan.ec3_fosil.databinding.FragmentFosilFavoriteBinding


class FosilFavoriteFragment : Fragment() {

    private  lateinit var binding: FragmentFosilFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFosilFavoriteBinding.inflate(inflater,container, false)
        return binding.root
         }


}
package com.example.wildberrieslayouts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wildberrieslayouts.databinding.FragmentMp3Binding

class Mp3Fragment : Fragment() {

    private var _binding: FragmentMp3Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMp3Binding.inflate(inflater, container, false)
        requireActivity().window.statusBarColor = resources.getColor(R.color.background_gray)
        requireActivity().window.navigationBarColor = resources.getColor(R.color.background_gray)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
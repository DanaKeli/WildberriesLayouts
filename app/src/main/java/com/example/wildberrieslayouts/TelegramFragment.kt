package com.example.wildberrieslayouts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wildberrieslayouts.databinding.FragmentTelegramBinding

class TelegramFragment : Fragment() {

    private var _binding: FragmentTelegramBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTelegramBinding.inflate(inflater, container, false)
        requireActivity().window.statusBarColor = resources.getColor(R.color.blue)
        requireActivity().window.navigationBarColor = resources.getColor(R.color.background_light_gray)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
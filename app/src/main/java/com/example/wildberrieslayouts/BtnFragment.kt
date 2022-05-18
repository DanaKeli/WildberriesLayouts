package com.example.wildberrieslayouts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wildberrieslayouts.databinding.FragmentBtnBinding

class BtnFragment : Fragment() {

    private var _binding: FragmentBtnBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBtnBinding.inflate(inflater, container, false)
        initViews()
        return binding.root
    }

    private fun initViews() {
        binding.apply {
            btnMp3.setOnClickListener {
                moveToFragment(Mp3Fragment())
            }
            btnTelegram.setOnClickListener {
                moveToFragment(TelegramFragment())
            }
            btnCalculator.setOnClickListener {
                moveToFragment(CalculatorFragment())
            }
            btnFacebook.setOnClickListener {
                moveToFragment(FacebookFragment())
            }
        }
    }

    private fun moveToFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack("com.example.wildberrieslayouts.BtnFragment")
            .commit()
    }
}
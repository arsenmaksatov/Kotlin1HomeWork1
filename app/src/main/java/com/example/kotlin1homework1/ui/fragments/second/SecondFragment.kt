package com.example.kotlin1homework1.ui.fragments.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.kotlin1homework1.base.BaseFragment
import com.example.kotlin1homework1.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    override lateinit var binding: FragmentSecondBinding
    private val args: SecondFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun setupListener() {
        binding.button.setOnClickListener {
            findNavController().navigate(
                SecondFragmentDirections.actionSecondFragmentToFirstFragment(
                    binding.editText.text.toString()
                )
            )
        }
        binding.editText.setText(args.nameG)


    }
}
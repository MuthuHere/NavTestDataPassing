package com.muthu.navtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.muthu.navtest.databinding.ActivityMainBinding
import com.muthu.navtest.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.apply {
            button.setOnClickListener {
                val bundle = bundleOf("user_name" to editTextTextPersonName.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle)
            }
        }


        return binding.root
    }

}
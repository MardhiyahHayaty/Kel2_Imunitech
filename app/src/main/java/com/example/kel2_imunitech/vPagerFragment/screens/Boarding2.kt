package com.example.kel2_imunitech.vPagerFragment.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.kel2_imunitech.R
import com.example.kel2_imunitech.databinding.FragmentBoarding2Binding

class Boarding2 : Fragment() {
    private lateinit var binding: FragmentBoarding2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_boarding2,
            container, false
        )
        binding = FragmentBoarding2Binding.bind(view)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.txtHalNext.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return view
    }
}

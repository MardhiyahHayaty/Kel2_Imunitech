package com.example.kel2_imunitech

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SplashScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(
                    R.id.action_splashScreenFragment_to_halamanUtamaFragment2)
            } else{
                findNavController().navigate(
                    R.id.action_splashScreenFragment_to_viewPagerFragment)
            }
        }, 3000)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }
    private fun onBoardingFinished(): Boolean {
        val sharePref = requireActivity().getSharedPreferences("Onboarding", Context.MODE_PRIVATE)
        return sharePref.getBoolean("Selesai", false)
    }
}
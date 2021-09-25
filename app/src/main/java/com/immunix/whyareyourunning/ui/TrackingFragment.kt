package com.immunix.whyareyourunning.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.immunix.whyareyourunning.R
import com.immunix.whyareyourunning.databinding.FragmentTrackingBinding

class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private var _binding: FragmentTrackingBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTrackingBinding.bind(view)

        binding.apply {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
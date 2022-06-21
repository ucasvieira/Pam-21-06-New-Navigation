package com.example.appnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class fragment_sixth : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sixth, container, false)

        view.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_fragment_sixth_to_fragment_first3)
        }
        return view
    }
}
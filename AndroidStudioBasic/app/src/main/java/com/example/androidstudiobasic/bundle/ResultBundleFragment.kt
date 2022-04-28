package com.example.androidstudiobasic.bundle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.androidstudiobasic.R

class ResultBundleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result_bundle, container, false)
        val text = view.findViewById<TextView>(R.id.result_text)
        text.text = arguments?.getString("key")
        return view
    }
}
package com.example.androidstudiobasic.bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidstudiobasic.R

class BundleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle)

        val b = findViewById<Button>(R.id.move)
        b.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.linear, ResultBundleFragment().apply {
                arguments = Bundle().apply {
                    putString("key", "hi")
                }
            }).commit()
        }
    }
}
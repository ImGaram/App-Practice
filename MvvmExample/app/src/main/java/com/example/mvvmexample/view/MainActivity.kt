package com.example.mvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmexample.R
import com.example.mvvmexample.databinding.ActivityMainBinding
import com.example.mvvmexample.model.Entity
import com.example.mvvmexample.viewmodel.MainViewModel
import com.example.mvvmexample.viewmodel.RecyclerViewAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = viewModel

        val mAdapter = RecyclerViewAdapter(this, viewModel)
        binding.recyclerview.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(applicationContext)
        }

        viewModel.allUsers.observe(this, Observer { users ->
            users?.let { mAdapter.setUsers(it) }
        })

        binding.button.setOnClickListener {
            lifecycleScope.launch(Dispatchers.IO) {
                viewModel.insert(Entity(0, binding.edit.text.toString()))
            }
        }
    }
}
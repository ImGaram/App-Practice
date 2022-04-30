package com.example.mvvmexample.viewmodel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmexample.R
import com.example.mvvmexample.model.Entity

class RecyclerViewAdapter internal constructor(context: Context, var onDeleterListener: MainViewModel)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var users = emptyList<Entity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = inflater.inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val num = users[position]
        holder.textView.text = num.number1

        holder.deleteButton.setOnClickListener(View.OnClickListener {
            onDeleterListener.deleteAll(num)
            return@OnClickListener
        })
    }

    internal fun setUsers(users: List<Entity>) {
        this.users = users
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var textView = itemView.findViewById<TextView>(R.id.text)
        val deleteButton = itemView.findViewById<Button>(R.id.delete_button)
    }

    override fun getItemCount(): Int {
        return users.size
    }
}
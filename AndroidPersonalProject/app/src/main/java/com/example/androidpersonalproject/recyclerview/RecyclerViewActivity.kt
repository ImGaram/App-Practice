package com.example.androidpersonalproject.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.androidpersonalproject.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val list = ArrayList<RecyclerItem>()
        list.add(RecyclerItem(getDrawable(R.drawable.image01)!!,getString(R.string.title01)))
        list.add(RecyclerItem(getDrawable(R.drawable.image02)!!,getString(R.string.title02)))
        list.add(RecyclerItem(getDrawable(R.drawable.image03)!!,getString(R.string.title03)))
        list.add(RecyclerItem(getDrawable(R.drawable.image04)!!,getString(R.string.title04)))
        list.add(RecyclerItem(getDrawable(R.drawable.image05)!!,getString(R.string.title05)))
        list.add(RecyclerItem(getDrawable(R.drawable.image06)!!,getString(R.string.title06)))
        list.add(RecyclerItem(getDrawable(R.drawable.image07)!!,getString(R.string.title07)))
        list.add(RecyclerItem(getDrawable(R.drawable.image08)!!,getString(R.string.title08)))
        list.add(RecyclerItem(getDrawable(R.drawable.image09)!!,getString(R.string.title09)))
        list.add(RecyclerItem(getDrawable(R.drawable.image10)!!,getString(R.string.title10)))

        val adapter = RecyclerAdapter(list)
        recycler_view.adapter = adapter

        recycler_view.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
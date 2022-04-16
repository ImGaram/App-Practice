package com.example.japtangg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.japtangg.databinding.ActivityMainBinding
import com.example.japtangg.retrofit.UserInfo
import retrofit2.Call
import retrofit2.Response

class Retrofit : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    val TAG: String = "로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        binding.activity = this
//
//        binding.btn.setOnClickListener {
//            Toast.makeText(this, "테스트", Toast.LENGTH_SHORT).show()
//            Builder.api.UserInfo().enqueue(object : retrofit2.Callback<UserInfo> {
//                //통신 성공
//                override fun onResponse(call: Call<UserInfo>, response: Response<UserInfo>) {
//                    val userinfo = response.body()!!
//                    binding.followers.text = userinfo?.followers.toString()
//                    binding.login.text = userinfo?.userId
//                    binding.following.text = userinfo?.following.toString()
//                    Log.d(TAG, "onResponse: 유저아이디: ${userinfo?.userId}, 팔로워: ${userinfo?.followers}, 팔로잉: ${userinfo?.following} ")
//
//                }
//                //통신 실패
//                override fun onFailure(call: Call<UserInfo>, t: Throwable) {
//                    Log.d("error", t.message.toString())
//                }
//
//            })

    }
}

//    fun create(java: Class<Api>): Api {
//
//    }

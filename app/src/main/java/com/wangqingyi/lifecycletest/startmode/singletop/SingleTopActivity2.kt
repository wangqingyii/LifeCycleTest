package com.wangqingyi.lifecycletest.startmode.singletop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wangqingyi.lifecycletest.databinding.ActivitySingleTop2Binding
import com.wangqingyi.lifecycletest.databinding.ActivitySingleTopBinding

class SingleTopActivity2 : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingleTop2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySingleTop2Binding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.mJumpTv.setOnClickListener {
            val intent = Intent(this, SingleTopActivity::class.java)
            startActivity(intent)
        }
    }
}
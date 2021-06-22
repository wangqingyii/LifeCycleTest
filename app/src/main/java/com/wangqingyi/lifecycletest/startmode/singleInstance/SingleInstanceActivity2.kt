package com.wangqingyi.lifecycletest.startmode.singleInstance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wangqingyi.lifecycletest.databinding.ActivitySingleInstance2Binding

class SingleInstanceActivity2 : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingleInstance2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySingleInstance2Binding.inflate(layoutInflater)
        setContentView(mBinding.root)    }
}
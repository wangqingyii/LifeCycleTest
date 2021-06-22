package com.wangqingyi.lifecycletest.startmode.standard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wangqingyi.lifecycletest.databinding.ActivityStandardBinding

/**
 * 默认模式
 */
class StandardActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityStandardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityStandardBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.mJumpTv.setOnClickListener {
            val intent = Intent(this, StandardActivity::class.java)
            startActivity(intent)
        }
    }
}
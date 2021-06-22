package com.wangqingyi.lifecycletest.startmode.singletask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wangqingyi.lifecycletest.databinding.ActivitySingleTask2Binding

class SingleTaskActivity2 : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingleTask2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySingleTask2Binding.inflate(layoutInflater)
        setContentView(mBinding.root)
        // 此时SingleTaskActivity的启动模式为SingleTop，
        // 并且返回栈内已经存在SingleTaskActivity的实例且未位于栈顶
        // 当启动SingleTaskActivity时，会将SingleTaskActivity
        // 上方的实例全部出栈(也就是当前Activity)让SingleTaskActivity位于返回栈顶，
        // 并且SingleTaskActivity中的 onNewIntent() 方法会被调用。
        mBinding.mJumpTv.setOnClickListener {
            val intent = Intent(this, SingleTaskActivity::class.java)
            startActivity(intent)
        }
    }
}
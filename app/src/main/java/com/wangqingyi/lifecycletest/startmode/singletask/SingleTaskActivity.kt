package com.wangqingyi.lifecycletest.startmode.singletask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wangqingyi.lifecycletest.databinding.ActivitySingleTaskBinding

/**
 * 栈内复用模式
 */
class SingleTaskActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingleTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySingleTaskBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.mJumpTv.setOnClickListener {
            // SingleTaskActivity2的启动模式设置为 SingleTop并且返回栈内并不存在SingleTaskActivity2的实例时，
            // 当启动SingleTaskActivity2时，会创建一个崭新的SingleTaskActivity2实例在栈顶。
            val intent = Intent(this, SingleTaskActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        Log.d("123123", "onNewIntent执行")
        super.onNewIntent(intent)
    }
}
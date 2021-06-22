package com.wangqingyi.lifecycletest.startmode.singletop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wangqingyi.lifecycletest.databinding.ActivitySingleTopBinding

/**
 * 栈顶复用模式
 */
class SingleTopActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingleTopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("123123", "onCreate")

        mBinding = ActivitySingleTopBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.mRepeatJumpTv.setOnClickListener {
            // 现在启动一个SingleTopActivity，SingleTopActivity的启动模式为SingleTop，
            // 当启动SingleTopActivity时，会复用之前的SingleTopActivity，并且onNewIntent() 方法被调用
            val intent = Intent(this, SingleTopActivity::class.java)
            startActivity(intent)
        }
        mBinding.mJumpActivityTv.setOnClickListener {
            // SingleTopActivity2设置启动模式为SingleTop，这时返回栈中不存在SingleTopActivity2的实例
            // 当启动SingleTopActivity2时，会创建一个崭新的SingleTopActivity2实例在栈顶。
            val intent = Intent(this, SingleTopActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("123123", "onNewIntent执行")
    }
}
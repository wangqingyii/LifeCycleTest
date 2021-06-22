package com.wangqingyi.lifecycletest.startmode.singleInstance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wangqingyi.lifecycletest.databinding.ActivitySingleInstanceBinding

/**
 * 单实例模式
 */
class SingleInstanceActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingleInstanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySingleInstanceBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.mJumpTv.setOnClickListener {
            // SingleInstanceActivity的启动模式设置为 SingleInstance，
            // 并且返回栈内不存在SingleInstanceActivity的实例，
            // 当启动SingleInstanceActivity时，会在创建一个新的返回栈，并且栈内只有一个实例。
            // 所以当跳转到SingleInstanceActivity2之后再按Back键会返回到主页
            val intent = Intent(this, SingleInstanceActivity2::class.java)
            startActivity(intent)
        }
    }
}
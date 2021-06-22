package com.wangqingyi.lifecycletest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.wangqingyi.lifecycletest.databinding.ActivityMainBinding
import com.wangqingyi.lifecycletest.dialog.DialogFactory
import com.wangqingyi.lifecycletest.startmode.singleInstance.SingleInstanceActivity
import com.wangqingyi.lifecycletest.startmode.singletask.SingleTaskActivity
import com.wangqingyi.lifecycletest.startmode.singletop.SingleTopActivity
import com.wangqingyi.lifecycletest.startmode.standard.StandardActivity


class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "TAGTAG"
    }

    private lateinit var mBinding: ActivityMainBinding

    private val mDialog by lazy(mode = LazyThreadSafetyMode.NONE) {
        DialogFactory.createConfirmDialog(this, "Dialog", true)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.mDialogActivityTv.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
        mBinding.mJumpTv.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        mBinding.mDialogTv.setOnClickListener {
            mDialog.show()
        }
        mBinding.mReplaceFragmentTv.setOnClickListener {
            addFragment(TestFragment2())
        }

        // 启动模式
        mBinding.mStandardTv.setOnClickListener {
            val intent = Intent(this, StandardActivity::class.java)
            startActivity(intent)
        }
        mBinding.mSingleTopTv.setOnClickListener {
            val intent = Intent(this, SingleTopActivity::class.java)
            startActivity(intent)
        }
        mBinding.mSingleTaskTv.setOnClickListener {
            val intent = Intent(this, SingleTaskActivity::class.java)
            startActivity(intent)
        }
        mBinding.mSingleInstanceTv.setOnClickListener {
            val intent = Intent(this, SingleInstanceActivity::class.java)
            startActivity(intent)
        }

        addFragment(TestFragment1())
        Log.d(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    /**
     * 添加Fragment
     */
    private fun addFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.mFrameLayout, fragment)
        // 添加返回栈
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
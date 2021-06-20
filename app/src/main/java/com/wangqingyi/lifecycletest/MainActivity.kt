package com.wangqingyi.lifecycletest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.wangqingyi.lifecycletest.databinding.ActivityMainBinding
import com.wangqingyi.lifecycletest.dialog.DialogFactory


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
//        mBinding.mAddFragmentTv.setOnClickListener {
//            addFragment(TestFragment1())
//        }
        mBinding.mReplaceFragmentTv.setOnClickListener {
            addFragment(TestFragment2())
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
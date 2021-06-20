package com.wangqingyi.lifecycletest

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wangqingyi.lifecycletest.MainActivity.Companion.TAG

class TestFragment2 : Fragment() {

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        Log.d(TAG, "onAttach Fragment2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate Fragment2")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated Fragment2")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Fragment2")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Fragment2")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Fragment2")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Fragment2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView Fragment2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Fragment2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach Fragment2")
    }
}
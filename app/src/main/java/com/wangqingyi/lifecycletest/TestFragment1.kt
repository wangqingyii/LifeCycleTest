package com.wangqingyi.lifecycletest

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TestFragment1 : Fragment() {
    companion object {
        const val TAG = "TestFragment1"
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        Log.d(TAG, "onAttach Fragment1")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate Fragment1")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView Fragment1")
        return inflater.inflate(R.layout.fragment_test1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated Fragment1")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Fragment1")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Fragment1")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Fragment1")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Fragment1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView Fragment1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Fragment1")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach Fragment1")
    }
}
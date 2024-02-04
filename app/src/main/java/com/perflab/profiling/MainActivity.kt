package com.perflab.profiling

import android.os.Bundle
import android.os.Debug
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        Generate Trace Logs
//        -----------------------------

//        1. Simple Tracing
//        -----------------------------
        Debug.startMethodTracing("sample-new")
        setContentView(R.layout.activity_main)
        Debug.stopMethodTracing()
    }
}

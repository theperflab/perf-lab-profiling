package com.perflab.profiling

import android.os.Bundle
import android.os.Debug
import androidx.activity.ComponentActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        Generate Trace Logs
//        -----------------------------

//        1. Simple Tracing
//        -----------------------------
//        Debug.startMethodTracing("sample-new")
//        setContentView(R.layout.activity_main)
//        Debug.stopMethodTracing()

//        2. Save multiple trace logs
//        -----------------------------
//        val dateFormat = SimpleDateFormat("dd_MM_yyyy_hh_mm_ss", Locale.getDefault())
//        val currentDateTime = dateFormat.format(Date())
//        Debug.startMethodTracing("sample-new-$currentDateTime")
//        setContentView(R.layout.activity_main)
//        Debug.stopMethodTracing()

//        3. Advance Tracing
//        -----------------------------
        Debug.startMethodTracingSampling(
            "sample-tracing-new",
            1024 /*1KB*/ * 1024 /*1MB*/ * 8 /*8MB*/,
            1000 /*1MS*/
        )
        setContentView(R.layout.activity_main)
        Debug.stopMethodTracing()
    }
}

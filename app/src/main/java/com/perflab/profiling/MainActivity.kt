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

        val dateFormat = SimpleDateFormat("dd_MM_yyyy_hh_mm_ss", Locale.getDefault())
        val currentDateTime = dateFormat.format(Date())
        Debug.startMethodTracing("sample-new-$currentDateTime")

        setContentView(R.layout.activity_main)
        sortData(listOf(1,23,5,435,67,24,3,54,55,61,7,48,92,12,3,445,64,765,22,35,12,76,87,34,987,0,9))
        sortData(listOf(1,23,5))
        Thread.sleep(2000)

        Debug.stopMethodTracing()
    }
    private fun sortData(list: List<Int>){
        list.sorted()
    }
}

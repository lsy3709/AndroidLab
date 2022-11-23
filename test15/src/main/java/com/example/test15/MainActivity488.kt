package com.example.test15

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.core.content.getSystemService
import com.example.test15.databinding.ActivityMain488Binding
import com.example.test15.databinding.ActivityMainBinding

class MainActivity488 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMain488Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jobServiceButton.setOnClickListener {
            var jobScheduler: JobScheduler? = getSystemService<JobScheduler>()

            val extras = PersistableBundle()
            extras.putString("extra_data", "hello kkang")

            val builder = JobInfo.Builder(1, ComponentName(this, MyJobService::class.java))
            builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED)
            builder.setRequiresCharging(true)
            builder.setExtras(extras)

            val jobInfo = builder.build()

            jobScheduler!!.schedule(jobInfo)


        }
    }
}
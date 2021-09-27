package com.example.notificationcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.notificationcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        supportActionBar?.hide()

        mBinding.notificationCounter.NotificationButon.setOnClickListener{
            Toast.makeText(this,"Notification Counter",Toast.LENGTH_LONG).show()
        }

        mBinding.button.setOnClickListener {
            addingNumber(mBinding)
        }
        mBinding.button.setOnLongClickListener {
            mBinding.notificationCounter.CountingNumber.text = "1"

            true
        }
    }
    private fun addingNumber(mBinding : ActivityMainBinding){
        val maxNumber = 99
        var minNumber  = 1


        minNumber++
        mBinding.notificationCounter.CountingNumber.text = minNumber.toString()

    }
}
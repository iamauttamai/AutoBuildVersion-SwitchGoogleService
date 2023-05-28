package com.iamauttamai.autobuildversioncode

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iamauttamai.autobuildversioncode.databinding.ActivityMainBinding
import com.iamauttamai.autobuildversioncode.BuildConfig;

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val strVersionCode = BuildConfig.VERSION_CODE
        val strVersionName = BuildConfig.VERSION_NAME

        binding.txtVersionCode.text = "VERSION CODE : $strVersionCode"
        binding.txtVersionName.text = "VERSION NAME : $strVersionName"

    }
}
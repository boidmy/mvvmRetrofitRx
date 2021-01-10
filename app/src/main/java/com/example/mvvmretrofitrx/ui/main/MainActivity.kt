package com.example.mvvmretrofitrx.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmretrofitrx.R
import com.example.mvvmretrofitrx.databinding.ActivityMainBinding
import com.example.mvvmretrofitrx.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layout: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}
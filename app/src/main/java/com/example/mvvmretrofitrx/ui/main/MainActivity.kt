package com.example.mvvmretrofitrx.ui.main

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmretrofitrx.R
import com.example.mvvmretrofitrx.databinding.ActivityMainBinding
import com.example.mvvmretrofitrx.ui.ViewModelFactory
import com.example.mvvmretrofitrx.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    @Inject lateinit var factory: ViewModelProvider.Factory
    private val viewModel by viewModels<MainViewModel> {factory}

    override val layout: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = viewModel

        //선택사항 데이터 바인딩을 써도되고 옵저버 써도됨
        viewModel.getApi().observe(this, Observer {
            Log.d("zz", it.toString())
        })
    }
}
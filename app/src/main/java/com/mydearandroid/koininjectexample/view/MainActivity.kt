package com.mydearandroid.koininjectexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import coil.api.load
import com.mydearandroid.koininjectexample.viewmodel.MainViewModel
import com.mydearandroid.koininjectexample.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel.getMeetupData().observe(this, Observer {
            tv_title.text = it.title
            iv_img.load(it.idImage)
            tv_message.text = it.message

        })
    }
}

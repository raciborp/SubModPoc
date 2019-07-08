package com.pawelraciborski.smp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pawelraciborski.moda.TestA
import com.pawelraciborski.modb.TestB
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvContent.text = "${TestA.hello()}/${TestB.hello()}"
    }
}

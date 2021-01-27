package com.frantun.bootcampflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title_text.text = getString(R.string.title)

        image.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.development))
    }
}
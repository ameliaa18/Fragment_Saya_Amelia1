package com.example.fragment_saya_amelia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentOne = FragmentOne()
        val fragment = supportFragmentManager.findFragmentByTag(FragmentOne::class.java.simpleName)

        if (fragment !is FragmentOne) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, mFragmentOne, FragmentOne::class.java.simpleName)
                .commit()
        }
    }
}
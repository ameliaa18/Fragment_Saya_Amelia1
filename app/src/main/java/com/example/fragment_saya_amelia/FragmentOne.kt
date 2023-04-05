package com.example.fragment_saya_amelia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction


class FragmentOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var button = null
        button.setOnClickListener {
            val mFragmentTwo = FragmentTwo()
            val mFragmentManager = fragmentManager

            mFragmentManager?.beginTransaction()?.apply {
                replace(R.id.fragment_container,mFragmentTwo, FragmentTwo::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }
}

fun Nothing?.setOnClickListener(function: () -> FragmentTransaction?) {

}

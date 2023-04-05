package com.example.fragment_saya_amelia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragmentTwo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_two,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var button2 = null
        button2.setOnClickListener {
            val mFragmentOne = FragmentOne()
            val mFragmentManager = fragmentManager

            mFragmentManager?.beginTransaction()?.apply {
                replace(R.id.fragment_container, mFragmentOne, FragmentOne::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        var button3 = null
        button3.setOnClickListener {
            val mFragmentThree = FragmentThree()
            val mFragmentManager = fragmentManager

            // With Bundle
            val mBundle = Bundle()
            mBundle.putString(FragmentThree.EXTRA_TITLE,"Curriculum Vitae")
            mFragmentThree.arguments =  mBundle

            // With Setter and Getter
            val desc = "Name: Galih\nGender: Male\nReligion: Islam"
            mFragmentThree.description = desc

            mFragmentManager?.beginTransaction()?.apply {
                replace(R.id.fragment_container, mFragmentThree, FragmentThree::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }
}
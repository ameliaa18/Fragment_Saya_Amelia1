package com.example.fragment_saya_amelia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragmentThree : Fragment() {

    lateinit var description: String


    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DESC = "extra_desc"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_three,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (arguments != null) {
            val title = arguments?.getString(EXTRA_TITLE)
        }
    }
}
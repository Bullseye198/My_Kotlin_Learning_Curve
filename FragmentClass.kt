//Written by Bullseye198 
//A simple Fragment class with onCreateView function:
//This file also has a button

package com.mifcom.snapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.mifcom.androidutils.common.extensions.show
import com.mifcom.androidutils.mifcom.MifcomController
import com.mifcom.snapp.R
import com.mifcom.snapp.companions.Scandit
import com.mifcom.snapp.views.PickupView
import com.mifcom.snapp.views.ScanResultsView
import kotlinx.android.synthetic.main.activity_home.*
import java.lang.Exception
import java.util.zip.Inflater

class UploadMenuFragment : Fragment() {

    private val photoItem by lazy { navigation_view.menu.findItem(R.id.nav_photo) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_upload_menu, container, false)


        val v = inflater.inflate(R.layout.fragment_upload_menu, container, false)
        val ButtonFront = v.findViewById<TextView>(R.id.button10)
        val ButtonRight = v.findViewById<TextView>(R.id.button11)
        val ButtonBack = v.findViewById<TextView>(R.id.button12)
        val ButtonLeft = v.findViewById<TextView>(R.id.button13)
        val ButtonTop = v.findViewById<TextView>(R.id.button14)

        return v
    }
//This is the part which I still must figure out.
//We have a button 10 which should launch PhotoFragment:
/*
    private fun getFragment(id: Int): Pair<Int?, Fragment?> {
        var fragment: Fragment? = null
        var rid: Int? = null
        when (id) {
            photoItem!!.itemId -> {
                rid = R.id.nav_photo
                fragment = supportFragmentManager.findFragmentByTag(R.id.button10.toString()) //supportFragmentManager unsolved reference
                if (fragment == null) fragment = PhotoFragment()

        }
        return Pair(rid, fragment)
        */
    }

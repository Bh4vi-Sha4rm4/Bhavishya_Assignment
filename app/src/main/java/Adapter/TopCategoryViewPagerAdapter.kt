package com.example.prathamandroidcodingassessment.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bhavishya_assignment.ChildFragment
import com.example.bhavishya_assignment.TopFragment

class TopCategoryViewPagerAdapter(supportFragmentManager: FragmentManager, private val list: List<String>, val CategoryType: Int) : FragmentPagerAdapter(supportFragmentManager) {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        if (CategoryType == 1) {
            val fragment = TopFragment()
            fragment.arguments = Bundle().apply {
                putString("category", list[position])
            }
            return fragment
        } else {
            val fragment = ChildFragment()
            fragment.arguments = Bundle().apply {
                putString("SubCategory", list[position])
            }
            return fragment
        }
    }

     override fun getPageTitle(position: Int): CharSequence? {
        return list[position]
    }
}
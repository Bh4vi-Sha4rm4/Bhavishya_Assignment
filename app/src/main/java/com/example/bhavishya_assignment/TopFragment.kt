package com.example.bhavishya_assignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.prathamandroidcodingassessment.adapter.TopCategoryViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class TopFragment : Fragment() {
    val list = listOf("For You", "Top Charts", "Categories", "Editor's Choice", "Early Access")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment, container, false)
        val vpCategory = view.findViewById<ViewPager>(R.id.vpSubCategory)
        vpCategory.adapter = TopCategoryViewPagerAdapter(childFragmentManager, list, 2)
        val tabLayout = view.findViewById<TabLayout>(R.id.tlSubCategory)
        tabLayout.setupWithViewPager(vpCategory)
        return view

    }
}
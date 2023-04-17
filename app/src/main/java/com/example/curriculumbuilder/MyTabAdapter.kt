package com.example.curriculumbuilder

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyTabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
//            1 -> WorkFragment()
//            2 -> ContactFragment()
//            3 -> HelpFragment()
            else -> Fragment()

        }
    }
}
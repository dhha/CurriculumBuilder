package com.example.curriculumbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TableLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.curriculumbuilder.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tx: FragmentTransaction
    private lateinit var fragment: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myTabAdapter = MyTabAdapter(this)
        binding.vpager.adapter = myTabAdapter
        binding.tlayout.tabGravity = TabLayout.GRAVITY_FILL

        TabLayoutMediator(binding.tlayout,binding.vpager){tab,position->
            when(position){
                0->{
                    tab.text="Home"
                    tab.setIcon(R.drawable.baseline_home_24)
                }
                1->{
                    tab.text="About"
                    tab.setIcon(R.drawable.baseline_person_24)
                }
                2->{
                    tab.text="Work"
                    tab.setIcon(R.drawable.baseline_newspaper_24)
                }
                3->{
                    tab.text = "Contact"
                    tab.setIcon(R.drawable.baseline_connect_without_contact_24)
                }
            }
        }.attach()
    }
}
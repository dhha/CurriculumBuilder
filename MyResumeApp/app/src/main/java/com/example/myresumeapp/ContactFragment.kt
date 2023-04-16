package com.example.myresumeapp

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import com.example.myresumeapp.databinding.FragmentContactBinding
import com.example.myresumeapp.databinding.FragmentSecondBinding

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_contact, container, false)

        _binding= FragmentContactBinding.inflate(inflater,container,false)

        binding.btnOverflow.setOnClickListener{
            val ovrflow = PopupMenu(it.context,view)
            ovrflow.menuInflater.inflate(R.menu.option_menu, ovrflow.menu)
            ovrflow.gravity = Gravity.CENTER
            ovrflow.show()
        }
        return binding.root


    }


}
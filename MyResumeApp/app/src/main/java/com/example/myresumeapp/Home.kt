package com.example.myresumeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

import com.example.myresumeapp.databinding.FragmentSecondBinding

class Home : Fragment() {

    private var _binding: FragmentSecondBinding? = null
//    private lateinit var listView: ListView
//    private lateinit var listView1: ListView
//    private lateinit var adapter: ArrayAdapter<String>
//    private lateinit var adapterEdu : ArrayAdapter<String>
//    private  val myList = arrayOf(" Data Scientist with a Master's degree in Computer Science and 3 years of experience in the field, \n" +
//            "I concentrate on developing innovative data-driven solutions to create tangible impacts.\n" +
//            "My expertise includes machine learning, deep learning, big data, visualization tools, and natural language processing. \n" +
//            "I have successfully collaborated on various data science projects with clients from diverse industries.\n" +
//            "In addition to my practical experience, I have published five research papers in Natural Language Processing, \n" +
//            "reflecting my commitment to advancing the field. Through my work with prestigious organizations \n" +
//            "such as UNDP Jordan and Open Insights, I have contributed to projects that significantly improved businesses and communities. \n" +
//            "As a data science lecturer at PHI Science, I shared my knowledge and expertise with future data scientists.\n" +
//            "I am currently pursuing a second Master's degree in Data Science and seeking opportunities \n" +
//            "to collaborate with organizations that recognize the value of data-driven decision-making. \n" +
//            "My goal is to contribute to meaningful outcomes and drive success in the organizations I work with.\n" +
//            "Please feel free to connect with me to discuss how we can collaborate, create valuable insights, and make a difference through data-driven solutions.", "Institu Universitaire Quisqueya Amerique, I studied Computer Sciences from 2012 - 2016,I have graduated with a Bachelor Degree in Sciences","Maharishi International currently doing my Masters Degree in Computer Sciences from August 2022 to April 2025")

   // private val edu = arrayOf()
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)

//        listView = _binding!!.myListview
//        listView1=_binding!!.myListview
//        adapter= ArrayAdapter(requireActivity(),android.R.layout.simple_list_item_1,myList)
//       // adapterEdu= ArrayAdapter(requireActivity(),android.R.layout.simple_list_item_2,edu)
//
//        listView.adapter=adapter
       // listView.adapter=adapterEdu
        return binding.root



    }



//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonSecond.setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
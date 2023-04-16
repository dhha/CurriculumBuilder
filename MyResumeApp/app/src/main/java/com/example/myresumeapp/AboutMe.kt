package com.example.myresumeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myresumeapp.databinding.FragmentFirstBinding
import com.example.myresumeapp.databinding.LayoutListBinding


class AboutMe : Fragment() {

    private var _binding: LayoutListBinding? = null
//    private lateinit var listView: ListView
//    private lateinit var adapter: ArrayAdapter<String>
//   private  val myList = arrayOf("Experienced Java Developer  Mary Ellis ","Please have a look to my resume")

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = LayoutListBinding.inflate(inflater, container, false)
        //listView= _binding!!.myListView

      //  adapter =ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1, myList)
      //  listView.adapter=adapter



        return binding.root



    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
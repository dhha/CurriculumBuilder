package com.example.curriculumbuilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculumbuilder.databinding.FragmentContactBinding
import com.example.curriculumbuilder.databinding.FragmentWorkBinding

class WorkFragment : Fragment() {
    private lateinit var binding: FragmentWorkBinding
    private lateinit var listData: ArrayList<ItemData>
    private lateinit var adapter: WorkAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_work, container, false)
        binding = FragmentWorkBinding.bind(view)

        listData = ArrayList<ItemData>()
        listData.add(ItemData("Product manager", "From 2010 - 2012", R.drawable.miulogo))
        listData.add(ItemData("Director", "From 2010 - 2012", R.drawable.miulogo))
        listData.add(ItemData("SEO", "From 2010 - 2012", R.drawable.miulogo))

        adapter = WorkAdapter(listData) {
            AlertDialog.Builder(requireContext())
                .setTitle("Confirm")
                .setMessage("Do you want to remove this experience?")
                .setPositiveButton("Remove") {view, id ->
                    adapter.remove(it)
                }
                .setNegativeButton("Cancel") { _, _ -> }.show()

        }
        binding.works.layoutManager = LinearLayoutManager(requireContext())
        binding.works.adapter = adapter

        binding.fabs.setOnClickListener {
            var txName = EditText(requireContext())
            txName.setHint("Enter work name")
            AlertDialog.Builder(requireContext())
                .setTitle("Add work experience")
                .setView(txName)
                .setPositiveButton("Add") {view, id ->
                    var item = ItemData(txName.text.toString(), "From 2010 - 2012", R.drawable.miulogo)
                    adapter.add(item)
                }
                .setNegativeButton("Cancel") { _, _ -> }.show()
        }
        return binding.root
    }

}
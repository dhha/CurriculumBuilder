package com.example.curriculumbuilder

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculumbuilder.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    private lateinit var binding: FragmentAboutBinding
    private lateinit var listData: ArrayList<ItemData>
    private lateinit var adapter: EducationAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_about, container, false)
        binding = FragmentAboutBinding.bind(view)
        // Inflate the layout for this fragment
        listData = ArrayList<ItemData>()
        listData.add(ItemData("High School", "From 2010 - 2012", R.drawable.miulogo))
        listData.add(ItemData("College", "From 2010 - 2012", R.drawable.miulogo))
        listData.add(ItemData("Univer sity 3", "From 2010 - 2012", R.drawable.miulogo))

        adapter = EducationAdapter(listData) {
            AlertDialog.Builder(requireContext())
                .setTitle("Confirm")
                .setMessage("Do you want to remove this education?")
                .setPositiveButton("Remove") {view, id ->
                    adapter.remove(it)
                }
                .setNegativeButton("Cancel") { _, _ -> }.show()

        }
        binding.educations.layoutManager = LinearLayoutManager(requireContext())
        binding.educations.adapter = adapter

        binding.fabs.setOnClickListener {
            var txName = EditText(requireContext())
            txName.setHint("Enter name")

            AlertDialog.Builder(requireContext())
                .setTitle("Add education")
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
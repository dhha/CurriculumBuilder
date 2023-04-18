package com.example.curriculumbuilder

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.curriculumbuilder.databinding.FragmentContactBinding

class ContactFragment : Fragment() {
    private lateinit var binding: FragmentContactBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_contact, container, false)
        binding = FragmentContactBinding.bind(view)
        // Inflate the layout for this fragment
        binding.location.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=an+address+city"))
            startActivity(intent);
        }

        binding.phone.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"))
            startActivity(intent);
        }

        binding.email.setOnClickListener {
            var intent: Intent = Intent(Intent.ACTION_SEND, Uri.parse("mailto:example@gmail.com"))
//            startActivity(intent);
        }

        binding.facebook.setOnClickListener {
            val webView = binding.webView
            webView.webViewClient = WebViewClient()
            webView.settings.javaScriptEnabled = true
            webView.settings.builtInZoomControls = true
            webView.loadUrl("https://facebook.com")
        }
        return binding.root
    }
}
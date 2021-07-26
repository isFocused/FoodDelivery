package com.example.fooddelivery.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fooddelivery.databinding.FragmentPagerBinding
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment : Fragment() {

    private val stringArray: List<String> = listOf("Всё", "Фаст-фуд", "Десерты")
    private lateinit var binding: FragmentPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagerBinding.inflate(inflater, container, false)
        binding.vpMain.adapter = ViewPagerAdapter(this).apply {
            addFragment(PageFragment())
            addFragment(PageFragment())
            addFragment(PageFragment())
        }
        TabLayoutMediator(binding.tbMain, binding.vpMain) { tab, position ->
            tab.text = stringArray[position]
        }.attach()
        return binding.root
    }
}
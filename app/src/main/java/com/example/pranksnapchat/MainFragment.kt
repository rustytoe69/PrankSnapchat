package com.example.pranksnapchat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pranksnapchat.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    //list of snaps to connect to the adapter instance
    val snaps = listOf(Snap("Brock","25m",R.drawable.brokpfp,false),
        Snap("loverboy","2m",R.drawable.alexpfp,false),
        Snap("former roomate", "41m",R.drawable.ryanpfp,false))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root

        //adapter instance
        val mAdapter = SnapAdapter(snaps)
        binding.recyclerView.adapter=mAdapter




        return rootView
    }
}
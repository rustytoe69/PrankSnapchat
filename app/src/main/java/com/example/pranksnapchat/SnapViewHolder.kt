package com.example.pranksnapchat

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pranksnapchat.databinding.ListItemLayoutBinding

class SnapViewHolder(val binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentSnap: Snap

    fun bindSnap(snap: Snap) {
        currentSnap = snap
        binding.usernameTextView.text = currentSnap.username
        binding.timeSentTextView.text = currentSnap.timeSent
        binding.profilePicView.setImageResource(currentSnap.profilePicResourceId)
        setSnapStatus()
    }

    fun setSnapStatus(){
        binding.statusImageView.setImageResource(currentSnap.snapStatusIconResourceId)
        binding.statusTextView.text = currentSnap.snapStatus
        binding.statusTextView.setTextColor(currentSnap.snapStatusTextColor)
    }

    init {
        binding.root.setOnClickListener { view ->
            currentSnap.opened=true
            setSnapStatus()
            binding.root.findNavController().navigate(R.id.action_mainFragment_to_prankSnapFragment)
        }
    }
}
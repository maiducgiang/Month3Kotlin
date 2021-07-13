package com.example.connectdatauser.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.connectdatauser.R
import com.example.connectdatauser.UserData
import com.example.connectdatauser.databinding.FragmentGetDataBinding


class GetDataFragment : Fragment() {
    private lateinit var binding: FragmentGetDataBinding
    private var arrUser: ArrayList<UserData> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_get_data, container, false)
        val view: View = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonGetNext.setOnClickListener {
            val action = GetDataFragmentDirections.actionGetDataFragmentToShowFragment()
            findNavController().navigate(action)

        }
    }

}
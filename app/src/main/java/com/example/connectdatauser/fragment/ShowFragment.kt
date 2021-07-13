package com.example.connectdatauser.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.connectdatauser.Adapter
import com.example.connectdatauser.R
import com.example.connectdatauser.UserData
import com.example.connectdatauser.databinding.FragmentShowBinding

class ShowFragment : Fragment() {
    private lateinit var binding: FragmentShowBinding
    private var arrUser: ArrayList<UserData> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_show, container, false)
        val view: View = binding.root
        createListUsers()

        binding.revShowShow.adapter = Adapter(arrUser)
        binding.revShowShow.layoutManager = LinearLayoutManager(context)
        return view
    }


    private fun createListUsers() : ArrayList<UserData>{
        arrUser.add(UserData("Nguyen Manh Duy", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Mai Duc Giang", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Do Ngoc Anh", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Nguyen Van Linh", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Nguyen Quoc Khanh", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Nguyen Manh Duy", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Mai Duc Giang", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Do Ngoc Anh", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Nguyen Van Linh", "Deadline ngay mai", "nhau khong"))
        arrUser.add(UserData("Nguyen Quoc Khanh", "Deadline ngay mai", "nhau khong"))
        return arrUser
    }
}
package com.example.connectdatauser

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.connectdatauser.databinding.ItemBinding

class Adapter(val arrUser: ArrayList<UserData>) : RecyclerView.Adapter<Adapter.Viewholder>() {
    private var statusFarvorite = 1;

    class Viewholder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {}
    private lateinit var fragment: Fragment
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.Viewholder {
        val layoutInflater = LayoutInflater.from(parent.context)
        fragment = FragmentManager.findFragment(parent)
        val binding = ItemBinding.inflate(layoutInflater, parent, false)

        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.Viewholder, position: Int) {
        val user: UserData = arrUser.get(position)
        if (user != null) {

            holder.binding.textItemLogin.text = user.login
            holder.binding.textItemType.text = user.type
            holder.binding.textItemUrl.text = user.url
            holder.binding.textItemId.text = "1"
        }
    }

    override fun getItemCount(): Int {
        if (arrUser != null) {
            return arrUser.size
        }
        return 0
    }
}

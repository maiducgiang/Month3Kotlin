package com.example.connectdatauser.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.connectdatauser.R

public class ShowFragmentDirections private constructor() {
  public companion object {
    public fun actionShowFragmentToGetDataFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_showFragment_to_getDataFragment)
  }
}

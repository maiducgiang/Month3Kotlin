package com.example.connectdatauser.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.connectdatauser.R

public class GetDataFragmentDirections private constructor() {
  public companion object {
    public fun actionGetDataFragmentToShowFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_getDataFragment_to_showFragment)
  }
}

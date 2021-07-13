package com.example.connectdatauser;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.connectdatauser.databinding.ActivityMainBindingImpl;
import com.example.connectdatauser.databinding.FragmentGetDataBindingImpl;
import com.example.connectdatauser.databinding.FragmentShowBindingImpl;
import com.example.connectdatauser.databinding.ItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTGETDATA = 2;

  private static final int LAYOUT_FRAGMENTSHOW = 3;

  private static final int LAYOUT_ITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.connectdatauser.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.connectdatauser.R.layout.fragment_get_data, LAYOUT_FRAGMENTGETDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.connectdatauser.R.layout.fragment_show, LAYOUT_FRAGMENTSHOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.connectdatauser.R.layout.item, LAYOUT_ITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGETDATA: {
          if ("layout/fragment_get_data_0".equals(tag)) {
            return new FragmentGetDataBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_get_data is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOW: {
          if ("layout/fragment_show_0".equals(tag)) {
            return new FragmentShowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_show is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEM: {
          if ("layout/item_0".equals(tag)) {
            return new ItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.example.connectdatauser.R.layout.activity_main);
      sKeys.put("layout/fragment_get_data_0", com.example.connectdatauser.R.layout.fragment_get_data);
      sKeys.put("layout/fragment_show_0", com.example.connectdatauser.R.layout.fragment_show);
      sKeys.put("layout/item_0", com.example.connectdatauser.R.layout.item);
    }
  }
}
// Generated by view binder compiler. Do not edit!
package com.example.sampahmasgabungan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.sampahmasgabungan.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMyOrdersBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton iBack;

  @NonNull
  public final TextView tMyOrdersItems;

  @NonNull
  public final TextView tMyOrdersTitle;

  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final ViewPager2 viewPager;

  private ActivityMyOrdersBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton iBack,
      @NonNull TextView tMyOrdersItems, @NonNull TextView tMyOrdersTitle,
      @NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.iBack = iBack;
    this.tMyOrdersItems = tMyOrdersItems;
    this.tMyOrdersTitle = tMyOrdersTitle;
    this.tabLayout = tabLayout;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMyOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_my_orders, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMyOrdersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iBack;
      ImageButton iBack = ViewBindings.findChildViewById(rootView, id);
      if (iBack == null) {
        break missingId;
      }

      id = R.id.tMyOrdersItems;
      TextView tMyOrdersItems = ViewBindings.findChildViewById(rootView, id);
      if (tMyOrdersItems == null) {
        break missingId;
      }

      id = R.id.tMyOrdersTitle;
      TextView tMyOrdersTitle = ViewBindings.findChildViewById(rootView, id);
      if (tMyOrdersTitle == null) {
        break missingId;
      }

      id = R.id.tab_layout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager2 viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityMyOrdersBinding((RelativeLayout) rootView, iBack, tMyOrdersItems,
          tMyOrdersTitle, tabLayout, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
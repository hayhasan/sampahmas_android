// Generated by view binder compiler. Do not edit!
package com.example.sampahmasgabungan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sampahmasgabungan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMarketViewBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ConstraintLayout cTop;

  @NonNull
  public final ImageView iLogo;

  @NonNull
  public final TextView idtext1;

  @NonNull
  public final TextView idtext2;

  @NonNull
  public final TextView idtext4;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout llNewestProduct;

  @NonNull
  public final CardView matrialCardView;

  @NonNull
  public final RecyclerView rvNewestList;

  @NonNull
  public final RecyclerView rvOfficialLists;

  @NonNull
  public final ScrollView scrollView3;

  @NonNull
  public final SearchView searchid;

  private FragmentMarketViewBinding(@NonNull FrameLayout rootView, @NonNull ConstraintLayout cTop,
      @NonNull ImageView iLogo, @NonNull TextView idtext1, @NonNull TextView idtext2,
      @NonNull TextView idtext4, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout3,
      @NonNull LinearLayout llNewestProduct, @NonNull CardView matrialCardView,
      @NonNull RecyclerView rvNewestList, @NonNull RecyclerView rvOfficialLists,
      @NonNull ScrollView scrollView3, @NonNull SearchView searchid) {
    this.rootView = rootView;
    this.cTop = cTop;
    this.iLogo = iLogo;
    this.idtext1 = idtext1;
    this.idtext2 = idtext2;
    this.idtext4 = idtext4;
    this.imageView2 = imageView2;
    this.linearLayout3 = linearLayout3;
    this.llNewestProduct = llNewestProduct;
    this.matrialCardView = matrialCardView;
    this.rvNewestList = rvNewestList;
    this.rvOfficialLists = rvOfficialLists;
    this.scrollView3 = scrollView3;
    this.searchid = searchid;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMarketViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMarketViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_market_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMarketViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cTop;
      ConstraintLayout cTop = ViewBindings.findChildViewById(rootView, id);
      if (cTop == null) {
        break missingId;
      }

      id = R.id.iLogo;
      ImageView iLogo = ViewBindings.findChildViewById(rootView, id);
      if (iLogo == null) {
        break missingId;
      }

      id = R.id.idtext1;
      TextView idtext1 = ViewBindings.findChildViewById(rootView, id);
      if (idtext1 == null) {
        break missingId;
      }

      id = R.id.idtext2;
      TextView idtext2 = ViewBindings.findChildViewById(rootView, id);
      if (idtext2 == null) {
        break missingId;
      }

      id = R.id.idtext4;
      TextView idtext4 = ViewBindings.findChildViewById(rootView, id);
      if (idtext4 == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.llNewestProduct;
      LinearLayout llNewestProduct = ViewBindings.findChildViewById(rootView, id);
      if (llNewestProduct == null) {
        break missingId;
      }

      id = R.id.matrialCardView;
      CardView matrialCardView = ViewBindings.findChildViewById(rootView, id);
      if (matrialCardView == null) {
        break missingId;
      }

      id = R.id.rvNewestList;
      RecyclerView rvNewestList = ViewBindings.findChildViewById(rootView, id);
      if (rvNewestList == null) {
        break missingId;
      }

      id = R.id.rvOfficialLists;
      RecyclerView rvOfficialLists = ViewBindings.findChildViewById(rootView, id);
      if (rvOfficialLists == null) {
        break missingId;
      }

      id = R.id.scrollView3;
      ScrollView scrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView3 == null) {
        break missingId;
      }

      id = R.id.searchid;
      SearchView searchid = ViewBindings.findChildViewById(rootView, id);
      if (searchid == null) {
        break missingId;
      }

      return new FragmentMarketViewBinding((FrameLayout) rootView, cTop, iLogo, idtext1, idtext2,
          idtext4, imageView2, linearLayout3, llNewestProduct, matrialCardView, rvNewestList,
          rvOfficialLists, scrollView3, searchid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
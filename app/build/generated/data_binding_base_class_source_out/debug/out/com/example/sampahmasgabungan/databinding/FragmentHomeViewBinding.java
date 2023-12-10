// Generated by view binder compiler. Do not edit!
package com.example.sampahmasgabungan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sampahmasgabungan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeViewBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final CardView cvKartu;

  @NonNull
  public final ImageView iCopy;

  @NonNull
  public final ImageButton iDailyMission;

  @NonNull
  public final ImageButton iExchange;

  @NonNull
  public final ImageView iKartuId;

  @NonNull
  public final ImageView iLogo;

  @NonNull
  public final ImageButton iNearby;

  @NonNull
  public final ImageView iPoints;

  @NonNull
  public final ImageButton iSeeAll;

  @NonNull
  public final ImageButton ibMail;

  @NonNull
  public final ImageButton ibSettings;

  @NonNull
  public final TextView idtext1;

  @NonNull
  public final TextView idtext2;

  @NonNull
  public final TextView idtext4;

  @NonNull
  public final LinearLayout lStore;

  @NonNull
  public final LinearLayout llOfficialProduct;

  @NonNull
  public final LinearLayout llmenu;

  @NonNull
  public final CardView matrialCardView;

  @NonNull
  public final RecyclerView rvOfficialList;

  @NonNull
  public final RecyclerView rvRecommendedLists;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final SearchView searchid;

  @NonNull
  public final TextView tDailyMission;

  @NonNull
  public final TextView tExchange;

  @NonNull
  public final TextView tNearby;

  @NonNull
  public final TextView tSeeAll;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPoints;

  @NonNull
  public final TextView tvSaldo;

  @NonNull
  public final TextView tvUid;

  private FragmentHomeViewBinding(@NonNull FrameLayout rootView, @NonNull CardView cvKartu,
      @NonNull ImageView iCopy, @NonNull ImageButton iDailyMission, @NonNull ImageButton iExchange,
      @NonNull ImageView iKartuId, @NonNull ImageView iLogo, @NonNull ImageButton iNearby,
      @NonNull ImageView iPoints, @NonNull ImageButton iSeeAll, @NonNull ImageButton ibMail,
      @NonNull ImageButton ibSettings, @NonNull TextView idtext1, @NonNull TextView idtext2,
      @NonNull TextView idtext4, @NonNull LinearLayout lStore,
      @NonNull LinearLayout llOfficialProduct, @NonNull LinearLayout llmenu,
      @NonNull CardView matrialCardView, @NonNull RecyclerView rvOfficialList,
      @NonNull RecyclerView rvRecommendedLists, @NonNull ScrollView scrollView2,
      @NonNull SearchView searchid, @NonNull TextView tDailyMission, @NonNull TextView tExchange,
      @NonNull TextView tNearby, @NonNull TextView tSeeAll, @NonNull TextView tvName,
      @NonNull TextView tvPoints, @NonNull TextView tvSaldo, @NonNull TextView tvUid) {
    this.rootView = rootView;
    this.cvKartu = cvKartu;
    this.iCopy = iCopy;
    this.iDailyMission = iDailyMission;
    this.iExchange = iExchange;
    this.iKartuId = iKartuId;
    this.iLogo = iLogo;
    this.iNearby = iNearby;
    this.iPoints = iPoints;
    this.iSeeAll = iSeeAll;
    this.ibMail = ibMail;
    this.ibSettings = ibSettings;
    this.idtext1 = idtext1;
    this.idtext2 = idtext2;
    this.idtext4 = idtext4;
    this.lStore = lStore;
    this.llOfficialProduct = llOfficialProduct;
    this.llmenu = llmenu;
    this.matrialCardView = matrialCardView;
    this.rvOfficialList = rvOfficialList;
    this.rvRecommendedLists = rvRecommendedLists;
    this.scrollView2 = scrollView2;
    this.searchid = searchid;
    this.tDailyMission = tDailyMission;
    this.tExchange = tExchange;
    this.tNearby = tNearby;
    this.tSeeAll = tSeeAll;
    this.tvName = tvName;
    this.tvPoints = tvPoints;
    this.tvSaldo = tvSaldo;
    this.tvUid = tvUid;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cvKartu;
      CardView cvKartu = ViewBindings.findChildViewById(rootView, id);
      if (cvKartu == null) {
        break missingId;
      }

      id = R.id.iCopy;
      ImageView iCopy = ViewBindings.findChildViewById(rootView, id);
      if (iCopy == null) {
        break missingId;
      }

      id = R.id.iDailyMission;
      ImageButton iDailyMission = ViewBindings.findChildViewById(rootView, id);
      if (iDailyMission == null) {
        break missingId;
      }

      id = R.id.iExchange;
      ImageButton iExchange = ViewBindings.findChildViewById(rootView, id);
      if (iExchange == null) {
        break missingId;
      }

      id = R.id.iKartuId;
      ImageView iKartuId = ViewBindings.findChildViewById(rootView, id);
      if (iKartuId == null) {
        break missingId;
      }

      id = R.id.iLogo;
      ImageView iLogo = ViewBindings.findChildViewById(rootView, id);
      if (iLogo == null) {
        break missingId;
      }

      id = R.id.iNearby;
      ImageButton iNearby = ViewBindings.findChildViewById(rootView, id);
      if (iNearby == null) {
        break missingId;
      }

      id = R.id.iPoints;
      ImageView iPoints = ViewBindings.findChildViewById(rootView, id);
      if (iPoints == null) {
        break missingId;
      }

      id = R.id.iSeeAll;
      ImageButton iSeeAll = ViewBindings.findChildViewById(rootView, id);
      if (iSeeAll == null) {
        break missingId;
      }

      id = R.id.ibMail;
      ImageButton ibMail = ViewBindings.findChildViewById(rootView, id);
      if (ibMail == null) {
        break missingId;
      }

      id = R.id.ibSettings;
      ImageButton ibSettings = ViewBindings.findChildViewById(rootView, id);
      if (ibSettings == null) {
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

      id = R.id.lStore;
      LinearLayout lStore = ViewBindings.findChildViewById(rootView, id);
      if (lStore == null) {
        break missingId;
      }

      id = R.id.llOfficialProduct;
      LinearLayout llOfficialProduct = ViewBindings.findChildViewById(rootView, id);
      if (llOfficialProduct == null) {
        break missingId;
      }

      id = R.id.llmenu;
      LinearLayout llmenu = ViewBindings.findChildViewById(rootView, id);
      if (llmenu == null) {
        break missingId;
      }

      id = R.id.matrialCardView;
      CardView matrialCardView = ViewBindings.findChildViewById(rootView, id);
      if (matrialCardView == null) {
        break missingId;
      }

      id = R.id.rvOfficialList;
      RecyclerView rvOfficialList = ViewBindings.findChildViewById(rootView, id);
      if (rvOfficialList == null) {
        break missingId;
      }

      id = R.id.rvRecommendedLists;
      RecyclerView rvRecommendedLists = ViewBindings.findChildViewById(rootView, id);
      if (rvRecommendedLists == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.searchid;
      SearchView searchid = ViewBindings.findChildViewById(rootView, id);
      if (searchid == null) {
        break missingId;
      }

      id = R.id.tDailyMission;
      TextView tDailyMission = ViewBindings.findChildViewById(rootView, id);
      if (tDailyMission == null) {
        break missingId;
      }

      id = R.id.tExchange;
      TextView tExchange = ViewBindings.findChildViewById(rootView, id);
      if (tExchange == null) {
        break missingId;
      }

      id = R.id.tNearby;
      TextView tNearby = ViewBindings.findChildViewById(rootView, id);
      if (tNearby == null) {
        break missingId;
      }

      id = R.id.tSeeAll;
      TextView tSeeAll = ViewBindings.findChildViewById(rootView, id);
      if (tSeeAll == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvPoints;
      TextView tvPoints = ViewBindings.findChildViewById(rootView, id);
      if (tvPoints == null) {
        break missingId;
      }

      id = R.id.tvSaldo;
      TextView tvSaldo = ViewBindings.findChildViewById(rootView, id);
      if (tvSaldo == null) {
        break missingId;
      }

      id = R.id.tvUid;
      TextView tvUid = ViewBindings.findChildViewById(rootView, id);
      if (tvUid == null) {
        break missingId;
      }

      return new FragmentHomeViewBinding((FrameLayout) rootView, cvKartu, iCopy, iDailyMission,
          iExchange, iKartuId, iLogo, iNearby, iPoints, iSeeAll, ibMail, ibSettings, idtext1,
          idtext2, idtext4, lStore, llOfficialProduct, llmenu, matrialCardView, rvOfficialList,
          rvRecommendedLists, scrollView2, searchid, tDailyMission, tExchange, tNearby, tSeeAll,
          tvName, tvPoints, tvSaldo, tvUid);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
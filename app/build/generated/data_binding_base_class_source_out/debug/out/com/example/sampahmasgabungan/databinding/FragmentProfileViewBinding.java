// Generated by view binder compiler. Do not edit!
package com.example.sampahmasgabungan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sampahmasgabungan.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileViewBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final CardView cvDetailsAccount;

  @NonNull
  public final CardView cvProfilePicture;

  @NonNull
  public final ImageView iAddPhoto;

  @NonNull
  public final ImageView iBackgrounds;

  @NonNull
  public final ImageView iDataPerDay;

  @NonNull
  public final ImageView iDataPerDays;

  @NonNull
  public final ImageButton iDelivery;

  @NonNull
  public final ImageView iEditProfile;

  @NonNull
  public final ImageView iLogo;

  @NonNull
  public final ImageButton iPackaging;

  @NonNull
  public final ImageView iPercentage;

  @NonNull
  public final ImageView iPoints;

  @NonNull
  public final ImageView iProfilePicture;

  @NonNull
  public final ImageButton iRating;

  @NonNull
  public final ImageView iRegistered;

  @NonNull
  public final ImageButton iUnpaid;

  @NonNull
  public final ImageView iUsername;

  @NonNull
  public final LinearLayout lRegistered;

  @NonNull
  public final LinearLayout lTotalPoints;

  @NonNull
  public final LinearLayout lUsername;

  @NonNull
  public final LinearLayout llmyOrders;

  @NonNull
  public final TextView tBottlesAccumulated;

  @NonNull
  public final TextView tBottlesPerDay;

  @NonNull
  public final TextView tDelivery;

  @NonNull
  public final TextView tMyOrders;

  @NonNull
  public final TextView tPackaging;

  @NonNull
  public final TextView tPerDay;

  @NonNull
  public final TextView tPerDays;

  @NonNull
  public final TextView tPointAccumulated;

  @NonNull
  public final TextView tPointsAccumulated;

  @NonNull
  public final TextView tPointsPerDay;

  @NonNull
  public final TextView tRating;

  @NonNull
  public final TextView tUnpaid;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvNik;

  @NonNull
  public final TextView tvPoints;

  private FragmentProfileViewBinding(@NonNull FrameLayout rootView,
      @NonNull CardView cvDetailsAccount, @NonNull CardView cvProfilePicture,
      @NonNull ImageView iAddPhoto, @NonNull ImageView iBackgrounds, @NonNull ImageView iDataPerDay,
      @NonNull ImageView iDataPerDays, @NonNull ImageButton iDelivery,
      @NonNull ImageView iEditProfile, @NonNull ImageView iLogo, @NonNull ImageButton iPackaging,
      @NonNull ImageView iPercentage, @NonNull ImageView iPoints,
      @NonNull ImageView iProfilePicture, @NonNull ImageButton iRating,
      @NonNull ImageView iRegistered, @NonNull ImageButton iUnpaid, @NonNull ImageView iUsername,
      @NonNull LinearLayout lRegistered, @NonNull LinearLayout lTotalPoints,
      @NonNull LinearLayout lUsername, @NonNull LinearLayout llmyOrders,
      @NonNull TextView tBottlesAccumulated, @NonNull TextView tBottlesPerDay,
      @NonNull TextView tDelivery, @NonNull TextView tMyOrders, @NonNull TextView tPackaging,
      @NonNull TextView tPerDay, @NonNull TextView tPerDays, @NonNull TextView tPointAccumulated,
      @NonNull TextView tPointsAccumulated, @NonNull TextView tPointsPerDay,
      @NonNull TextView tRating, @NonNull TextView tUnpaid, @NonNull TextView textView12,
      @NonNull TextView textView13, @NonNull TextView textView4, @NonNull TextView textView5,
      @NonNull TextView textView6, @NonNull TextView tvName, @NonNull TextView tvNik,
      @NonNull TextView tvPoints) {
    this.rootView = rootView;
    this.cvDetailsAccount = cvDetailsAccount;
    this.cvProfilePicture = cvProfilePicture;
    this.iAddPhoto = iAddPhoto;
    this.iBackgrounds = iBackgrounds;
    this.iDataPerDay = iDataPerDay;
    this.iDataPerDays = iDataPerDays;
    this.iDelivery = iDelivery;
    this.iEditProfile = iEditProfile;
    this.iLogo = iLogo;
    this.iPackaging = iPackaging;
    this.iPercentage = iPercentage;
    this.iPoints = iPoints;
    this.iProfilePicture = iProfilePicture;
    this.iRating = iRating;
    this.iRegistered = iRegistered;
    this.iUnpaid = iUnpaid;
    this.iUsername = iUsername;
    this.lRegistered = lRegistered;
    this.lTotalPoints = lTotalPoints;
    this.lUsername = lUsername;
    this.llmyOrders = llmyOrders;
    this.tBottlesAccumulated = tBottlesAccumulated;
    this.tBottlesPerDay = tBottlesPerDay;
    this.tDelivery = tDelivery;
    this.tMyOrders = tMyOrders;
    this.tPackaging = tPackaging;
    this.tPerDay = tPerDay;
    this.tPerDays = tPerDays;
    this.tPointAccumulated = tPointAccumulated;
    this.tPointsAccumulated = tPointsAccumulated;
    this.tPointsPerDay = tPointsPerDay;
    this.tRating = tRating;
    this.tUnpaid = tUnpaid;
    this.textView12 = textView12;
    this.textView13 = textView13;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.tvName = tvName;
    this.tvNik = tvNik;
    this.tvPoints = tvPoints;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cvDetailsAccount;
      CardView cvDetailsAccount = ViewBindings.findChildViewById(rootView, id);
      if (cvDetailsAccount == null) {
        break missingId;
      }

      id = R.id.cvProfilePicture;
      CardView cvProfilePicture = ViewBindings.findChildViewById(rootView, id);
      if (cvProfilePicture == null) {
        break missingId;
      }

      id = R.id.iAddPhoto;
      ImageView iAddPhoto = ViewBindings.findChildViewById(rootView, id);
      if (iAddPhoto == null) {
        break missingId;
      }

      id = R.id.iBackgrounds;
      ImageView iBackgrounds = ViewBindings.findChildViewById(rootView, id);
      if (iBackgrounds == null) {
        break missingId;
      }

      id = R.id.iDataPerDay;
      ImageView iDataPerDay = ViewBindings.findChildViewById(rootView, id);
      if (iDataPerDay == null) {
        break missingId;
      }

      id = R.id.iDataPerDays;
      ImageView iDataPerDays = ViewBindings.findChildViewById(rootView, id);
      if (iDataPerDays == null) {
        break missingId;
      }

      id = R.id.iDelivery;
      ImageButton iDelivery = ViewBindings.findChildViewById(rootView, id);
      if (iDelivery == null) {
        break missingId;
      }

      id = R.id.iEditProfile;
      ImageView iEditProfile = ViewBindings.findChildViewById(rootView, id);
      if (iEditProfile == null) {
        break missingId;
      }

      id = R.id.iLogo;
      ImageView iLogo = ViewBindings.findChildViewById(rootView, id);
      if (iLogo == null) {
        break missingId;
      }

      id = R.id.iPackaging;
      ImageButton iPackaging = ViewBindings.findChildViewById(rootView, id);
      if (iPackaging == null) {
        break missingId;
      }

      id = R.id.iPercentage;
      ImageView iPercentage = ViewBindings.findChildViewById(rootView, id);
      if (iPercentage == null) {
        break missingId;
      }

      id = R.id.iPoints;
      ImageView iPoints = ViewBindings.findChildViewById(rootView, id);
      if (iPoints == null) {
        break missingId;
      }

      id = R.id.iProfilePicture;
      ImageView iProfilePicture = ViewBindings.findChildViewById(rootView, id);
      if (iProfilePicture == null) {
        break missingId;
      }

      id = R.id.iRating;
      ImageButton iRating = ViewBindings.findChildViewById(rootView, id);
      if (iRating == null) {
        break missingId;
      }

      id = R.id.iRegistered;
      ImageView iRegistered = ViewBindings.findChildViewById(rootView, id);
      if (iRegistered == null) {
        break missingId;
      }

      id = R.id.iUnpaid;
      ImageButton iUnpaid = ViewBindings.findChildViewById(rootView, id);
      if (iUnpaid == null) {
        break missingId;
      }

      id = R.id.iUsername;
      ImageView iUsername = ViewBindings.findChildViewById(rootView, id);
      if (iUsername == null) {
        break missingId;
      }

      id = R.id.lRegistered;
      LinearLayout lRegistered = ViewBindings.findChildViewById(rootView, id);
      if (lRegistered == null) {
        break missingId;
      }

      id = R.id.lTotalPoints;
      LinearLayout lTotalPoints = ViewBindings.findChildViewById(rootView, id);
      if (lTotalPoints == null) {
        break missingId;
      }

      id = R.id.lUsername;
      LinearLayout lUsername = ViewBindings.findChildViewById(rootView, id);
      if (lUsername == null) {
        break missingId;
      }

      id = R.id.llmyOrders;
      LinearLayout llmyOrders = ViewBindings.findChildViewById(rootView, id);
      if (llmyOrders == null) {
        break missingId;
      }

      id = R.id.tBottlesAccumulated;
      TextView tBottlesAccumulated = ViewBindings.findChildViewById(rootView, id);
      if (tBottlesAccumulated == null) {
        break missingId;
      }

      id = R.id.tBottlesPerDay;
      TextView tBottlesPerDay = ViewBindings.findChildViewById(rootView, id);
      if (tBottlesPerDay == null) {
        break missingId;
      }

      id = R.id.tDelivery;
      TextView tDelivery = ViewBindings.findChildViewById(rootView, id);
      if (tDelivery == null) {
        break missingId;
      }

      id = R.id.tMyOrders;
      TextView tMyOrders = ViewBindings.findChildViewById(rootView, id);
      if (tMyOrders == null) {
        break missingId;
      }

      id = R.id.tPackaging;
      TextView tPackaging = ViewBindings.findChildViewById(rootView, id);
      if (tPackaging == null) {
        break missingId;
      }

      id = R.id.tPerDay;
      TextView tPerDay = ViewBindings.findChildViewById(rootView, id);
      if (tPerDay == null) {
        break missingId;
      }

      id = R.id.tPerDays;
      TextView tPerDays = ViewBindings.findChildViewById(rootView, id);
      if (tPerDays == null) {
        break missingId;
      }

      id = R.id.tPointAccumulated;
      TextView tPointAccumulated = ViewBindings.findChildViewById(rootView, id);
      if (tPointAccumulated == null) {
        break missingId;
      }

      id = R.id.tPointsAccumulated;
      TextView tPointsAccumulated = ViewBindings.findChildViewById(rootView, id);
      if (tPointsAccumulated == null) {
        break missingId;
      }

      id = R.id.tPointsPerDay;
      TextView tPointsPerDay = ViewBindings.findChildViewById(rootView, id);
      if (tPointsPerDay == null) {
        break missingId;
      }

      id = R.id.tRating;
      TextView tRating = ViewBindings.findChildViewById(rootView, id);
      if (tRating == null) {
        break missingId;
      }

      id = R.id.tUnpaid;
      TextView tUnpaid = ViewBindings.findChildViewById(rootView, id);
      if (tUnpaid == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvNik;
      TextView tvNik = ViewBindings.findChildViewById(rootView, id);
      if (tvNik == null) {
        break missingId;
      }

      id = R.id.tvPoints;
      TextView tvPoints = ViewBindings.findChildViewById(rootView, id);
      if (tvPoints == null) {
        break missingId;
      }

      return new FragmentProfileViewBinding((FrameLayout) rootView, cvDetailsAccount,
          cvProfilePicture, iAddPhoto, iBackgrounds, iDataPerDay, iDataPerDays, iDelivery,
          iEditProfile, iLogo, iPackaging, iPercentage, iPoints, iProfilePicture, iRating,
          iRegistered, iUnpaid, iUsername, lRegistered, lTotalPoints, lUsername, llmyOrders,
          tBottlesAccumulated, tBottlesPerDay, tDelivery, tMyOrders, tPackaging, tPerDay, tPerDays,
          tPointAccumulated, tPointsAccumulated, tPointsPerDay, tRating, tUnpaid, textView12,
          textView13, textView4, textView5, textView6, tvName, tvNik, tvPoints);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

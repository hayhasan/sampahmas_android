// Generated by view binder compiler. Do not edit!
package com.example.sampahmasgabungan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sampahmasgabungan.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cSignInGoogle;

  @NonNull
  public final ImageView iBackgrounds;

  @NonNull
  public final ImageView iFacebook;

  @NonNull
  public final ImageView iInstagram;

  @NonNull
  public final ImageView iTwitter;

  @NonNull
  public final ImageView imageView21;

  @NonNull
  public final ImageView imageView22;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final Button signInBtn;

  @NonNull
  public final TextInputEditText signInEmail;

  @NonNull
  public final TextInputEditText signInPassword;

  @NonNull
  public final TextView tSignUp;

  @NonNull
  public final TextView textView50;

  @NonNull
  public final TextView textView51;

  @NonNull
  public final TextView textView52;

  @NonNull
  public final TextView textView54;

  @NonNull
  public final TextView textView57;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cSignInGoogle,
      @NonNull ImageView iBackgrounds, @NonNull ImageView iFacebook, @NonNull ImageView iInstagram,
      @NonNull ImageView iTwitter, @NonNull ImageView imageView21, @NonNull ImageView imageView22,
      @NonNull RelativeLayout relativeLayout, @NonNull Button signInBtn,
      @NonNull TextInputEditText signInEmail, @NonNull TextInputEditText signInPassword,
      @NonNull TextView tSignUp, @NonNull TextView textView50, @NonNull TextView textView51,
      @NonNull TextView textView52, @NonNull TextView textView54, @NonNull TextView textView57) {
    this.rootView = rootView;
    this.cSignInGoogle = cSignInGoogle;
    this.iBackgrounds = iBackgrounds;
    this.iFacebook = iFacebook;
    this.iInstagram = iInstagram;
    this.iTwitter = iTwitter;
    this.imageView21 = imageView21;
    this.imageView22 = imageView22;
    this.relativeLayout = relativeLayout;
    this.signInBtn = signInBtn;
    this.signInEmail = signInEmail;
    this.signInPassword = signInPassword;
    this.tSignUp = tSignUp;
    this.textView50 = textView50;
    this.textView51 = textView51;
    this.textView52 = textView52;
    this.textView54 = textView54;
    this.textView57 = textView57;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cSignInGoogle;
      CardView cSignInGoogle = ViewBindings.findChildViewById(rootView, id);
      if (cSignInGoogle == null) {
        break missingId;
      }

      id = R.id.iBackgrounds;
      ImageView iBackgrounds = ViewBindings.findChildViewById(rootView, id);
      if (iBackgrounds == null) {
        break missingId;
      }

      id = R.id.iFacebook;
      ImageView iFacebook = ViewBindings.findChildViewById(rootView, id);
      if (iFacebook == null) {
        break missingId;
      }

      id = R.id.iInstagram;
      ImageView iInstagram = ViewBindings.findChildViewById(rootView, id);
      if (iInstagram == null) {
        break missingId;
      }

      id = R.id.iTwitter;
      ImageView iTwitter = ViewBindings.findChildViewById(rootView, id);
      if (iTwitter == null) {
        break missingId;
      }

      id = R.id.imageView21;
      ImageView imageView21 = ViewBindings.findChildViewById(rootView, id);
      if (imageView21 == null) {
        break missingId;
      }

      id = R.id.imageView22;
      ImageView imageView22 = ViewBindings.findChildViewById(rootView, id);
      if (imageView22 == null) {
        break missingId;
      }

      id = R.id.relativeLayout;
      RelativeLayout relativeLayout = ViewBindings.findChildViewById(rootView, id);
      if (relativeLayout == null) {
        break missingId;
      }

      id = R.id.signInBtn;
      Button signInBtn = ViewBindings.findChildViewById(rootView, id);
      if (signInBtn == null) {
        break missingId;
      }

      id = R.id.signInEmail;
      TextInputEditText signInEmail = ViewBindings.findChildViewById(rootView, id);
      if (signInEmail == null) {
        break missingId;
      }

      id = R.id.signInPassword;
      TextInputEditText signInPassword = ViewBindings.findChildViewById(rootView, id);
      if (signInPassword == null) {
        break missingId;
      }

      id = R.id.tSignUp;
      TextView tSignUp = ViewBindings.findChildViewById(rootView, id);
      if (tSignUp == null) {
        break missingId;
      }

      id = R.id.textView50;
      TextView textView50 = ViewBindings.findChildViewById(rootView, id);
      if (textView50 == null) {
        break missingId;
      }

      id = R.id.textView51;
      TextView textView51 = ViewBindings.findChildViewById(rootView, id);
      if (textView51 == null) {
        break missingId;
      }

      id = R.id.textView52;
      TextView textView52 = ViewBindings.findChildViewById(rootView, id);
      if (textView52 == null) {
        break missingId;
      }

      id = R.id.textView54;
      TextView textView54 = ViewBindings.findChildViewById(rootView, id);
      if (textView54 == null) {
        break missingId;
      }

      id = R.id.textView57;
      TextView textView57 = ViewBindings.findChildViewById(rootView, id);
      if (textView57 == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, cSignInGoogle, iBackgrounds,
          iFacebook, iInstagram, iTwitter, imageView21, imageView22, relativeLayout, signInBtn,
          signInEmail, signInPassword, tSignUp, textView50, textView51, textView52, textView54,
          textView57);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

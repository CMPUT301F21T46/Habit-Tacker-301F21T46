// Generated by view binder compiler. Do not edit!
package com.example.habit_tracker_301f21t46.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.habit_tracker_301f21t46.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHabitDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button FriBtn;

  @NonNull
  public final Button MonBtn;

  @NonNull
  public final Button SatBtn;

  @NonNull
  public final Button SunBtn;

  @NonNull
  public final Button ThuBtn;

  @NonNull
  public final Button TueBtn;

  @NonNull
  public final Button WedBtn;

  @NonNull
  public final Button confirmChangesButton;

  @NonNull
  public final Button deleteMedButton;

  @NonNull
  public final TextView editDateView;

  @NonNull
  public final EditText editNameView;

  @NonNull
  public final EditText editReasonView;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final TextView textView22;

  @NonNull
  public final TextView textView27;

  private FragmentHabitDetailsBinding(@NonNull ConstraintLayout rootView, @NonNull Button FriBtn,
      @NonNull Button MonBtn, @NonNull Button SatBtn, @NonNull Button SunBtn,
      @NonNull Button ThuBtn, @NonNull Button TueBtn, @NonNull Button WedBtn,
      @NonNull Button confirmChangesButton, @NonNull Button deleteMedButton,
      @NonNull TextView editDateView, @NonNull EditText editNameView,
      @NonNull EditText editReasonView, @NonNull TextView textView21, @NonNull TextView textView22,
      @NonNull TextView textView27) {
    this.rootView = rootView;
    this.FriBtn = FriBtn;
    this.MonBtn = MonBtn;
    this.SatBtn = SatBtn;
    this.SunBtn = SunBtn;
    this.ThuBtn = ThuBtn;
    this.TueBtn = TueBtn;
    this.WedBtn = WedBtn;
    this.confirmChangesButton = confirmChangesButton;
    this.deleteMedButton = deleteMedButton;
    this.editDateView = editDateView;
    this.editNameView = editNameView;
    this.editReasonView = editReasonView;
    this.textView21 = textView21;
    this.textView22 = textView22;
    this.textView27 = textView27;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHabitDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHabitDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_habit_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHabitDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Fri_btn;
      Button FriBtn = ViewBindings.findChildViewById(rootView, id);
      if (FriBtn == null) {
        break missingId;
      }

      id = R.id.Mon_btn;
      Button MonBtn = ViewBindings.findChildViewById(rootView, id);
      if (MonBtn == null) {
        break missingId;
      }

      id = R.id.Sat_btn;
      Button SatBtn = ViewBindings.findChildViewById(rootView, id);
      if (SatBtn == null) {
        break missingId;
      }

      id = R.id.Sun_btn;
      Button SunBtn = ViewBindings.findChildViewById(rootView, id);
      if (SunBtn == null) {
        break missingId;
      }

      id = R.id.Thu_btn;
      Button ThuBtn = ViewBindings.findChildViewById(rootView, id);
      if (ThuBtn == null) {
        break missingId;
      }

      id = R.id.Tue_btn;
      Button TueBtn = ViewBindings.findChildViewById(rootView, id);
      if (TueBtn == null) {
        break missingId;
      }

      id = R.id.Wed_btn;
      Button WedBtn = ViewBindings.findChildViewById(rootView, id);
      if (WedBtn == null) {
        break missingId;
      }

      id = R.id.confirmChangesButton;
      Button confirmChangesButton = ViewBindings.findChildViewById(rootView, id);
      if (confirmChangesButton == null) {
        break missingId;
      }

      id = R.id.deleteMedButton;
      Button deleteMedButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteMedButton == null) {
        break missingId;
      }

      id = R.id.edit_date_view;
      TextView editDateView = ViewBindings.findChildViewById(rootView, id);
      if (editDateView == null) {
        break missingId;
      }

      id = R.id.edit_name_view;
      EditText editNameView = ViewBindings.findChildViewById(rootView, id);
      if (editNameView == null) {
        break missingId;
      }

      id = R.id.edit_reason_view;
      EditText editReasonView = ViewBindings.findChildViewById(rootView, id);
      if (editReasonView == null) {
        break missingId;
      }

      id = R.id.textView21;
      TextView textView21 = ViewBindings.findChildViewById(rootView, id);
      if (textView21 == null) {
        break missingId;
      }

      id = R.id.textView22;
      TextView textView22 = ViewBindings.findChildViewById(rootView, id);
      if (textView22 == null) {
        break missingId;
      }

      id = R.id.textView27;
      TextView textView27 = ViewBindings.findChildViewById(rootView, id);
      if (textView27 == null) {
        break missingId;
      }

      return new FragmentHabitDetailsBinding((ConstraintLayout) rootView, FriBtn, MonBtn, SatBtn,
          SunBtn, ThuBtn, TueBtn, WedBtn, confirmChangesButton, deleteMedButton, editDateView,
          editNameView, editReasonView, textView21, textView22, textView27);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

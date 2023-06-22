// Generated by view binder compiler. Do not edit!
package com.codewithkael.webrtcprojectforrecord.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.codewithkael.webrtcprojectforrecord.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.webrtc.SurfaceViewRenderer;

public final class ActivityCallBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView acceptButton;

  @NonNull
  public final ImageView audioOutputButton;

  @NonNull
  public final AppCompatButton callBtn;

  @NonNull
  public final RelativeLayout callLayout;

  @NonNull
  public final LinearLayout controls;

  @NonNull
  public final ImageView endCallButton;

  @NonNull
  public final LinearLayout incomingCallLayout;

  @NonNull
  public final TextView incomingNameTV;

  @NonNull
  public final ImageView micButton;

  @NonNull
  public final ImageView rejectButton;

  @NonNull
  public final SurfaceViewRenderer remoteView;

  @NonNull
  public final ProgressBar remoteViewLoading;

  @NonNull
  public final ImageView switchCameraButton;

  @NonNull
  public final EditText targetUserNameEt;

  @NonNull
  public final ImageView videoButton;

  @NonNull
  public final RelativeLayout whoToCallLayout;

  private ActivityCallBinding(@NonNull RelativeLayout rootView, @NonNull ImageView acceptButton,
      @NonNull ImageView audioOutputButton, @NonNull AppCompatButton callBtn,
      @NonNull RelativeLayout callLayout, @NonNull LinearLayout controls,
      @NonNull ImageView endCallButton, @NonNull LinearLayout incomingCallLayout,
      @NonNull TextView incomingNameTV, @NonNull ImageView micButton,
      @NonNull ImageView rejectButton, @NonNull SurfaceViewRenderer remoteView,
      @NonNull ProgressBar remoteViewLoading, @NonNull ImageView switchCameraButton,
      @NonNull EditText targetUserNameEt, @NonNull ImageView videoButton,
      @NonNull RelativeLayout whoToCallLayout) {
    this.rootView = rootView;
    this.acceptButton = acceptButton;
    this.audioOutputButton = audioOutputButton;
    this.callBtn = callBtn;
    this.callLayout = callLayout;
    this.controls = controls;
    this.endCallButton = endCallButton;
    this.incomingCallLayout = incomingCallLayout;
    this.incomingNameTV = incomingNameTV;
    this.micButton = micButton;
    this.rejectButton = rejectButton;
    this.remoteView = remoteView;
    this.remoteViewLoading = remoteViewLoading;
    this.switchCameraButton = switchCameraButton;
    this.targetUserNameEt = targetUserNameEt;
    this.videoButton = videoButton;
    this.whoToCallLayout = whoToCallLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_call, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCallBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.acceptButton;
      ImageView acceptButton = ViewBindings.findChildViewById(rootView, id);
      if (acceptButton == null) {
        break missingId;
      }

      id = R.id.audio_output_button;
      ImageView audioOutputButton = ViewBindings.findChildViewById(rootView, id);
      if (audioOutputButton == null) {
        break missingId;
      }

      id = R.id.callBtn;
      AppCompatButton callBtn = ViewBindings.findChildViewById(rootView, id);
      if (callBtn == null) {
        break missingId;
      }

      id = R.id.callLayout;
      RelativeLayout callLayout = ViewBindings.findChildViewById(rootView, id);
      if (callLayout == null) {
        break missingId;
      }

      id = R.id.controls;
      LinearLayout controls = ViewBindings.findChildViewById(rootView, id);
      if (controls == null) {
        break missingId;
      }

      id = R.id.end_call_button;
      ImageView endCallButton = ViewBindings.findChildViewById(rootView, id);
      if (endCallButton == null) {
        break missingId;
      }

      id = R.id.incomingCallLayout;
      LinearLayout incomingCallLayout = ViewBindings.findChildViewById(rootView, id);
      if (incomingCallLayout == null) {
        break missingId;
      }

      id = R.id.incomingNameTV;
      TextView incomingNameTV = ViewBindings.findChildViewById(rootView, id);
      if (incomingNameTV == null) {
        break missingId;
      }

      id = R.id.mic_button;
      ImageView micButton = ViewBindings.findChildViewById(rootView, id);
      if (micButton == null) {
        break missingId;
      }

      id = R.id.rejectButton;
      ImageView rejectButton = ViewBindings.findChildViewById(rootView, id);
      if (rejectButton == null) {
        break missingId;
      }

      id = R.id.remote_view;
      SurfaceViewRenderer remoteView = ViewBindings.findChildViewById(rootView, id);
      if (remoteView == null) {
        break missingId;
      }

      id = R.id.remote_view_loading;
      ProgressBar remoteViewLoading = ViewBindings.findChildViewById(rootView, id);
      if (remoteViewLoading == null) {
        break missingId;
      }

      id = R.id.switch_camera_button;
      ImageView switchCameraButton = ViewBindings.findChildViewById(rootView, id);
      if (switchCameraButton == null) {
        break missingId;
      }

      id = R.id.targetUserNameEt;
      EditText targetUserNameEt = ViewBindings.findChildViewById(rootView, id);
      if (targetUserNameEt == null) {
        break missingId;
      }

      id = R.id.video_button;
      ImageView videoButton = ViewBindings.findChildViewById(rootView, id);
      if (videoButton == null) {
        break missingId;
      }

      id = R.id.whoToCallLayout;
      RelativeLayout whoToCallLayout = ViewBindings.findChildViewById(rootView, id);
      if (whoToCallLayout == null) {
        break missingId;
      }

      return new ActivityCallBinding((RelativeLayout) rootView, acceptButton, audioOutputButton,
          callBtn, callLayout, controls, endCallButton, incomingCallLayout, incomingNameTV,
          micButton, rejectButton, remoteView, remoteViewLoading, switchCameraButton,
          targetUserNameEt, videoButton, whoToCallLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

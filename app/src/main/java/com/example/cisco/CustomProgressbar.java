package com.example.cisco;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

public class CustomProgressbar extends Dialog
{
    public CustomProgressbar(@NonNull Context context) {
        super(context);
        WindowManager.LayoutParams params = getWindow().getAttributes();

        params.gravity = Gravity.CENTER_HORIZONTAL;
        setTitle(null);
        setCancelable(false);
        setOnCancelListener(null);
        View view = LayoutInflater.from(context).inflate(R.layout.loading_layout,null);
        setContentView(view);
    }
}

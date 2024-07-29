package com.example.mylibrary;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class DemoClassFileLib {
    private final Context context;

    public DemoClassFileLib(Context context) {
        this.context = context;
    }

    public void printMessage(String message){
        Log.d( "printMessage: ",message);
    }

    public int addNumbers(int a, int b){
        return a+b;
    }

    public void showToast(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void showSnackBar(View view, String message){
        Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG)
                .setAction("CLOSE", view1 -> Toast.makeText(context, message, Toast.LENGTH_SHORT).show())
                .setActionTextColor(context.getResources().getColor(android.R.color.holo_red_light ))
                .show();
    }
}

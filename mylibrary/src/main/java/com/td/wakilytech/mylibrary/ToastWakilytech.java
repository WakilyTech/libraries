package com.td.wakilytech.mylibrary;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class ToastWakilytech extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public ToastWakilytech(Context context) {
        super(context);
    }

    @Override
    public void show() {
        super.show();
    }
}

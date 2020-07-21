package com.edimariyanto.toastmessages;

import android.content.Context;
import android.widget.Toast;

public class ToastMessages {
    public static void setToast(Context c, String message, Boolean durationLong) {
        if (durationLong) {
            Toast.makeText(c, message, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        }
    }
}

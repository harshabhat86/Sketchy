package com.som.threedchess;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;

    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast,String base64) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
        base64TobyteArray(base64);
    }
    
    public void base64TobyteArray(String byte64String) {
    	
        //Toast.makeText(mContext, byte64String, Toast.LENGTH_SHORT).show();
        //Log.i("HarshaToast",byte64String);
    	String b64Actual = byte64String.substring("data:image/png;base64,".length());
    	
        byte[] decodedString = android.util.Base64.decode(b64Actual, android.util.Base64.DEFAULT);
        
        SavePhotoTask savePhoto = new SavePhotoTask();
        savePhoto.doInBackground(decodedString);
    }
}

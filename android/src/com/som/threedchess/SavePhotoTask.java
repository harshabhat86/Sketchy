package com.som.threedchess;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.Toast;

public class SavePhotoTask extends AsyncTask<byte[], String, String> {
    @Override
    protected String doInBackground(byte[]... jpeg) {
    	SimpleDateFormat df = new SimpleDateFormat("MMddyyyyHHmmssSSS");
    	// Get the date today using Calendar object.
    	Date today = Calendar.getInstance().getTime();        
    	// Using DateFormat format method we can create a string 
    	// representation of a date with the defined format.
    	String reportDate = df.format(today);

      Log.i("HBImageName","sketchy_"+reportDate);
      File folder = new File(Environment.getExternalStorageDirectory() + "/Sketchy");
      boolean success= true;
      if (!folder.exists()) {
    	  Log.i("Folder made:","sketchy_"+reportDate);
    	     success = folder.mkdir();
    	}
      
      File photo=new File(Environment.getExternalStorageDirectory()+"/Sketchy", "sketchy_"+reportDate+".jpg");
      
      if (photo.exists()) {
            photo.delete();
      }

      try {
        FileOutputStream fos=new FileOutputStream(photo.getPath());
        
        fos.write(jpeg[0]);
        fos.close();
        
        
      }
      catch (java.io.IOException e) {
        Log.e("PictureDemo", "Exception in photoCallback", e);
      }

      return(null);
    }
}
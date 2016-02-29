package com.som.threedchess;

import java.util.HashMap;


import android.app.Application;


public class AP extends Application
{
   private static HashMap<String, Object> param = null;
   
   public void setValueForKey(String key, Object value)
   {
	   if(param == null)
	   {
		   param = new HashMap<String, Object>();
	   }
	    
	  param.put(key, value); 
   }
   
   public Object getValueForKey(String key)
   {
	   return param.get(key);
   }
   
   public void clearAP()
   {
	   if(param == null)
	   {
		   return;
	   }
	   param.clear();
	   param = null;
   }
}

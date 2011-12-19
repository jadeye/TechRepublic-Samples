package com.teleknesis.android.peepshow.utils;

import android.util.Log;


//****************************************************************
//****************************************************************
//Logger
//****************************************************************
//****************************************************************
public class Logger { 
	
	
	//****************************************************************
    // Logger
    //****************************************************************
	public Logger() {
		
		}
	
	
	//****************************************************************
    // Error
    //****************************************************************
	public static void Error( String methodName, Exception error ) {
		Log.e("PeepShow", methodName + ": " + error.toString() ); 
		}
	
	
	//****************************************************************
    // Debug
    //****************************************************************
	public static void Debug( String message ) {
		Log.d("PeepShow", message );
		}

	}

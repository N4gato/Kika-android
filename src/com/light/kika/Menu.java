package com.light.kika;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Menu extends Activity{
	
	MediaPlayer biber;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        biber = MediaPlayer.create(Menu.this,R.raw.justin);
        biber.start();
        Thread timer = new Thread(){
        	public void run(){
        	try {
        		sleep(10000);
        		
        		
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				Intent first = new Intent("com.light.kika.MainActivity");
				startActivity(first);
			}
        	
        }
	
	}; //end thread
	timer.start();
	
	
}
	protected void onPause() {
        super.onPause();
        biber.release();
}
}
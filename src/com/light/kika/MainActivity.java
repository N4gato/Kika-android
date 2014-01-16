package com.light.kika;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	int conter=0;
	Button add1,add2,sub1,sub2;
	TextView tv1,tv2;
	EditText read;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        add1 = (Button) findViewById(R.id.add1);
        add2 = (Button) findViewById(R.id.add2);
        sub1 = (Button) findViewById(R.id.sub1);
        sub2 = (Button) findViewById(R.id.sub2);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView1);
        read = (EditText) findViewById(R.id.editText1);
        
        
 		
        add1.setOnClickListener(new View.OnClickListener() {
        	 
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String	quoi = read.getText().toString();
		 		conter = Integer.parseInt(quoi);
			conter++; 
			
				tv1.setText("You now :" + conter);
			}
		});
        
        
        sub1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				conter--; 
				
					tv1.setText("You now :" + conter);
			}
		});
        
        	sub2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				conter--; 
				
					tv2.setText("You now :" + conter);
			}
		});
        	
        	add2.setOnClickListener(new View.OnClickListener() {
    			
    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				
    				conter++; 
    				
    					tv2.setText("You now :" + conter);
    			}
    		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

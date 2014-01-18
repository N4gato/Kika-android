package com.light.kika;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	int conter=0;
	Button add2,readd;
	TextView tv1,tv2;
	EditText read;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
        add2 = (Button) findViewById(R.id.add);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView1);
        read = (EditText) findViewById(R.id.editText1);
        readd = (Button) findViewById(R.id.read);
        
        
 		
        add2.setOnClickListener(new View.OnClickListener() {
       	 
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			conter++; 
			
				tv1.setText("You now :" + conter);
			}
		});
   
        readd.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String	quoi = read.getText().toString();
				conter = Integer.parseInt(quoi);
				tv2.setText("Thanks: You did good to enter such a number");
			}
		});
        
        
      
    }
    
}

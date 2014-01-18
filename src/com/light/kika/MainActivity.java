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
<<<<<<< HEAD
<<<<<<< HEAD
	Button add2,readd,add1;
=======
	Button add2,readd;
>>>>>>> e1821e46487381887b742d074d9717428f87cc47
=======
	Button add1,add2,sub1,sub2;
>>>>>>> parent of 449cd2a... Some changes
	TextView tv1,tv2;
	EditText read;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
<<<<<<< HEAD
       
<<<<<<< HEAD
   
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView1);
        read = (EditText) findViewById(R.id.editText1);
        add2 = (Button) findViewById(R.id.add2);
        add1 = (Button) findViewById(R.id.add1);
        
 		
        add2.setOnClickListener(new View.OnClickListener() {
       	 
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			conter++; 
			
				tv1.setText("You now :" + conter);
=======
        add2 = (Button) findViewById(R.id.add);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView1);
        read = (EditText) findViewById(R.id.editText1);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        readd = (Button) findViewById(R.id.read);
        
=======
        add1 = (Button) findViewById(R.id.add1);
        add2 = (Button) findViewById(R.id.add2);
        sub1 = (Button) findViewById(R.id.sub1);
        sub2 = (Button) findViewById(R.id.sub2);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView1);
        read = (EditText) findViewById(R.id.editText1);
   
>>>>>>> parent of 449cd2a... Some changes
        
        add1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String	quoi = read.getText().toString();
			conter = Integer.parseInt(quoi); 
			conter++; 
			read.clearAnimation();
				tv1.setText("You now :" + conter);
=======
        
        
 		
=======
        
        
 		
>>>>>>> 06ffa5de32253deb4076440e1f23e136a8536015
=======
   
        
>>>>>>> parent of 06ffa5d... Liste of activities
        add1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			String	quoi = read.getText().toString();
			conter = Integer.parseInt(quoi); 
			conter++; 
			read.clearAnimation();
				tv1.setText("You now :" + conter);
			}
		});
        
        
        sub1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//String	quoi = read.getText().toString();
				//conter = Integer.parseInt(quoi); 
				conter--; 
				//read.clearAnimation();
					tv1.setText("You now :" + conter);
>>>>>>> 06ffa5de32253deb4076440e1f23e136a8536015
>>>>>>> e1821e46487381887b742d074d9717428f87cc47
			}
		});
        
        
        sub1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
				String	quoi = read.getText().toString();
				conter = Integer.parseInt(quoi);
				tv2.setText("Thanks: You did good to enter such a number");
<<<<<<< HEAD
			}
		});
        
        
      
=======
			}
		});
        
        
      
=======
=======
>>>>>>> 06ffa5de32253deb4076440e1f23e136a8536015
				
=======
				String	quoi = read.getText().toString();
				conter = Integer.parseInt(quoi); 
>>>>>>> parent of 06ffa5d... Liste of activities
=======
				//String	quoi = read.getText().toString();
				//conter = Integer.parseInt(quoi); 
				conter--; 
				//read.clearAnimation();
					tv1.setText("You now :" + conter);
			}
		});
        
        	sub2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String	quoi = read.getText().toString();
				conter = Integer.parseInt(quoi); 
>>>>>>> parent of 449cd2a... Some changes
				conter--; 
				read.clearAnimation();
					tv2.setText("You now :" + conter);
			}
		});
        	
        	add2.setOnClickListener(new View.OnClickListener() {
    			
    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				String	quoi = read.getText().toString();
    				conter = Integer.parseInt(quoi); 
    				conter++; 
    				read.clearAnimation();
    					tv2.setText("You now :" + conter);
    			}
    		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
<<<<<<< HEAD
>>>>>>> 06ffa5de32253deb4076440e1f23e136a8536015
>>>>>>> e1821e46487381887b742d074d9717428f87cc47
=======
>>>>>>> parent of 449cd2a... Some changes
    }
    
}

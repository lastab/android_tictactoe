package com.project.tick;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Board extends ActionBarActivity {
	int x=0;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	TextView mes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_board);
		
		//initilize buttons
		b1= (Button)findViewById(R.id.btn1);
		b2= (Button)findViewById(R.id.btn2);
		b3= (Button)findViewById(R.id.btn3);
		b4= (Button)findViewById(R.id.btn4);
		b5= (Button)findViewById(R.id.btn5);
		b6= (Button)findViewById(R.id.btn6);
		b7= (Button)findViewById(R.id.btn7);
		b8= (Button)findViewById(R.id.btn8);
		b9= (Button)findViewById(R.id.btn9);
		mes= (TextView)findViewById(R.id.textView1);
	
		//add listeners
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b1.setText("X");
				
				else 
					b1.setText("O");
				check();
				b1.setEnabled(false);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b2.setText("X");
				
				else 
					b2.setText("O");
				check();
				b2.setEnabled(false);
			}
		});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b3.setText("X");
				
				else 
					b3.setText("O");
				check();
				b3.setEnabled(false);
			}
		});
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b4.setText("X");
				
				else 
					b4.setText("O");
				check();
				b4.setEnabled(false);
			}
		});
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b5.setText("X");
				
				else 
					b5.setText("O");
				check();
				b5.setEnabled(false);
			}
		});
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b6.setText("X");
				
				else 
					b6.setText("O");
				check();
				b6.setEnabled(false);
			}
		});
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b7.setText("X");
				
				else 
					b7.setText("O");
				check();
				b7.setEnabled(false);
			}
		});
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b8.setText("X");
				
				else 
					b8.setText("O");
				check();
				b8.setEnabled(false);
			}
		});
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (x%2==0)
					b9.setText("X");
				
				else 
					b9.setText("O");
				check();
				b9.setEnabled(false);
			}
		});
		
	
	}
	public void OnClick(View view){
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.board, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void check(){
		x++;
		if (b1.getText()==b2.getText()&& b1.getText()==b3.getText() )
			wins((String)b1.getText());
		if (b1.getText()==b4.getText()&& b1.getText()==b7.getText() )
			wins((String)b1.getText());
		if (b1.getText()==b5.getText()&& b1.getText()==b9.getText() )
			wins((String)b1.getText());
		if (b2.getText()==b5.getText()&& b2.getText()==b8.getText() )
			wins((String)b2.getText());
		if (b3.getText()==b5.getText()&& b3.getText()==b7.getText() )
			wins((String)b3.getText());
		if (b4.getText()==b5.getText()&& b4.getText()==b6.getText() )
			wins((String)b4.getText());
		if (b7.getText()==b8.getText()&& b7.getText()==b9.getText() )
			wins((String)b7.getText());
			
	}
	private void wins(String s){
		if (s=="X" || s=="O"){
			mes.setText(s+ " wins");
			gameover();
		}
	}
	private void gameover(){
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}
	
	
	
}

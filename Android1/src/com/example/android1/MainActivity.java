package com.example.android1;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	
	double value;
	Button add,sub,mul,div;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bdot,bclear;
	EditText display;
	@Override																																																																																													 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		value = 0.0;
		add = (Button) findViewById(R.id.badd);
		sub = (Button) findViewById(R.id.bsubtract);
		div = (Button) findViewById(R.id.bdiv);
		mul = (Button) findViewById(R.id.bmul);
		b0 = (Button) findViewById(R.id.b0);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);
		bclear = (Button) findViewById(R.id.bclear);
		bdot = (Button) findViewById(R.id.bdot);
		display = (EditText) findViewById(R.id.et);
		/*add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				value++;
				display.setText("Total = " + value);
			}
		});*/
		/*if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}*/
		//click events here
		/*b0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = display.getText().toString();
				s.concat("0");
				display.setText("" + s);
			}
		});*/
	
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
*/
	/**
	 * A placeholder fragment containing a simple view.
	 */
	/*public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
}*/
	public void funcadd(View v){
		String s = display.getText().toString();
		int index = s.indexOf(',');
		String s1 = s.substring(0,index);
		String s2 = s.substring(index+1,s.length());
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		display.setText(""+Double.toString(n1+n2));
	}
	
	public void funcsubtract(View v){
		String s = display.getText().toString();
		int index = s.indexOf(',');
		String s1 = s.substring(0,index);
		String s2 = s.substring(index+1,s.length());
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		display.setText(""+Double.toString(n1-n2));
	}
	
	public void funcmul(View v){
		String s = display.getText().toString();
		int index = s.indexOf(',');
		String s1 = s.substring(0,index);
		String s2 = s.substring(index+1,s.length());
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		display.setText(""+Double.toString(n1*n2));
	}
	
	public void funcdiv(View v){
		String s = display.getText().toString();
		int index = s.indexOf(',');
		String s1 = s.substring(0,index);
		String s2 = s.substring(index+1,s.length());
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		if(n2==0.0) { display.setText("Division by zero not allowed!"); return; }
		display.setText(""+Double.toString(n1/n2));
	}
	
	public void func0(View v){
		String s = display.getText().toString();
		s=s.concat("0");
		display.setText("" + s);
	}
	
	public void func1(View v){
		String s = display.getText().toString();
		s=s.concat("1");
		display.setText("" + s);
	}
	
	public void func2(View v){
		String s = display.getText().toString();
		s=s.concat("2");
		display.setText("" + s);
	}
	
	public void func3(View v){
		String s = display.getText().toString();
		s=s.concat("3");
		display.setText("" + s);
	}
	
	public void func4(View v){
		String s = display.getText().toString();
		s=s.concat("4");
		display.setText("" + s);
	}
	
	public void func5(View v){
		String s = display.getText().toString();
		s=s.concat("5");
		display.setText("" + s);
	}
	
	public void func6(View v){
		String s = display.getText().toString();
		s=s.concat("6");
		display.setText("" + s);
	}
	
	public void func7(View v){
		String s = display.getText().toString();
		s=s.concat("7");
		display.setText("" + s);
	}
	
	public void func8(View v){
		String s = display.getText().toString();
		s=s.concat("8");
		display.setText("" + s);
	}
	
	public void func9(View v){
		String s = display.getText().toString();
		s=s.concat("9");
		display.setText("" + s);
	}
	
	public void funcdot(View v){
		String s = display.getText().toString();
		s=s.concat(".");
		display.setText("" + s);
	}
	
	public void funcclear(View v){
		display.setText("");
	}
	
	public void funccomma(View v) {
		String s = display.getText().toString();
		s=s.concat(",");
		display.setText("" + s);
	}
}



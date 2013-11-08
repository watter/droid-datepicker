package br.gov.pr.datepicker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_date);

		/*
		// coloca o foco no 1o botão de dia  
		Button button = (Button)findViewById(R.id.button_d1);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);///add this line
        button.requestFocus();
        
        */

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.date, menu);
		return true;
	}

	public void exit(View v){
		
	}

	
	public void onClickButton1(View v){
		Button botao = (Button) findViewById(R.id.button_d2);
		botao.setText("7");
	
	}

	
	public void onClickButton2(View v){
		Context context = getApplicationContext();
		CharSequence text = "1";
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}
	
	public void onClickButton3(View v){
	}

	public void onClickButton4(View v){
	}

	public void onClickButton5(View v){
	}

	public void onClickButton6(View v){
	}

	public void onClickButton7(View v){
		Button botao = (Button) findViewById(R.id.button_d2);
		botao.setText("7");
	
	}
	
	public void onClickButton8(View v){
	}

	public void onClickButton9(View v){
	}
	
	public void onClickButton0(View v){
	}

	public void onClickButtonMin1d(View v){
	}

	public void onClickButtonMin1m(View v){
	}
	
	public void onClickButtonMin1y(View v){
	}
	
	public void onClickButtonPlus1d(View v){
	}

	public void onClickButtonPlus1m(View v){
	}
	
	public void onClickButtonPlus1y(View v){
	}


}

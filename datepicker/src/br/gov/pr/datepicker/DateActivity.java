package br.gov.pr.datepicker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
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
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("1");
	}

	
	public void onClickButton2(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("2");
	}
	
	public void onClickButton3(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("3");

	}

	public void onClickButton4(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("4");

	}

	public void onClickButton5(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("5");

	}

	public void onClickButton6(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("6");

	}

	public void onClickButton7(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("7");
	}
	
	public void onClickButton8(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("8");
	}

	public void onClickButton9(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("9");
	}
	
	public void onClickButton0(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("0");
	}

	public void onClickButtonMin1d(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("99");

	}

	public void onClickButtonMin1m(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("88");
	}
	
	public void onClickButtonMin1y(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("77");

	}
	
	public void onClickButtonPlus1d(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("66");

	}

	public void onClickButtonPlus1m(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("55");
	}
	
	public void onClickButtonPlus1y(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("44");

	}


}

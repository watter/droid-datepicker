package br.gov.pr.datepicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class DateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_date);

			/*
		// coloca o foco no 1o botão de dia  
		Button button = (Button)findViewById(R.id.button_d1);
		button.requestFocus();
			 */
		
		Date date = Calendar.getInstance().getTime();
		//
		// Display a date in day, month, year format
		//
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String today = formatter.format(date);

		Button botao = (Button)findViewById(R.id.button_d1);
		botao.setText(today.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.button_d2);
		botao.setText(today.subSequence(1, 2));

		botao = (Button)findViewById(R.id.button_m1);
		botao.setText(today.subSequence(3, 4));

		botao = (Button)findViewById(R.id.button_m2);
		botao.setText(today.subSequence(4, 5));

		botao = (Button)findViewById(R.id.button_y1);
		botao.setText(today.subSequence(6, 7));

		botao = (Button)findViewById(R.id.button_y2);
		botao.setText(today.subSequence(7, 8));

		botao = (Button)findViewById(R.id.button_y3);
		botao.setText(today.subSequence(8, 9));

		botao = (Button)findViewById(R.id.button_y4);
		botao.setText(today.subSequence(9, 10));

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
		
		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();
		
	}

	
	public void onClickButton2(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("2");

		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();

	}
	
	public void onClickButton3(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("3");

		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();

	}

	public void onClickButton4(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("4");

		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();

	}

	public void onClickButton5(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("5");

		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();

	}

	public void onClickButton6(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("6");

		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();

	}

	public void onClickButton7(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("7");
	
		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();
}
	
	public void onClickButton8(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("8");

		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();
	}

	public void onClickButton9(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("9");
		
		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();

	}
	
	public void onClickButton0(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("0");
		
		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
		bnext.requestFocus();

	}

	public void onClickButtonMin1d(View v){
		
		Button btn_d1 = (Button) findViewById(R.id.button_d1);  
		Button btn_d2 = (Button) findViewById(R.id.button_d2);  

		// recupera o valor dos dias e decrementa 
		
		int decday = Integer.parseInt((String) btn_d1.getText() + (String) btn_d2.getText());
		decday = decday-1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strdecday ="01";
		
		if (decday < 1){
			strdecday = "01";
		}else if (decday < 10){
			strdecday = "0" + String.valueOf(decday);
		}else{
			strdecday = String.valueOf(decday);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.button_d1);
		botao.setText(strdecday.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.button_d2);
		botao.setText(strdecday.subSequence(1, 2));

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

		Button btn_d1 = (Button) findViewById(R.id.button_d1);  
		Button btn_d2 = (Button) findViewById(R.id.button_d2);  

		// recupera o valor dos dias e decrementa 
		
		int incday = Integer.parseInt((String) btn_d1.getText() + (String) btn_d2.getText());
		incday = incday+1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strincday ="31";
		
		if (incday > 31){
			strincday = "31";
		}else if (incday < 10){
			strincday = "0" + String.valueOf(incday);
		}else{
			strincday = String.valueOf(incday);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.button_d1);
		botao.setText(strincday.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.button_d2);
		botao.setText(strincday.subSequence(1, 2));

	}

	public void onClickButtonPlus1m(View v){
		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("55");
	}
	
	public void onClickButtonPlus1y(View v){

		Button botao = (Button) getWindow().getCurrentFocus(); //   findViewById(R.id.button_d1);
		botao.setText("55");

		
	}


}

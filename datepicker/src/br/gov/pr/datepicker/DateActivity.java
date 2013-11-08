package br.gov.pr.datepicker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_date);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.date, menu);
		return true;
	}

	public void onClickButton7(View v){
		Button botao = (Button) findViewById(R.id.button_d2);
		botao.setText("7");

		EditText edtd1 = (EditText) findViewById(R.id.editText_d1);
		edtd1.setText("7");

	}
}

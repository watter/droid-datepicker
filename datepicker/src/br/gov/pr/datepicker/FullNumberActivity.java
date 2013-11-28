package br.gov.pr.datepicker;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FullNumberActivity extends Activity {

	Boolean FullLayout = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_full_number);

		/*
		 * Adicionando o evento de long click no botão {[
		 * 
			Button b = (Button) findViewById(R.id.button_left_square_curly_braces);
			b.setOnLongClickListener(onLongClick(findViewById(R.layout.activity_full_number)));
		 */

	}

	
	public void onChangeLayout(View v){

		/*
		 * não está funcionando :/
		 */
		setContentView(R.layout.activity_number);
		
		if (! FullLayout){
			setContentView(R.layout.activity_number);
			FullLayout=false;
		}else{
			setContentView(R.layout.activity_full_number);
			FullLayout=true;
		}
		 
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.full_number, menu);
		return true;
	}

	

	public void updateNumbers (View v, String c){
		EditText e = (EditText) findViewById(R.id.numbers);
		CharSequence cs = e.getText().append(c);
		e.setText(cs);
	}


	public void onClickDel (View v){
		
		
	}

	public void onClickAt (View v){
 		updateNumbers(v, "@");
	}

	public void onClick_leftArrow (View v){
		EditText e = (EditText) findViewById(R.id.numbers);
		int cursorPosition = e.getSelectionStart();
		e.setSelection( cursorPosition -1);
	}

	public void onClick_rightArrow (View v){
		EditText e = (EditText) findViewById(R.id.numbers);
		int cursorPosition = e.getSelectionStart();
		e.setSelection(cursorPosition +1 );
	}

	public void onClickHash (View v){
		updateNumbers(v, "#");
	}

	public void onClickBackspace (View v){
	}

	public void onClickQuestion (View v){
		updateNumbers(v, "?");
	}

	public void onClickSlash (View v){
		updateNumbers(v, "/");
	}

	public void onClick1 (View v){
		updateNumbers(v, "1");
	}

	public void onClick2 (View v){
		updateNumbers(v, "2");
	}

	public void onClick3 (View v){
		updateNumbers(v, "3");
	}

	public void onClickAsterisc (View v){
		updateNumbers(v, "*");
	}

	public void onClick_plus_andMinus (View v){
	}

	public void onClick_left_square_curlyBraces (View v){
		updateNumbers(v, "[");
	}

    public OnLongClickListener onLongClick(View v) {
            // TODO Auto-generated method stub
    		updateNumbers(v, "{");
			return null;
    }
	
	
	public void onClick_leftParenthesis (View v){
		updateNumbers(v, "(");
	}

	public void onClick4 (View v){
		updateNumbers(v, "4");
	}

	public void onClick5 (View v){
		updateNumbers(v, "5");
	}

	public void onClick6 (View v){
		updateNumbers(v, "6");
	}

	public void onClick_rightParenthesis (View v){
		updateNumbers(v, ")");
	}

	public void onClick_right_square_curlyBraces (View v){
		updateNumbers(v, "]");
	}

	public void onClickPercent (View v){
		updateNumbers(v, "%");
	}

	public void onClickColon (View v){
		updateNumbers(v, ":");
	}

	public void onClick7 (View v){
		updateNumbers(v, "7");
	}

	public void onClick8 (View v){
		updateNumbers(v, "8");
	}

	public void onClick9 (View v){
		updateNumbers(v, "9");
	}

	public void onClickSemicolon (View v){
		updateNumbers(v, ";");
	}

	public void onClickDolar (View v){
		updateNumbers(v, "$");
	}

	public void onClickExclamation (View v){
		updateNumbers(v, "!");
	}

	public void onClickMinus (View v){
		updateNumbers(v, "-");
	}

	public void onClickComma (View v){
		updateNumbers(v, ",");
	}

	public void onClick0 (View v){
		updateNumbers(v, "0");
	}

	public void onClickPeriod (View v){
		updateNumbers(v, ".");
	}

	public void onClickPlus (View v){
		updateNumbers(v, "+");
	}

	public void onClickEqual (View v){
		updateNumbers(v, "=");
	}

	public void onClickOk (View v){
	}

}

package br.gov.pr.datepicker;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.WindowManager;
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
		 */

		Button button = (Button) findViewById(R.id.button_left_square_curly_braces);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "{");
		            return true;
		        }
		    });

		
		/*
		 * Adicionando o evento de long click no botão ]}
		 * 
		 */

		button = (Button) findViewById(R.id.button_right_square_curly_braces);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "}");
		            return true;
		        }
		    });
		
		/*
		 * Impede o teclado de aparecer ao clicar no EditText e mantém o cursor aparecendo ;-)
		 */
		EditText e = (EditText) findViewById(R.id.numbers);
		e.setKeyListener(null);
		
	}

	
	public void onChangeLayout(View v){


		this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		 
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.full_number, menu);
		return true;
	}

	

	public void updateNumbers (View v, String c){
		EditText e = (EditText) findViewById(R.id.numbers);
		/* pego a posição atual
		 * e insiro o texto onde está o cursor
		 */
		int curPos = e.getSelectionStart();
		String str = e.getText().toString();

		String str1 = (String) str.substring(0, curPos);
		String str2 = (String) str.substring(curPos);

		e.setText(str1+c+str2);
		//e.setSelection(curPos);
		e.setSelection(e.getText().toString().length());

	}


	public void onClickDel (View v){
		EditText e = (EditText) findViewById(R.id.numbers);
		
		int curPos = e.getSelectionStart();
		int eLength = e.getText().toString().length();
		
		int endString = eLength;
		
		if ( (curPos + 1) > eLength )
			endString = eLength;
		else
			endString = curPos + 1;
		
		String str = e.getText().toString();
		
		String str1 = (String) str.substring(0, curPos);
		String str2 = (String) str.substring(endString);

		e.setText(str1+str2);
		e.setSelection(curPos);
	
	}

	public void onClickAt (View v){
 		updateNumbers(v, "@");
	}

	public void onClick_leftArrow (View v){
		EditText e = (EditText) findViewById(R.id.numbers);
		int cursorPosition = e.getSelectionStart();
		if (cursorPosition > 0 ){
			e.setSelection( cursorPosition -1);
		}else{
			e.setSelection( cursorPosition);
		}
	}

	public void onClick_rightArrow (View v){
		EditText e = (EditText) findViewById(R.id.numbers);
		int cursorPosition = e.getSelectionStart();
		
		// dont try to trespass the end of the string
		if (cursorPosition == e.getText().toString().length())
			e.setSelection(cursorPosition);
		else
			e.setSelection(cursorPosition +1);

	}

	public void onClickHash (View v){
		updateNumbers(v, "#");
	}

	public void onClickBackspace (View v){
		
		EditText e = (EditText) findViewById(R.id.numbers);
		
		int curPos = e.getSelectionStart();

		String str = e.getText().toString();

		String str1 = "";
		
		// safety check. Do not trespass start boundary 
		int inicioString = 0; 
		if ( (curPos -1) < 0 ) 
			inicioString = curPos;
		else
			inicioString = curPos-1;
			
		str1 = (String) str.substring(0, inicioString);
		String str2 = (String) str.substring(curPos);

		e.setText(str1+str2);
		e.setSelection(inicioString);
		
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

	public void onClickSpace (View v){
		updateNumbers(v, " ");
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

package br.gov.pr.datepicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class SpecialNumberActivity extends Activity {

	Boolean FullLayout = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_special_number);

		
		/*
		 * Adicionando o evento de long click no botão 1e
		 * 
		 */

		Button button = (Button) findViewById(R.id.button_1e);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "!");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 2a
		 * 
		 */

		button = (Button) findViewById(R.id.button_2a);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "@");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 3c
		 * 
		 */

		button = (Button) findViewById(R.id.button_3c);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "#");
		            return true;
		        }
		    });



		/*
		 * Adicionando o evento de long click no botão {[
		 * 
		 */

		button = (Button) findViewById(R.id.button_left_square_curly_braces);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "{");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 4d
		 * 
		 */

		button = (Button) findViewById(R.id.button_4d);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "$");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 5p
		 * 
		 */

		button = (Button) findViewById(R.id.button_5p);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "%");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 6e
		 * 
		 */

		button = (Button) findViewById(R.id.button_6e);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "^");
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
		 * Adicionando o evento de long click no botão 7e
		 * 
		 */

		button = (Button) findViewById(R.id.button_7e);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "&");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 8a
		 * 
		 */

		button = (Button) findViewById(R.id.button_8a);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "*");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 9p
		 * 
		 */

		button = (Button) findViewById(R.id.button_9p);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "(");
		            return true;
		        }
		    });
		
		
		/*
		 * Adicionando o evento de long click no botão /?
		 * 
		 */

		button = (Button) findViewById(R.id.button_div_question);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "?");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão ,<
		 * 
		 */

		button = (Button) findViewById(R.id.button_comma_less_than);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "<");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão 0p
		 * 
		 */

		button = (Button) findViewById(R.id.button_0p);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, ")");
		            return true;
		        }
		    });

		/*
		 * Adicionando o evento de long click no botão .>
		 * 
		 */

		button = (Button) findViewById(R.id.button_period_greater_than);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, ">");
		            return true;
		        }
		    });
		
		
		/*
		 * Adicionando o evento de long click no botão ;:
		 * 
		 */

		button = (Button) findViewById(R.id.button_semi_colon);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, ":");
		            return true;
		        }
		    });

		
		/*
		 * Adicionando o evento de long click no botão -_
		 * 
		 */

		button = (Button) findViewById(R.id.button_minus_underscore);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "_");
		            return true;
		        }
		    });

	
		/*
		 * Adicionando o evento de long click no botão =+
		 * 
		 */

		button = (Button) findViewById(R.id.button_equal_plus);

		button.setOnLongClickListener(new OnLongClickListener() { 
		        @Override
		        public boolean onLongClick(View v) {
		            // TODO Auto-generated method stub
		    		updateNumbers(v, "+");
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

	
	public void exit(View v){
		
		EditText e = (EditText) findViewById(R.id.numbers);

		String numbers = (String) e.getText().toString();
		
    	Intent intent = new Intent(this, MainActivity.class);
    	intent.putExtra("NUMBER_SELECTED", numbers);
		setResult(RESULT_OK, intent);
		finish();
		
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


	public void onClick1e (View v){
		updateNumbers(v, "1");
	}

	public void onClick2a (View v){
		updateNumbers(v, "2");
	}

	public void onClick3c (View v){
		updateNumbers(v, "3");
	}

	public void onClickSpace (View v){
		updateNumbers(v, " ");
	}

	public void onClickLeftSquareCurlyBraces (View v){
		updateNumbers(v, "[");
	}

	public void onClick4d (View v){
		updateNumbers(v, "4");
	}

	public void onClick5p (View v){
		updateNumbers(v, "5");
	}

	public void onClick6e (View v){
		updateNumbers(v, "6");
	}

	public void onClickRightSquareCurlyBraces (View v){
		updateNumbers(v, "]");
	}


	public void onClick7e (View v){
		updateNumbers(v, "7");
	}

	public void onClick8a (View v){
		updateNumbers(v, "8");
	}

	public void onClick9p (View v){
		updateNumbers(v, "9");
	}

	public void onClickDivQuestion (View v){
		updateNumbers(v, "/");
	}
	
	
	
	public void onClickSemiColon (View v){
		updateNumbers(v, ";");
	}

	public void onClickMinusUnderscore (View v){
		updateNumbers(v, "-");
	}

	public void onClickCommaLessThan (View v){
		updateNumbers(v, ",");
	}

	public void onClick0p (View v){
		updateNumbers(v, "0");
	}

	public void onClickPeriodGreaterThan (View v){
		updateNumbers(v, ".");
	}

	public void onClickEqualPlus (View v){
		updateNumbers(v, "=");
	}

	public void onClickOk (View v){
		exit(v);
	}

}

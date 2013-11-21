package br.gov.pr.datepicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class TimeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_time);

		android.text.format.DateFormat df = new android.text.format.DateFormat();
		CharSequence now = df.format("hh:mm", new java.util.Date());

		Button botao = (Button)findViewById(R.id.btn_hour1);
		botao.setText(now.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.btn_hour2);
		botao.setText(now.subSequence(1, 2));

		botao = (Button)findViewById(R.id.btn_min1);
		botao.setText(now.subSequence(3, 4));

		botao = (Button)findViewById(R.id.btn_min2);
		botao.setText(now.subSequence(4, 5));


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.date, menu);
		return true;
	}

	public void exit(View v){
		
		Button btn_hour1 = (Button) findViewById(R.id.btn_hour1);  
		Button btn_hour2 = (Button) findViewById(R.id.btn_hour2);  

		Button btn_min1 = (Button) findViewById(R.id.btn_min1);  
		Button btn_min2 = (Button) findViewById(R.id.btn_min2);  

		String now = (String) btn_hour1.getText() + btn_hour2.getText() + ":" + btn_min1.getText() + btn_min2.getText();
		
    	Intent intent = new Intent(this, MainActivity.class);
    	intent.putExtra("TIME_SELECTED", now);
		setResult(RESULT_OK, intent);
		finish();
		
	}


	public boolean isValidTime(String date)
	{
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	    
	    // declare and initialize testDate variable, this is what will hold
	    // our converted string
	    
	    Date testDate = null;

	    // we will now try to parse the string into date form
	    try
	    {
	      testDate = sdf.parse(date);
	    }

	    // if the format of the string provided doesn't match the format we 
	    // declared in SimpleDateFormat() we will get an exception

	    catch (ParseException e)
	    {
	      return false;
	    }


	    if (!sdf.format(testDate).equals(date)) 
	    {
	      return false;
	    }
	    
	    // if we make it to here without getting an error it is assumed that
	    // the date was a valid one and that it's in the proper format
	    return true;
	} // end isValidDate

	
	
	public void updateValue(View v, String val){
		Button botao = (Button) getWindow().getCurrentFocus(); 

		Button btn_hour1 = (Button) findViewById(R.id.btn_hour1);  
		Button btn_hour2 = (Button) findViewById(R.id.btn_hour2);  

		Button btn_min1 = (Button) findViewById(R.id.btn_min1);  
		Button btn_min2 = (Button) findViewById(R.id.btn_min2);  

		Boolean validated = false;
		
		String strTimeToValidate= "";
		
		switch (botao.getId()) {
		case R.id.btn_hour1:

			
			// later I'll have to surround this test with a date style format to check if it's set to a 24h clock
			if (val.equals("2")){
				if (Integer.parseInt((String) btn_hour2.getText()) > 3 ){
					btn_hour2.setText("0");
				}
			}
			
			strTimeToValidate = (String) val + btn_hour2.getText() + ":" + btn_min1.getText() + btn_min2.getText();
			
			// have to check and validate hour here to make sure hour and focus position would be right
			/*
			 * if butt > 2 
			 *  if b1 =  1 then
			 *  	if 1 +X == valid -> go ahead, turn to 1+X
			 *  else
			 *  	if 0 +X == valid -> go ahead, turn to 0+X
			 *  fi
			 * fi
			 */
			
			
			if (Integer.parseInt((String) val) > 2 ){

				String strTimeToCheckDouble = "";
				String newHour1="";
				
				if (Integer.parseInt((String) btn_hour1.getText()) == 1 ){
					newHour1 = "1";
				} else {
					newHour1 = "0";
				}
				
				strTimeToCheckDouble = (String)  newHour1 + val + ":" + btn_min1.getText() + btn_min2.getText();

				validated = isValidTime(strTimeToCheckDouble);
	
				if (validated) {
					// change both buttons to make sure that the entire hour will change
					btn_hour1.setText(newHour1);
					btn_hour2.setText(val);
					// change the button to make sure it goes to minute after changing hour
					botao = btn_hour2;
				}
				// make sure that the validation with the previous value will occur and "nothing" has changed
				validated = false;
			}

			break;
		case R.id.btn_hour2:

			strTimeToValidate = (String) btn_hour1.getText() + val + ":" + btn_min1.getText() + btn_min2.getText();
			break;

		case R.id.btn_min1:
			if ( Integer.parseInt((String) val) < 6){
				strTimeToValidate = (String) btn_hour1.getText() + btn_hour2.getText() + ":" + val + btn_min2.getText();
			}
			break;
		case R.id.btn_min2:
			strTimeToValidate = (String) btn_hour1.getText() + btn_hour2.getText() + ":" + btn_min1.getText() + val ;
			break;
		default:
			break;
		}

		validated = isValidTime(strTimeToValidate);
		
		if (validated) {
			// atribui o valor validado
			botao.setText(val);
		} 
		
		// tive que mudar o foco para FOCUS_DOWN porque a api 10 não tem o FOCUS_Forward
		Button bnext = (Button) botao.focusSearch(View.FOCUS_DOWN);

		// Esse teste foi feito por causa da api 10 não ter o focus_forward e capotar quando vai para o focus_down no último botão da 
		// linha
		if(botao.getId() == R.id.btn_min2){
			bnext = btn_hour1;
		}

		
		bnext.requestFocus();

	}

	
	
	public void onClickButton1(View v){
		this.updateValue(v, "1");
	}

	
	public void onClickButton2(View v){
		this.updateValue(v, "2");
	}
	
	public void onClickButton3(View v){
		this.updateValue(v, "3");

	}

	public void onClickButton4(View v){
		this.updateValue(v, "4");
	}

	public void onClickButton5(View v){
		this.updateValue(v, "5");
	}

	public void onClickButton6(View v){
		this.updateValue(v, "6");
	}

	public void onClickButton7(View v){
		this.updateValue(v, "7");
	}
	
	public void onClickButton8(View v){
		this.updateValue(v, "8");
	}

	public void onClickButton9(View v){
		this.updateValue(v, "9");
	}
	
	public void onClickButton0(View v){
		this.updateValue(v, "0");
	}
	
	public void onClickButton00Min(View v){

		Button btn_min1 = (Button) findViewById(R.id.btn_min1);  
		Button btn_min2 = (Button) findViewById(R.id.btn_min2);  

		btn_min1.setText("0");
		btn_min2.setText("0");
		
	}
	
	public void onClickButton15Min(View v){

		Button btn_min1 = (Button) findViewById(R.id.btn_min1);  
		Button btn_min2 = (Button) findViewById(R.id.btn_min2);  

		btn_min1.setText("1");
		btn_min2.setText("5");

	}

	public void onClickButton30Min(View v){
		Button btn_min1 = (Button) findViewById(R.id.btn_min1);  
		Button btn_min2 = (Button) findViewById(R.id.btn_min2);  

		btn_min1.setText("3");
		btn_min2.setText("0");

	}
	
	public void onClickButton45Min(View v){
		Button btn_min1 = (Button) findViewById(R.id.btn_min1);  
		Button btn_min2 = (Button) findViewById(R.id.btn_min2);  

		btn_min1.setText("4");
		btn_min2.setText("5");

	}

	

	public void onClickButtonMin1Hour(View v){
		
		Button btn_hour1 = (Button) findViewById(R.id.btn_hour1);  
		Button btn_hour2 = (Button) findViewById(R.id.btn_hour2);  

		// recupera o valor dos dias e decrementa 
		
		int decHour = Integer.parseInt((String) btn_hour1.getText() + (String) btn_hour2.getText());
		decHour = decHour-1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strdecday ="01";
		
		if (decHour < 1){
			strdecday = "23";
		}else if (decHour < 10){
			strdecday = "0" + String.valueOf(decHour);
		}else{
			strdecday = String.valueOf(decHour);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.btn_hour1);
		botao.setText(strdecday.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.btn_hour2);
		botao.setText(strdecday.subSequence(1, 2));

	}

	public void onClickButtonPlus1Hour(View v){

		Button btn_hour1 = (Button) findViewById(R.id.btn_hour1);  
		Button btn_hour2 = (Button) findViewById(R.id.btn_hour2);  

		// recupera o valor dos dias e decrementa 
		
		int inchour = Integer.parseInt((String) btn_hour1.getText() + (String) btn_hour2.getText());
		inchour = inchour+1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strinchour ="23";
		
		if (inchour > 23){
			strinchour = "00";
		}else if (inchour < 10){
			strinchour = "0" + String.valueOf(inchour);
		}else{
			strinchour = String.valueOf(inchour);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.btn_hour1);
		botao.setText(strinchour.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.btn_hour2);
		botao.setText(strinchour.subSequence(1, 2));

	}

}
	
	

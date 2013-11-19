package br.gov.pr.datepicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
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

	public String exit(View v){
		
		Button btn_hour1 = (Button) findViewById(R.id.btn_hour1);  
		Button btn_hour2 = (Button) findViewById(R.id.btn_hour2);  

		Button btn_min1 = (Button) findViewById(R.id.btn_min1);  
		Button btn_min2 = (Button) findViewById(R.id.btn_min2);  

		String now = (String) btn_hour1.getText() + btn_hour2.getText() + ":" + btn_min1.getText() + btn_min2.getText();
		return now;
		
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
			strTimeToValidate = (String) val + btn_hour2.getText() + ":" + btn_min1.getText() + btn_min2.getText();
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
		
		Button bnext = (Button) botao.focusSearch(View.FOCUS_FORWARD);
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
	
	
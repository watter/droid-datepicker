package br.gov.pr.datepicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
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

		updateLongDate((View) findViewById(R.layout.activity_date));

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.date, menu);
		return true;
	}

	public void exit(View v){
		
		Button btn_d1 = (Button) findViewById(R.id.button_d1);  
		Button btn_d2 = (Button) findViewById(R.id.button_d2);  

		Button btn_m1 = (Button) findViewById(R.id.button_m1);  
		Button btn_m2 = (Button) findViewById(R.id.button_m2);  

		Button btn_y1 = (Button) findViewById(R.id.button_y1);  
		Button btn_y2 = (Button) findViewById(R.id.button_y2);  
		Button btn_y3 = (Button) findViewById(R.id.button_y3);  
		Button btn_y4 = (Button) findViewById(R.id.button_y4);  

		String StrActualDate = (String) btn_d1.getText() + btn_d2.getText() + "/" + btn_m1.getText() + btn_m2.getText() + "/" + btn_y1.getText() + btn_y2.getText() + btn_y3.getText() + btn_y4.getText();

		Boolean validated = false;
		
		validated = isValidDate(StrActualDate);
		
		if (validated) {
			Intent intent = new Intent(this, MainActivity.class);
			intent.putExtra("DATE_SELECTED", StrActualDate);
			setResult(RESULT_OK, intent);
			finish();
		}
	}

	public void updateLongDate(View v){
		
		Button botao = (Button)findViewById(R.id.btn_dateString);

		Button btn_d1 = (Button) findViewById(R.id.button_d1);  
		Button btn_d2 = (Button) findViewById(R.id.button_d2);  

		Button btn_m1 = (Button) findViewById(R.id.button_m1);  
		Button btn_m2 = (Button) findViewById(R.id.button_m2);  

		Button btn_y1 = (Button) findViewById(R.id.button_y1);  
		Button btn_y2 = (Button) findViewById(R.id.button_y2);  
		Button btn_y3 = (Button) findViewById(R.id.button_y3);  
		Button btn_y4 = (Button) findViewById(R.id.button_y4);  

		String StrActualDate = (String) btn_d1.getText() + btn_d2.getText() + "/" + btn_m1.getText() + btn_m2.getText() + "/" + btn_y1.getText() + btn_y2.getText() + btn_y3.getText() + btn_y4.getText();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		
		String long_today="";

		try {
			Date data = sdf.parse(StrActualDate);
			sdf = new SimpleDateFormat("EEE, dd MMM yyyy");
			long_today = sdf.format(data);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		botao.setText(long_today);
		
	}

	// Chopped from: http://www.dreamincode.net/forums/topic/14886-date-validation-using-simpledateformat/
	// date validation using SimpleDateFormat
	// it will take a string and make sure it's in the proper 
	// format as defined by you, and it will also make sure that
	// it's a legal date

	public boolean isValidDate(String date)
	{
	    // set date format, this can be changed to whatever format
	    // you want, MM-dd-yyyy, MM.dd.yyyy, dd.MM.yyyy etc.
	    // you can read more about it here:
	    // http://java.sun.com/j2se/1.4.2/docs/api/index.html
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    
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

	    // dateformat.parse will accept any date as long as it's in the format
	    // you defined, it simply rolls dates over, for example, december 32 
	    // becomes jan 1 and december 0 becomes november 30
	    // This statement will make sure that once the string 
	    // has been checked for proper formatting that the date is still the 
	    // date that was entered, if it's not, we assume that the date is invalid

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

		Button btn_d1 = (Button) findViewById(R.id.button_d1);  
		Button btn_d2 = (Button) findViewById(R.id.button_d2);  

		Button btn_m1 = (Button) findViewById(R.id.button_m1);  
		Button btn_m2 = (Button) findViewById(R.id.button_m2);  

		Button btn_y1 = (Button) findViewById(R.id.button_y1);  
		Button btn_y2 = (Button) findViewById(R.id.button_y2);  
		Button btn_y3 = (Button) findViewById(R.id.button_y3);  
		Button btn_y4 = (Button) findViewById(R.id.button_y4);  

		Boolean validated = false;
		
		String StrDateToValidate= "";
		
		switch (botao.getId()) {
		case R.id.button_d1:
			StrDateToValidate = (String) val + btn_d2.getText() + "/" + btn_m1.getText() + btn_m2.getText() + "/" + btn_y1.getText() + btn_y2.getText() + btn_y3.getText() + btn_y4.getText();
			break;
		case R.id.button_d2:
			StrDateToValidate = (String) btn_d1.getText() + val + "/" + btn_m1.getText() + btn_m2.getText() + "/" + btn_y1.getText() + btn_y2.getText() + btn_y3.getText() + btn_y4.getText();
			break;

		case R.id.button_m1:
			// se o valor == 1 para o mes, tem que colocar o 0 para poder validar a data
			if (val.equals("1")){
				btn_m2.setText("0");
			}
			StrDateToValidate = (String) btn_d1.getText() + btn_d2.getText() + "/" + val + btn_m2.getText() + "/" + btn_y1.getText() + btn_y2.getText() + btn_y3.getText() + btn_y4.getText();			
			break;
		case R.id.button_m2:
			StrDateToValidate = (String) btn_d1.getText() + btn_d2.getText() + "/" + btn_m1.getText() + val + "/" + btn_y1.getText() + btn_y2.getText() + btn_y3.getText() + btn_y4.getText();			
			
			break;
		case R.id.button_y1:
			StrDateToValidate = (String) btn_d1.getText() + btn_d2.getText() + "/" + btn_m1.getText() + btn_m2.getText() + "/" + val + btn_y2.getText() + btn_y3.getText() + btn_y4.getText();			
			
			break;
		case R.id.button_y2:
			StrDateToValidate = (String) btn_d1.getText() + btn_d2.getText() + "/" + btn_m1.getText() + btn_m2.getText() + "/" + btn_y1.getText() + val + btn_y3.getText() + btn_y4.getText();			
			
			break;
		case R.id.button_y3:
			StrDateToValidate = (String) btn_d1.getText() + btn_d2.getText() + "/" + btn_m1.getText() + btn_m2.getText() + "/" + btn_y1.getText() + btn_y2.getText() + val + btn_y4.getText();			
			
			break;
		case R.id.button_y4:
			StrDateToValidate = (String) btn_d1.getText() + btn_d2.getText() + "/" + btn_m1.getText() + btn_m2.getText() + "/" + btn_y1.getText() + btn_y2.getText() + btn_y3.getText() + val;			
			
			break;

		default:
			break;
		}

		validated = isValidDate(StrDateToValidate);
		
		if (validated) {
			// atribui o valor validado
			botao.setText(val);
		} 
		

		// tive que mudar o foco para FOCUS_DOWN porque a api 10 não tem o FOCUS_Forward
		Button bnext = (Button) botao.focusSearch(View.FOCUS_DOWN);

		// Esse teste foi feito por causa da api 10 não ter o focus_forward e capotar quando vai para o focus_down no último botão da 
		// linha
		if(botao.getId() == R.id.button_y4){
			bnext = btn_d1;
		}
		
		bnext.requestFocus();

		// atualiza campo de data na linha abaixo do ok
		this.updateLongDate(v);

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

		// atualiza campo de data na linha abaixo do ok
		this.updateLongDate(v);
	}

	public void onClickButtonMin1m(View v){
		Button btn_m1 = (Button) findViewById(R.id.button_m1);  
		Button btn_m2 = (Button) findViewById(R.id.button_m2);  

		// recupera o valor dos dias e decrementa 
		
		int decmonth = Integer.parseInt((String) btn_m1.getText() + (String) btn_m2.getText());
		decmonth = decmonth-1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strdecmonth ="01";
		
		if (decmonth < 1){
			strdecmonth = "01";
		}else if (decmonth < 10){
			strdecmonth = "0" + String.valueOf(decmonth);
		}else{
			strdecmonth = String.valueOf(decmonth);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.button_m1);
		botao.setText(strdecmonth.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.button_m2);
		botao.setText(strdecmonth.subSequence(1, 2));

		// atualiza campo de data na linha abaixo do ok
		this.updateLongDate(v);
	}
	
	public void onClickButtonMin1y(View v){
		Button btn_y1 = (Button) findViewById(R.id.button_y1);  
		Button btn_y2 = (Button) findViewById(R.id.button_y2);  
		Button btn_y3 = (Button) findViewById(R.id.button_y3);  
		Button btn_y4 = (Button) findViewById(R.id.button_y4);  

		// recupera o valor dos dias e decrementa 
		
		int decyear = Integer.parseInt((String) btn_y1.getText() + (String) btn_y2.getText() + (String) btn_y3.getText() + (String) btn_y4.getText());
		decyear = decyear-1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strdecyear = "2013";
		
		if (decyear < 1000){
			strdecyear = "0" + String.valueOf(decyear);
		}else{
			strdecyear = String.valueOf(decyear);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.button_y1);
		botao.setText(strdecyear.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.button_y2);
		botao.setText(strdecyear.subSequence(1, 2));

		botao = (Button)findViewById(R.id.button_y3);
		botao.setText(strdecyear.subSequence(2, 3));
		
		botao = (Button)findViewById(R.id.button_y4);
		botao.setText(strdecyear.subSequence(3, 4));

		// atualiza campo de data na linha abaixo do ok
		this.updateLongDate(v);
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
			strincday = "01";
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

		// atualiza campo de data na linha abaixo do ok
		this.updateLongDate(v);
	}

	public void onClickButtonPlus1m(View v){

		Button btn_m1 = (Button) findViewById(R.id.button_m1);  
		Button btn_m2 = (Button) findViewById(R.id.button_m2);  

		// recupera o valor dos dias e decrementa 
		
		int incmonth = Integer.parseInt((String) btn_m1.getText() + (String) btn_m2.getText());
		incmonth = incmonth+1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strincmonth ="12";
		
		if (incmonth > 12){
			strincmonth = "01";
		}else if (incmonth < 10){
			strincmonth = "0" + String.valueOf(incmonth);
		}else{
			strincmonth = String.valueOf(incmonth);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.button_m1);
		botao.setText(strincmonth.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.button_m2);
		botao.setText(strincmonth.subSequence(1, 2));

		// atualiza campo de data na linha abaixo do ok
		this.updateLongDate(v);
	}
	
	public void onClickButtonPlus1y(View v){

		Button btn_y1 = (Button) findViewById(R.id.button_y1);  
		Button btn_y2 = (Button) findViewById(R.id.button_y2);  
		Button btn_y3 = (Button) findViewById(R.id.button_y3);  
		Button btn_y4 = (Button) findViewById(R.id.button_y4);  

		// recupera o valor dos dias e decrementa 
		
		int incyear = Integer.parseInt((String) btn_y1.getText() + (String) btn_y2.getText() + (String) btn_y3.getText() + (String) btn_y4.getText());
		incyear = incyear+1;
		
		// testa o valor do dia, onde o menor dia é dia 01 
		String strincyear = "2013";
		
		if (incyear < 1000){
			strincyear = "0" + String.valueOf(incyear);
		}else{
			strincyear = String.valueOf(incyear);
		}

		// Atribui os valores
		
		Button botao = (Button)findViewById(R.id.button_y1);
		botao.setText(strincyear.subSequence(0, 1));
		
		botao = (Button)findViewById(R.id.button_y2);
		botao.setText(strincyear.subSequence(1, 2));

		botao = (Button)findViewById(R.id.button_y3);
		botao.setText(strincyear.subSequence(2, 3));
		
		botao = (Button)findViewById(R.id.button_y4);
		botao.setText(strincyear.subSequence(3, 4));

		// atualiza campo de data na linha abaixo do ok
		this.updateLongDate(v);
	}


}

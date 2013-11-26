package br.gov.pr.datepicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	static final int SELECT_DATE = 0;
	static final int SELECT_TIME = 1;
	static final int SELECT_NUMBER = 2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void onClickDate(View v){
    	Intent intent = new Intent(this, DateActivity.class);
    	startActivityForResult(intent, SELECT_DATE);
    }
    
    public void onClickTime(View v){
    	Intent intent = new Intent(this, TimeActivity.class);
    	startActivityForResult(intent, SELECT_TIME);
    }

    public void onClickNumber(View v){
    	Intent intent = new Intent(this, NumberActivity.class);
    	startActivityForResult(intent, SELECT_NUMBER);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SELECT_DATE) {
            if (resultCode == RESULT_OK) {
                Button b = (Button) findViewById(R.id.button_res);
                // colocar a string certa aqui
                b.setText(data.getExtras().getString("DATE_SELECTED"));
                
            }
        }
        else if (requestCode == SELECT_TIME) {
            if (resultCode == RESULT_OK) {
                Button b = (Button) findViewById(R.id.button_res);
                // Recupera da intent recebida no resultado o parametro TIME_SELECTED colocado na intent que veio no resultado
                b.setText(data.getExtras().getString("TIME_SELECTED"));
            }
        } else if (requestCode == SELECT_NUMBER) {
            if (resultCode == RESULT_OK) {
                Button b = (Button) findViewById(R.id.button_res);
                // Recupera da intent recebida no resultado o parametro TIME_SELECTED colocado na intent que veio no resultado
                b.setText(data.getExtras().getString("NUMBER_SELECTED"));
            }
        }
    }
    


}

package com.example.rx9;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends Activity {
	//�ȶ���һ��������
	private Switch switch1;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //���⿪ʼ�Լ�д
        Switch switchTest = (Switch) findViewById(R.id.switch1);
        switchTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {  
                    @Override  
                    public void onCheckedChanged(CompoundButton buttonView,  
                            boolean isChecked) {  
                        Toast.makeText(MainActivity.this, isChecked + " ��ͷ���㣡",  
                                Toast.LENGTH_SHORT).show();  
                    }  
                });
        //����ͽ�����
        
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

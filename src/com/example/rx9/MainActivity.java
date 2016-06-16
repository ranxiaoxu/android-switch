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
	//先定义一个变量嘛
	private Switch switch1;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //从这开始自己写
        Switch switchTest = (Switch) findViewById(R.id.switch1);
        switchTest.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {  
                    @Override  
                    public void onCheckedChanged(CompoundButton buttonView,  
                            boolean isChecked) {  
                        Toast.makeText(MainActivity.this, isChecked + " 猪头爱你！",  
                                Toast.LENGTH_SHORT).show();  
                    }  
                });
        //这里就结束了
        
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

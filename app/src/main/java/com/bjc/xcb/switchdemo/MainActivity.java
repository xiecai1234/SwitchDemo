package com.bjc.xcb.switchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    private Switch aSwitch;
    private SwitchCompat aSwitchCompat;
    private TextView text1,text2,switchText,switchCompatText;
    private ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //实例化
        aSwitch = (Switch) findViewById(R.id.switch1);
        aSwitchCompat = (SwitchCompat) findViewById(R.id.switch_compat);
        text1 = (TextView) findViewById(R.id.text);
        text2 = (TextView) findViewById(R.id.text1);
        //设置Switch事件监听
        aSwitch.setOnCheckedChangeListener(this);
        aSwitchCompat.setOnCheckedChangeListener(this);


        tb = (ToggleButton)findViewById(R.id.togglebutton);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){
                    Toast.makeText(MainActivity.this, "it's on now", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "it's off now", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    /*
    继承监听器的接口并实现onCheckedChanged方法
    * */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.switch1:
                if(isChecked){
                    text1.setText("开");
                }else {
                    text1.setText("关");
                }
                break;
            case R.id.switch_compat:
                if(isChecked){
                    text2.setText("开");
                }else {
                    text2.setText("关");
                }
                break;
            default:
                break;
        }
    }

}

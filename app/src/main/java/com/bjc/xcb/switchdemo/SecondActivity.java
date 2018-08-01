package com.bjc.xcb.switchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private SwitchCompat customSwitchCompat;
    private TextView custom_result,CustomSwitchCompat_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actiity_second);
        //实例化
        customSwitchCompat = (SwitchCompat) findViewById(R.id.CustomSwitchCompat);
        custom_result = (TextView) findViewById(R.id.custom_result);
        //设置自定义的thumb和track
        customSwitchCompat.setThumbResource(R.drawable.thumb_selector);
        customSwitchCompat.setTrackResource(R.drawable.track_selector);
        //设置Switch事件监听
        customSwitchCompat.setOnCheckedChangeListener(this);
    }

    /*
    继承监听器的接口并实现onCheckedChanged方法
    * */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            custom_result.setText("开");
        }else {
            custom_result.setText("关");
        }
    }
}

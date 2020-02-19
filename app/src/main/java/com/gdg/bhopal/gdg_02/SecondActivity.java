package com.gdg.bhopal.gdg_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.TextureView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1=(TextView) findViewById(R.id.textView2);
        tv2=(TextView)findViewById(R.id.age);
        tv3=(TextView)findViewById(R.id.gender);
        tv4=(TextView)findViewById(R.id.phone);
        tv5=(TextView)findViewById(R.id.emaili);


        tv1.setText(getIntent().getStringExtra("NAME"));
        tv2.setText(getIntent().getStringExtra("NAM"));
        tv3.setText(getIntent().getStringExtra("NAM1"));
        tv4.setText(getIntent().getStringExtra("NAM2"));
        tv5.setText(getIntent().getStringExtra("NAM3"));

    }
}

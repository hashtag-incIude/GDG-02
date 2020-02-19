package com.gdg.bhopal.gdg_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView,tv1,sd;
    private ProgressBar progressBar;
    private SeekBar seekBar;
    private Button btn;
    private EditText editText;
    private RadioButton rd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.nameEdt);
        rd=(RadioButton) findViewById(R.id.male);
        textView = (TextView) findViewById(R.id.textView);
        tv1 = (TextView) findViewById(R.id.phonenumber);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        btn=(Button)findViewById(R.id.submitBtn);
        sd=(TextView) findViewById(R.id.email);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                textView.setText("" + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=editText.getText().toString();
                String na=textView.getText().toString();
                String radio=rd.getText().toString();
                String pn=tv1.getText().toString();
                String ed=sd.getText().toString();

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("NAM",na);
                intent.putExtra("NAM1",radio);
                intent.putExtra("NAM2",pn);
                intent.putExtra("NAM3",ed);

                startActivity(intent);
            }
        });
    }
}

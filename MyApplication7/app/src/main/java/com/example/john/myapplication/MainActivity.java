package com.example.john.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnOne,btnTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnTwo.getText().toString().equals("按钮不可用")){
                    Log.v("按钮是否可用","打印出按钮可用");
                    btnOne.setEnabled(false);
                    btnTwo.setText("按钮可用");
                }else{
                    Log.v("按钮是否可用","打印出按钮不不不不不不不不可用");
                    btnOne.setEnabled(true);
                    btnTwo.setText("按钮不可用");
                }
            }
        });

    }
}

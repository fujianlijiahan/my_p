package com.example.john.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.util.Log;

public class SixActivity extends AppCompatActivity {
    private TextView txtZQD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view3);
        txtZQD = (TextView) findViewById(R.id.txtZQD);

        Drawable[] drawable = txtZQD.getCompoundDrawables();
        // 数组下表0~3,依次是:左上右下
        drawable[1].setBounds(100, 0, 200, 200);
        txtZQD.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);
    }
}

package com.kontoschris.homegardenapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainFormActivity extends AppCompatActivity {
    TextView tvUsr;
    TextView tvPwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);

        tvUsr = findViewById(R.id.tvLoginUsr);
        tvPwd = findViewById(R.id.tvLoginPwd);

        String sUsr = getIntent().getStringExtra("username");
        String sPwd  = getIntent().getStringExtra("password");

        tvUsr.setText(sUsr);
        tvPwd.setText(sPwd);
    }
}
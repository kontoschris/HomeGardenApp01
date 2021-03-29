package com.kontoschris.homegardenapp01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginFormActivity extends AppCompatActivity {
    EditText edtPwd;
    EditText edtUsr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtPwd = findViewById(R.id.edtPwd);
        edtUsr = findViewById(R.id.edtUsr);
    }

    public void openMainFormActivity(View view){
        Intent intent = new Intent(LoginFormActivity.this, MainFormActivity.class);

        String sUsr = edtUsr.getText().toString();
        intent.putExtra("username", edtUsr.getText().toString());
        intent.putExtra("password", edtPwd.getText().toString());
        startActivity(intent);
    }




}
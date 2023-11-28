package com.example.cisco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button loginButton;
    TextView validatemsg;
    String userid, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.loginbtn);
        user = findViewById(R.id.userid);
        pass = findViewById(R.id.userpassword);
        validatemsg = findViewById(R.id.errormsg);


        //Login Button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userid = user.getText().toString();
                password = pass.getText().toString();
                if (userid.equals("100010") && password.equals("cisco@123")){
                    validatemsg.setVisibility(View.INVISIBLE);
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else {
                    validatemsg.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
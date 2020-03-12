package com.example.edurekaass12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText userName, Password, error;
    String gotUserName, gotPassword;

    public void setSubmit(View view){
        gotUserName = userName.getText().toString();
        gotPassword = Password.getText().toString();
        if(gotUserName == "321" && gotPassword == "123"){
            submit.setEnabled(false);
            error.setText("Successfully logged in");

        }else{
            error.setText("wrong username or password");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submitButton);
        userName = (EditText) findViewById(R.id.usrNameEditText);
        Password = (EditText) findViewById(R.id.passwordEditText);
        error = (EditText) findViewById(R.id.errorEditText);
    }
}

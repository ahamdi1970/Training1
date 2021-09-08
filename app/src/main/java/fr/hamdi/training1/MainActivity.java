package fr.hamdi.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    public final static String USER_NAME = null;
    private Button loginButton;
    private EditText emailEdit;
    private EditText passwordEdit;
    private EditText userName;
    private TextView userNamelogged;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login_button);
        emailEdit = findViewById(R.id.email_edit);
        passwordEdit = findViewById(R.id.password_edit);
        userName = findViewById(R.id.user_edit);
        loginButton.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                String refemail = emailEdit.getText().toString();
                String refpwd = passwordEdit.getText().toString();



                if (refemail.equals("admin@admin.com") && refpwd.equals("admin")) {
                    Toast.makeText(MainActivity.this, getString(R.string.access_ok), Toast.LENGTH_SHORT).show();
                    Intent menuLogin = new Intent(getApplicationContext(), MenuLoginActivity.class);
                    String name =  userName.getText().toString();
// Add the data to the intent using the key
                    menuLogin.putExtra("name_key",name);
                    startActivity(menuLogin);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, getString(R.string.access_ko), Toast.LENGTH_SHORT).show();


                }
            }


        });
    }
}
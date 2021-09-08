package fr.hamdi.training1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MenuLoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);

        TextView userNamelogged;
        userNamelogged = findViewById(R.id.user_name);
// Getting the intent which started this activity
        Intent intent = getIntent();
// Get the data of the activity providing the same key value
        String name = intent.getStringExtra("name_key");
// Display the name in the activty menuLogin
        name = "Welcome "+name;
        userNamelogged.setText(name);



    }




}
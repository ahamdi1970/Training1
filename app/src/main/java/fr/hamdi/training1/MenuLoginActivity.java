package fr.hamdi.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MenuLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.USER_NAME);
        Toast.makeText(MenuLoginActivity.this, message, Toast.LENGTH_LONG).show();
        System.out.println(message);

        }
}
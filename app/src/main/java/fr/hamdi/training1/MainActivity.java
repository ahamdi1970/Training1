package fr.hamdi.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn;
    TextView email;
    TextView pwd;
    private Object Button;
    private menulogin menulogin;
    private String refemail, refpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.Button);
        email = findViewById(R.id.Email);
        pwd = findViewById(R.id.Password);

        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                email.setOnClickListener(this);
                pwd.setOnClickListener(this);
                refemail = email.getText().toString();
                refpwd = pwd.getText().toString();


                if (refemail.equals("admin@admin.com") && refpwd.equals("admin")) {
                    Toast.makeText(MainActivity.this, "access granted !", Toast.LENGTH_SHORT).show();
                    Intent menuLogin = new Intent(getApplicationContext(), menulogin.class);
                    startActivity(menuLogin);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "access denied !!", Toast.LENGTH_SHORT).show();


                }
            }


        });
    }
}
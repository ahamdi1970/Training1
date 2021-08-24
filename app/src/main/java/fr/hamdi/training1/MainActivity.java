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
    private menulogin menulogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.Button);
        email = (TextView) findViewById(R.id.Email);
        pwd = (TextView) findViewById(R.id.Password);

        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (email.equals("admin@admin.com") && pwd.equals("admin"))
                    Toast.makeText(MainActivity.this, "access granted !", Toast.LENGTH_SHORT).show();
                    Intent = new Intent(this, menulogin);
                else Toast.makeText(MainActivity.this, "access denied !!", Toast.LENGTH_SHORT).show();



            }
        });
        email.setOnClickListener(this);
        pwd.setOnClickListener(this);


    }
}
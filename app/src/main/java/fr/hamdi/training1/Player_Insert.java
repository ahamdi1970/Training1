package fr.hamdi.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Player_Insert extends AppCompatActivity {

    Button buttonOk;
    Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_insert);

        buttonOk = findViewById(R.id.button_ok);
        buttonCancel = findViewById(R.id.button_cancel);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuLogin = new Intent(Player_Insert.this,MenuLoginActivity.class);
                startActivity(menuLogin);
            }
        });
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuLogin = new Intent(Player_Insert.this,MenuLoginActivity.class);
                startActivity(menuLogin);
            }
        });
    }
}
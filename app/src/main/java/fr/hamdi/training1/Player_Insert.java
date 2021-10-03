package fr.hamdi.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class Player_Insert extends AppCompatActivity {

    Button buttonOk, buttonCancel;
    List<Player_Model> player_modelList;
    MyApplication myApplication = (MyApplication) this.getApplication();
    EditText et_player_age, et_player_name, et_player_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_insert);

        buttonOk = findViewById(R.id.button_ok);
        buttonCancel = findViewById(R.id.button_cancel);
        player_modelList = myApplication.getmPlayerModelList();
        et_player_age = findViewById(R.id.et_player_age);
        et_player_name = findViewById(R.id.et_player_name);
        et_player_url = findViewById(R.id.et_player_imageURL);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // create Player object
                int nextId = myApplication.getNextId();
                Player_Model newPlayer = new Player_Model(nextId,et_player_age.getText().toString(),et_player_name.getText().toString(),et_player_url.getText().toString());

                // add the object to the global list of players
                player_modelList.add(newPlayer);
                //go back to menuLogin activity
                myApplication.setNextId(nextId++);
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
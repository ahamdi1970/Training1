package fr.hamdi.training1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

// this form serves to create a new player or edit a player

public class Player_Insert extends AppCompatActivity {

    Button buttonOk, buttonCancel;
    List<Player_Model> player_modelList;
    MyApplication myApplication = (MyApplication) this.getApplication();
    EditText et_player_age, et_player_name, et_player_url;
    TextView tv_playerId;
    int id;

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
        tv_playerId = findViewById(R.id.tv_player_id_number);

        Intent intent = getIntent();
        id = intent.getIntExtra("id",-1);
        Player_Model player = null;

        if ( id >= 0) {
            // edit the player
            for (Player_Model p: player_modelList){
                if (p.getId() == id) {
                    player = p;
                }
            }
            assert player != null;
            et_player_name.setText(player.getName());
            et_player_age.setText(player.getAge());
            et_player_url.setText(player.getImageURL());
            tv_playerId.setText(String.valueOf(id));

        }
        else {
            // create new player
        }

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (id >= 0){
                    //update mode
                    Player_Model updatedPlayer = new Player_Model(id,et_player_name.getText().toString(),et_player_age.getText().toString(),et_player_url.getText().toString());
                    player_modelList.set(id,updatedPlayer);
                }
                else {
                    // add new player
                    // create Player object
                    int nextId = myApplication.getNextId();
                    Player_Model newPlayer = new Player_Model(nextId,et_player_name.getText().toString(),et_player_age.getText().toString(),et_player_url.getText().toString());

                    // add the object to the global list of players
                    player_modelList.add(newPlayer);
                    myApplication.setNextId(nextId++);
                }
                //go back to menuLogin activity
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
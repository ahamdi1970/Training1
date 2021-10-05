package fr.hamdi.training1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

// this form serves to create a new player or edit a player

public class Player_Insert extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    Button buttonOk, buttonCancel;
    List<Player_Model> player_modelList;
    MyApplication myApplication = (MyApplication) this.getApplication();
    EditText et_player_age, et_player_name, et_player_url;
    TextView tv_playerId,tv_date;
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
        tv_date = findViewById ( R.id.date_integration );

        Button button_date = ( Button ) findViewById ( R.id.button_date_picker );
        button_date.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show ( getSupportFragmentManager (), "date picker");
            }
        });

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
            tv_date.setText ( player.getDate ());

        }
        else {
            // create new player
        }

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (id >= 0){
                    //update mode
                    Player_Model updatedPlayer = new Player_Model(id,et_player_name.getText().toString(),et_player_age.getText().toString(),et_player_url.getText().toString(),tv_date.getText ().toString ());
                    player_modelList.set(id,updatedPlayer);
                }
                else {
                    // add new player
                    // create Player object
                    int nextId = myApplication.getNextId();
                    Player_Model newPlayer = new Player_Model(nextId,et_player_name.getText().toString(),et_player_age.getText().toString(),et_player_url.getText().toString(),tv_date.getText ().toString ());

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


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView dateOfArrival = findViewById(R.id.tv_date_of_arrival);
        dateOfArrival.setText(currentDateString);
        tv_date.setText ( currentDateString );
    }
}
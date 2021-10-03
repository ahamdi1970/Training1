package fr.hamdi.training1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.ContentValues.TAG;


public class MenuLoginActivity extends AppCompatActivity {

    Button buttonInsert;
    RecyclerView recyclerView;
    MyAdapter mAdapter; //faut instancier mon adaptateur
    List<Player_Model> player_modelList;
    private static final String TAG = "Player App"; // pour suivre les logs
    MyApplication myApplication = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);

        player_modelList = myApplication.getmPlayerModelList();
        buildRecyclerView();
        Log.d(TAG, "onCreate: " + player_modelList.toString());
        Toast.makeText(this, "Player count = " + player_modelList.size(), Toast.LENGTH_LONG).show();

        buttonInsert = findViewById(R.id.button_insert);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playerInsert = new Intent(MenuLoginActivity.this,Player_Insert.class);
                startActivity(playerInsert);
             }
        });


    }



    private void buildRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        mAdapter = new MyAdapter(player_modelList, this); //définition de la variable globale
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void OnDeleteClick(int position) {
                removeItem(position);
            }
        });
    }

    public void removeItem(int position) {
        player_modelList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }
}








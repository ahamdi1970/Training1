package fr.hamdi.training1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MenuLoginActivity extends AppCompatActivity {

    String s1[];
    int images[] = {R.drawable.benzema,R.drawable.griezman,R.drawable.hernandez,R.drawable.kante,R.drawable.kimpembe,R.drawable.lloris,R.drawable.matuidi,R.drawable.mbappe,R.drawable.mendy,R.drawable.pogba,R.drawable.tolisso};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);

        s1 = getResources().getStringArray(R.array.football_players);
        recyclerView = findViewById(R.id.recyclerView);

        TextView userNamelogged;
        userNamelogged = findViewById(R.id.user_name);
// Getting the intent which started this activity
        Intent intent = getIntent();
// Get the data of the activity providing the same key value
        String name = intent.getStringExtra("name_key");
// Display the name in the activty menuLogin
        name = "Welcome "+name;
        userNamelogged.setText(name);

        MyAdapter myAdapter = new MyAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }




}
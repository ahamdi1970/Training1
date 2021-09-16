package fr.hamdi.training1;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MenuLoginActivity extends AppCompatActivity {

    List<Players> = new List<mPlayersList>;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);

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

        MyAdapter myAdapter = new MyAdapter(playersList, this);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));





    }




}
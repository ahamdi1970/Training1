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
    List<Player_Model> mPlayerModelList = new ArrayList<Player_Model>();
    private static final String TAG = "Player App"; // pour suivre les logs

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);


        fillPlayersList(); // methode remplissage de la liste des joueurs
        buildRecyclerView();
        Log.d(TAG, "onCreate: " + mPlayerModelList.toString());
        Toast.makeText(this, "Player count = " + mPlayerModelList.size(), Toast.LENGTH_LONG).show();

        buttonInsert = findViewById(R.id.button_insert);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playerInsert = new Intent(MenuLoginActivity.this,Player_Insert.class);
                startActivity(playerInsert);
             }
        });


    }


    private void fillPlayersList() {
        Player_Model p0 = new Player_Model("benzema", "http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcTjVi_AAcsDbAYbtH26dGbAVhUbNeBZMdKqL91BhvcHahhDq7g9WZ-vzXRHCvLg");
        Player_Model p1 = new Player_Model("griezman", "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTGp5_4Akz95vonXPLprZ4nWyZVZmBbwYNt2DMq_sYnITGPfpS66vgyWZ17xJHc");
        Player_Model p2 = new Player_Model("hernandez", "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcSzdJqlCNlUfgWdPUs7bP15oHyAzVD2n1ycgzUTh4I4_VleqeQHMQyXPxRGueec");
        Player_Model p3 = new Player_Model("kante", "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcRr95WqQn4EITY1stn_k6RLjZzEOBw_iSZLnEBpAEkHs064pzK8DADNypUK9KJI");
        Player_Model p4 = new Player_Model("kimpembe", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcRa6LSBDpIdDtg_pD9ZNw_9ZBcCTXgnE_KVb_l8YMkQ5iJjog8FhpsglJwf9IAL");
        Player_Model p5 = new Player_Model("lloris", "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcSbKGwIyRL59P-IYCDmEMqGhctpcKNrHhdPX2sjGJY-VE-NGHSxhC-HyM8WZxQS");
        Player_Model p6 = new Player_Model("matuidi", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Matuidi_Paris_SG.jpg/135px-Matuidi_Paris_SG.jpg");
        Player_Model p7 = new Player_Model("mbappe", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSm1IwsPZDVXMagZrFcX2o8neNG5SoTD1Gxnx1A_ApzHw3TBcuP");
        Player_Model p8 = new Player_Model("mendy", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/399071_sPICT.jpg/640px-399071_sPICT.jpg");
        Player_Model p9 = new Player_Model("pogba", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcSsifgiw71nj1zr-gEqSf_CW8uwrpauvvNaWgKRiEMdZ0sLpWOQLuddTKSYq2Fn");
        Player_Model p10 = new Player_Model("tolisso", "https://upload.wikimedia.org/wikipedia/commons/7/7d/Corentin_Tolisso_in_May_2019.jpg");

        mPlayerModelList.addAll(Arrays.asList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

    }

    private void buildRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        mAdapter = new MyAdapter(mPlayerModelList, this); //définition de la variable globale
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
        mPlayerModelList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }
}








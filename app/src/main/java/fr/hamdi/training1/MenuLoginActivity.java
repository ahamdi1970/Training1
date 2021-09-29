package fr.hamdi.training1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MenuLoginActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Player> mPlayerList = new ArrayList<Player>();
    Button buttonDel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);

        //buttonDel = findViewById(R.id.player_del);
        recyclerView = findViewById(R.id.recyclerView);
        MyAdapter myAdapter = new MyAdapter(mPlayerList, this);

        fillPlayersList(); // methode remplissage de la liste des joueurs
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }



    private void fillPlayersList() {
            Player p0 = new Player("benzema", "http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcTjVi_AAcsDbAYbtH26dGbAVhUbNeBZMdKqL91BhvcHahhDq7g9WZ-vzXRHCvLg");
            Player p1 = new Player("griezman", "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTGp5_4Akz95vonXPLprZ4nWyZVZmBbwYNt2DMq_sYnITGPfpS66vgyWZ17xJHc");
            Player p2 = new Player("hernandez", "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcSzdJqlCNlUfgWdPUs7bP15oHyAzVD2n1ycgzUTh4I4_VleqeQHMQyXPxRGueec");
            Player p3 = new Player("kante", "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcRr95WqQn4EITY1stn_k6RLjZzEOBw_iSZLnEBpAEkHs064pzK8DADNypUK9KJI");
            Player p4 = new Player("kimpembe", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcRa6LSBDpIdDtg_pD9ZNw_9ZBcCTXgnE_KVb_l8YMkQ5iJjog8FhpsglJwf9IAL");
            Player p5 = new Player("lloris", "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcSbKGwIyRL59P-IYCDmEMqGhctpcKNrHhdPX2sjGJY-VE-NGHSxhC-HyM8WZxQS");
            Player p6 = new Player("matuidi", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Matuidi_Paris_SG.jpg/135px-Matuidi_Paris_SG.jpg");
            Player p7 = new Player("mbappe", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSm1IwsPZDVXMagZrFcX2o8neNG5SoTD1Gxnx1A_ApzHw3TBcuP");
            Player p8 = new Player("mendy", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/399071_sPICT.jpg/640px-399071_sPICT.jpg");
            Player p9 = new Player("pogba", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcSsifgiw71nj1zr-gEqSf_CW8uwrpauvvNaWgKRiEMdZ0sLpWOQLuddTKSYq2Fn");
            Player p10 = new Player("tolisso", "https://upload.wikimedia.org/wikipedia/commons/7/7d/Corentin_Tolisso_in_May_2019.jpg");

            mPlayerList.addAll(Arrays.asList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

        }



    }





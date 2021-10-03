package fr.hamdi.training1;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {

    private static List<Player_Model> mPlayerModelList = new ArrayList<Player_Model>();
    private static int nextId = 11;

    public MyApplication() {
        fillPlayersList();
    }

    private void fillPlayersList() {
        Player_Model p0 = new Player_Model(0,"20","benzema", "http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcTjVi_AAcsDbAYbtH26dGbAVhUbNeBZMdKqL91BhvcHahhDq7g9WZ-vzXRHCvLg");
        Player_Model p1 = new Player_Model(1,"20","griezman", "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTGp5_4Akz95vonXPLprZ4nWyZVZmBbwYNt2DMq_sYnITGPfpS66vgyWZ17xJHc");
        Player_Model p2 = new Player_Model(2,"20","hernandez", "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcSzdJqlCNlUfgWdPUs7bP15oHyAzVD2n1ycgzUTh4I4_VleqeQHMQyXPxRGueec");
        Player_Model p3 = new Player_Model(3,"20","kante", "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcRr95WqQn4EITY1stn_k6RLjZzEOBw_iSZLnEBpAEkHs064pzK8DADNypUK9KJI");
        Player_Model p4 = new Player_Model(4,"20","kimpembe", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcRa6LSBDpIdDtg_pD9ZNw_9ZBcCTXgnE_KVb_l8YMkQ5iJjog8FhpsglJwf9IAL");
        Player_Model p5 = new Player_Model(5,"20","lloris", "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcSbKGwIyRL59P-IYCDmEMqGhctpcKNrHhdPX2sjGJY-VE-NGHSxhC-HyM8WZxQS");
        Player_Model p6 = new Player_Model(6,"20","matuidi", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Matuidi_Paris_SG.jpg/135px-Matuidi_Paris_SG.jpg");
        Player_Model p7 = new Player_Model(7,"20","mbappe", "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSm1IwsPZDVXMagZrFcX2o8neNG5SoTD1Gxnx1A_ApzHw3TBcuP");
        Player_Model p8 = new Player_Model(8,"20","mendy", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/399071_sPICT.jpg/640px-399071_sPICT.jpg");
        Player_Model p9 = new Player_Model(9,"20","pogba", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcSsifgiw71nj1zr-gEqSf_CW8uwrpauvvNaWgKRiEMdZ0sLpWOQLuddTKSYq2Fn");
        Player_Model p10 = new Player_Model(10,"20","tolisso", "https://upload.wikimedia.org/wikipedia/commons/7/7d/Corentin_Tolisso_in_May_2019.jpg");

        mPlayerModelList.addAll(Arrays.asList(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10));

    }

    public static List<Player_Model> getmPlayerModelList() {
        return mPlayerModelList;
    }

    public static void setmPlayerModelList(List<Player_Model> mPlayerModelList) {
        MyApplication.mPlayerModelList = mPlayerModelList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
}

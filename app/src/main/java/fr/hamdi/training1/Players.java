package fr.hamdi.training1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Players<mPlayersList> {


    List<Players> mPlayersList = new ArrayList<Players>();
    fillPlayersList();

    private void fillPlayersList() {
        Players p0 = new Players("benzema","http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcTjVi_AAcsDbAYbtH26dGbAVhUbNeBZMdKqL91BhvcHahhDq7g9WZ-vzXRHCvLg");
        Players p1 = new Players("griezman","http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTGp5_4Akz95vonXPLprZ4nWyZVZmBbwYNt2DMq_sYnITGPfpS66vgyWZ17xJHc");
        Players p2 = new Players("hernandez","http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcSzdJqlCNlUfgWdPUs7bP15oHyAzVD2n1ycgzUTh4I4_VleqeQHMQyXPxRGueec");
        Players p3 = new Players("kante","http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcRr95WqQn4EITY1stn_k6RLjZzEOBw_iSZLnEBpAEkHs064pzK8DADNypUK9KJI");
        Players p4 = new Players("kimpembe","http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcRa6LSBDpIdDtg_pD9ZNw_9ZBcCTXgnE_KVb_l8YMkQ5iJjog8FhpsglJwf9IAL");
        Players p5 = new Players("lloris","http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcSbKGwIyRL59P-IYCDmEMqGhctpcKNrHhdPX2sjGJY-VE-NGHSxhC-HyM8WZxQS");
        Players p6 = new Players("matuidi","https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Matuidi_Paris_SG.jpg/135px-Matuidi_Paris_SG.jpg");
        Players p7 = new Players("mbappe","https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSm1IwsPZDVXMagZrFcX2o8neNG5SoTD1Gxnx1A_ApzHw3TBcuP");
        Players p8 = new Players("mendy","https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/399071_sPICT.jpg/640px-399071_sPICT.jpg");
        Players p9 = new Players("pogba","http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcSsifgiw71nj1zr-gEqSf_CW8uwrpauvvNaWgKRiEMdZ0sLpWOQLuddTKSYq2Fn");
        Players p10 = new Players("tolisso","https://upload.wikimedia.org/wikipedia/commons/7/7d/Corentin_Tolisso_in_May_2019.jpg");

        playersList.addAll(Arrays.asList(new Players[]{p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10}));

    }
    String name, images;

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", images=" + images +
                '}';
    }

    public Players(String name, String images) {
        this.name = name;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public String getImages() {
        return images;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImages(String images) {
        this.images = images;
    }


    }



}
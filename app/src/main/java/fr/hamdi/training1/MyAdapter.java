package fr.hamdi.training1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Player> playerList; // creation d'une liste de joueur
    Context context;


    public MyAdapter(List<Player> playerList, Context context) {
        this.playerList = playerList;
        this.context = context;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent,false);
        MyViewHolder holder;


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        // get the product at position


        holder.playerName.setText(playerList.get(position).getName());
        //holder.playerImage.setImageResource(playersList.get(position)); si utilisation d'image de drawable
        Glide.with(this.context).load(playerList.get(position).getImageURL()).into(holder.playerImage);


    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView playerName;
        ImageView playerImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            playerName = itemView.findViewById(R.id.player_name);
            playerImage = itemView.findViewById(R.id.player_image);

        }
    }
}

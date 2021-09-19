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

    List<Players> playersList;
    Context context;

    public MyAdapter(List<Players> playersList, Context context) {
        this.playersList = playersList;
        this.context = context;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.playerName.setText(playersList.get(position).getName());
        //holder.playerImage.setImageResource(playersList.get(position));
        Glide.with(this.context).load(playersList.get(position).getImageURL()).into(holder.playerImage);
    }

    @Override
    public int getItemCount() {
        return playersList.size();
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

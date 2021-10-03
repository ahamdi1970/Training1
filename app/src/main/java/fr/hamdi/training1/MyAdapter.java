package fr.hamdi.training1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Player_Model> playerModelList; // creation d'une liste de joueur
    Context context;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void OnDeleteClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public MyAdapter(List<Player_Model> playerModelList, Context context) {
        this.playerModelList = playerModelList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        //MyViewHolder holder;
        return new MyViewHolder(view, mListener);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        // get the player at position


        holder.playerName.setText(playerModelList.get(position).getName());
        //holder.playerImage.setImageResource(playersList.get(position)); si utilisation d'image de drawable
        Glide.with(this.context).load(playerModelList.get(position).getImageURL()).into(holder.playerImage);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send the control to the Player_insert activity
                Intent intent = new Intent(context,Player_Insert.class);
                intent.putExtra("id",playerModelList.get(position).getId());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return playerModelList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView playerName;
        ImageView playerImage;
        public ImageView mDeletePlayer;
        ConstraintLayout parentLayout;

        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            playerName = itemView.findViewById(R.id.player_name);
            playerImage = itemView.findViewById(R.id.player_image);
            mDeletePlayer = itemView.findViewById(R.id.delete_player);
            parentLayout = itemView.findViewById(R.id.player_layout);

            mDeletePlayer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.OnDeleteClick(position);
                        }
                    }
                    ;


                }
            });
        }

    }

}

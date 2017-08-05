package com.example.andriod.yupdevtask2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Boluwatife on 7/17/2017.
 */

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.MyViewHolder> {

    private List<GameData> gameList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView gameTitle;
        public TextView gameGenre;
        public TextView vendor;

        public MyViewHolder(View view) {
            super(view);
            gameTitle = (TextView) view.findViewById(R.id.game_title);
            gameGenre = (TextView) view.findViewById(R.id.game_genre);
            vendor = (TextView) view.findViewById(R.id.vendor);
        }
    }



    public GameAdapter(List<GameData> gameList) {
        this.gameList = gameList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        GameData game = gameList.get(position);
        holder.gameTitle.setText(game.getGameTitle());
        holder.gameGenre.setText(game.getGameGenre());
        holder.vendor.setText(game.getVendor());

    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }



}

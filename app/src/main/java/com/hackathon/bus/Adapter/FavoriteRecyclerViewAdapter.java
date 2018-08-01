package com.hackathon.bus.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hackathon.bus.R;
import com.hackathon.bus.VO.FavoritBusVo;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class FavoriteRecyclerViewAdapter extends RecyclerView.Adapter<FavoriteRecyclerViewAdapter.FavoriteViewHolder> {

    private Context context;
    private FavoritBusVo provider;
    public FavoriteRecyclerViewAdapter(Context context, FavoritBusVo provider){
        this.context=context;
        this.provider=provider;
    }
    @NonNull
    @Override
    public FavoriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext()).inflate(R.layout.favorite_bus_list_view, parent, false);
        return new FavoriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteViewHolder holder, int position) {

        holder.busNumber.setText(provider.getBusNum());
        holder.busInfo.setText(provider.getBusInfo());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class FavoriteViewHolder extends RecyclerView.ViewHolder{

        TextView busNumber;
        TextView busInfo;
        public FavoriteViewHolder(View itemView) {
            super(itemView);
            busNumber=itemView.findViewById(R.id.num_bus);
            busInfo=itemView.findViewById(R.id.bus_info);
        }
    }
}

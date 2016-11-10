package com.campaignvr.smis.bjpcampaignar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    LayoutInflater layoutInflater;
    CardAdapter(Context context){
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.card_view_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivName,ivWardNumber,ivDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            ivName = (ImageView) itemView.findViewById(R.id.ivName);
            ivWardNumber = (ImageView) itemView.findViewById(R.id.ivWardNumber);
            ivDescription = (ImageView) itemView.findViewById(R.id.ivDescription);
        }
    }
}

package com.campaignvr.smis.bjpcampaignar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ca.barrenechea.widget.recyclerview.decoration.StickyHeaderDecoration;



public class StickyAdapter extends RecyclerView.Adapter<StickyAdapter.ViewHolder>
        implements ca.barrenechea.widget.recyclerview.decoration.StickyHeaderAdapter<StickyAdapter.HeaderHolder> {
    LayoutInflater layoutInflater;
    public StickyAdapter(Context context){
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.single_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.item.setText("Item:" + position);
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    @Override
    public long getHeaderId(int position) {
        if (position == 0) { // don't show header for first item
            return StickyHeaderDecoration.NO_HEADER_ID;
        }
        return (long) position / 7;
    }

    @Override
    public HeaderHolder onCreateHeaderViewHolder(ViewGroup parent) {
        final View view = layoutInflater.inflate(R.layout.header_row, parent, false);
        return new HeaderHolder(view);
    }

    @Override
    public void onBindHeaderViewHolder(HeaderHolder viewHolder, int position) {
        viewHolder.header.setText("Header " + getHeaderId(position));

    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView item;

        public ViewHolder(View itemView) {
            super(itemView);
            item = (TextView) itemView.findViewById(R.id.tvContact);
        }
    }

    static class HeaderHolder extends RecyclerView.ViewHolder {
        public TextView header;

        public HeaderHolder(View itemView) {
            super(itemView);
            header = (TextView) itemView;
        }
    }
}

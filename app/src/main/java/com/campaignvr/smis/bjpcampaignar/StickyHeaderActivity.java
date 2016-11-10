package com.campaignvr.smis.bjpcampaignar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ca.barrenechea.widget.recyclerview.decoration.StickyHeaderDecoration;

public class StickyHeaderActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StickyHeaderDecoration decor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sticky_header_activity);
        StickyAdapter adapter = new StickyAdapter(this);
        recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        final DividerDecoration divider = new DividerDecoration.Builder(this)
//                .setHeight(R.dimen.default_divider_height)
//                .setPadding(R.dimen.default_divider_padding)
//                .setColorResource(R.color.default_header_color)
//                .build();
//        recyclerView.addItemDecoration(divider);

        decor = new StickyHeaderDecoration(adapter);
        recyclerView.addItemDecoration(decor);

    }
}

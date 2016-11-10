package com.campaignvr.smis.bjpcampaignar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private BlurLayout mSampleLayout1,mSampleLayout2,mSampleLayout3,mSampleLayout4,mSampleLayout5
    ,mSampleLayout6,mSampleLayout7,mSampleLayout8,mSampleLayout9,mSampleLayout10;

    View hoverView1,hoverView2,hoverView3,hoverView4,hoverView5,hoverView6,hoverView7,hoverView8,
            hoverView9,hoverView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlurLayout.setGlobalDefaultDuration(450);

        initBlurLayout();
        initHoverView();

    }


    public void initBlurLayout(){

        mSampleLayout1 = (BlurLayout)findViewById(R.id.blur_layout1);
        mSampleLayout2 = (BlurLayout)findViewById(R.id.blur_layout2);
        mSampleLayout3 = (BlurLayout)findViewById(R.id.blur_layout3);
        mSampleLayout4 = (BlurLayout)findViewById(R.id.blur_layout4);
        mSampleLayout5 = (BlurLayout)findViewById(R.id.blur_layout5);
        mSampleLayout6 = (BlurLayout)findViewById(R.id.blur_layout6);
        mSampleLayout7 = (BlurLayout)findViewById(R.id.blur_layout7);
        mSampleLayout8 = (BlurLayout)findViewById(R.id.blur_layout8);
        mSampleLayout9 = (BlurLayout)findViewById(R.id.blur_layout9);
        mSampleLayout10 = (BlurLayout)findViewById(R.id.blur_layout10);
    }


    public  void initHoverView(){

        hoverView1 = LayoutInflater.from(this).inflate(R.layout.hover_view_one,null);
        hoverView2 = LayoutInflater.from(this).inflate(R.layout.hover_view_two,null);
        hoverView3 = LayoutInflater.from(this).inflate(R.layout.hover_view_three,null);
        hoverView4 = LayoutInflater.from(this).inflate(R.layout.hover_view_four,null);
        hoverView5 = LayoutInflater.from(this).inflate(R.layout.hover_view_five,null);
        hoverView6 = LayoutInflater.from(this).inflate(R.layout.hover_view_six,null);
        hoverView7 = LayoutInflater.from(this).inflate(R.layout.hover_view_seven,null);
        hoverView8 = LayoutInflater.from(this).inflate(R.layout.hover_view_eight,null);
        hoverView9 = LayoutInflater.from(this).inflate(R.layout.hover_view_nine,null);
        hoverView10 = LayoutInflater.from(this).inflate(R.layout.hover_view_ten,null);

        setBlurView(mSampleLayout1,hoverView1,R.id.url1,R.id.content1);
        setBlurView(mSampleLayout2,hoverView2,R.id.url2,R.id.content2);
        setBlurView(mSampleLayout3,hoverView3,R.id.url3,R.id.content3);
        setBlurView(mSampleLayout4,hoverView4,R.id.url4,R.id.content4);
        setBlurView(mSampleLayout5,hoverView5,R.id.url5,R.id.content5);
        setBlurView(mSampleLayout6,hoverView6,R.id.url6,R.id.content6);
        setBlurView(mSampleLayout7,hoverView7,R.id.url7,R.id.content7);
        setBlurView(mSampleLayout8,hoverView8,R.id.url8,R.id.content8);
        setBlurView(mSampleLayout9,hoverView9,R.id.url9,R.id.content9);
        setBlurView(mSampleLayout10,hoverView10,R.id.url10,R.id.content10);

    }


    public void setBlurView(BlurLayout layout, View view,int id,int content){

        layout.setHoverView(view);
        layout.addChildAppearAnimator(view, id, Techniques.SlideInRight);
        layout.addChildDisappearAnimator(view, id, Techniques.SlideOutRight);
        layout.addChildAppearAnimator(view, content, Techniques.BounceIn);
        layout.addChildDisappearAnimator(view, content, Techniques.FadeOutUp);
        layout.enableZoomBackground(true);
        layout.setBlurDuration(1200);
        view.setOnClickListener(this);
        view.findViewById(id).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.url1:

                LaunchUrl("a");

                break;

            case R.id.url2:

                LaunchUrl("a");
                break;

            case R.id.url3:

                LaunchUrl("a");
                break;

            case R.id.url4:
                LaunchUrl("a");
                break;

            case R.id.url5:
                LaunchUrl("a");
                break;

            case R.id.url6:
                LaunchUrl("a");
                break;

            case R.id.url7:
                LaunchUrl("a");
                break;

            case R.id.url8:
                LaunchUrl("a");
                break;

            case R.id.url9:
                LaunchUrl("a");
                break;

            case R.id.url10:
                LaunchUrl("a");
                break;

        }

    }

    private void LaunchUrl(String url) {

        Intent getWebPage = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(getWebPage);
    }

}

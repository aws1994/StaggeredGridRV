package com.labawsrh.aws.staggeredgrid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class StaggeredRecyclerAdapter extends RecyclerView.Adapter<StaggeredRecyclerAdapter.ImageViewHolder> {


    Context mContext;
    List<row> mdata;
    RequestOptions requestOptions ;

    public StaggeredRecyclerAdapter(Context mContext, List<row> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
        requestOptions = new RequestOptions().fitCenter();
    }


    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.row_item,viewGroup,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int i) {
        imageViewHolder.img.setImageResource(mdata.get(i).getImg());
        // bind image here
        // for better perfermance we will use Glide to load and cache images
        // first lets add the depandencies
        //Glide.with(mContext).load(mdata.get(i).getImg()).apply(requestOptions).into(imageViewHolder.img);
        // lets add a request option for glide t
        // lets add a request option for glide t
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView img;


        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.row_img);
        }
    }
}

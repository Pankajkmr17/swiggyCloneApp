package com.example.swiggyclone;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class ImageSlideAdapter extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_image_slide_adapter);
//    }
//}
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class ImageSlideAdapter extends RecyclerView.Adapter<ImageSlideAdapter.ImageViewHolder> {

    private final ArrayList<Integer> imageList;
    private final ViewPager2 viewPager2;

    public ImageSlideAdapter(ArrayList<Integer> imageList, ViewPager2 viewPager2) {
        this.imageList = imageList;
        this.viewPager2 = viewPager2;
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView slideImage;

        public ImageViewHolder(View itemView) {
            super(itemView);
            slideImage = itemView.findViewById(R.id.slide_image);
        }
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.activity_image_slide_adapter, parent, false);
        return new ImageViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        holder.slideImage.setImageResource(imageList.get(position));
        if (position == imageList.size() - 1) {
            viewPager2.post(runnable);
        }
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            imageList.addAll(imageList);
            notifyDataSetChanged();
        }
    };
}
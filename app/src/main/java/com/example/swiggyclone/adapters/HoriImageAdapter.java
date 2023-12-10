package com.example.swiggyclone.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.swiggyclone.model.HoriFoodsDataClass;
import com.example.swiggyclone.R;

import  java.util.List;

public class HoriImageAdapter extends RecyclerView.Adapter<HoriImageAdapter.HoriImageHolder> {
    private List<HoriFoodsDataClass> horiImageList;
    private AdapterView.OnItemClickListener onItemClickListener;
    public HoriImageAdapter(List<HoriFoodsDataClass> horiImageList) {
        this.horiImageList = horiImageList;
    }

    @Override
    public HoriImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_hori_card, parent, false);
        return new HoriImageHolder(view);
    }

    @Override
    public void onBindViewHolder(HoriImageHolder holder, int position) {
        HoriFoodsDataClass data = horiImageList.get(position);
        holder.bind(data);
    }

    @Override
    public int getItemCount() {
        return horiImageList.size();
    }


//    public void setOnItemClickListener(OnItemClickListener listener) {
//        this.onItemClickListener = listener;
//    }
//
//    // Interface for the click listener
//    public interface OnItemClickListener {
//        void onItemClick(int position);
//    }

    public class HoriImageHolder extends RecyclerView.ViewHolder {

        private ImageView ivFood;
        private TextView tvHotelName;
        private TextView tvRating;
        private TextView tvTime;
        private TextView tvType;

        public HoriImageHolder(View itemView) {
            super(itemView);
            ivFood = itemView.findViewById(R.id.iv_food);
            tvHotelName = itemView.findViewById(R.id.tv_hotel_name);
            tvRating = itemView.findViewById(R.id.tv_rating);
            tvTime = itemView.findViewById(R.id.tv_time);
            tvType = itemView.findViewById(R.id.tv_type);

//            ivFood.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (onItemClickListener != null) {
//                        onItemClickListener.onItemClick(getAdapterPosition());
//                    }
//                }
//            });
        }

        public void bind(HoriFoodsDataClass data) {
            ivFood.setImageResource(data.getImageName());
            tvHotelName.setText(data.getHotelName());
            tvRating.setText(data.getFoodRating());
            tvTime.setText(data.getDeliveryTime());
            tvType.setText(data.getFoodType());
        }
    }
}

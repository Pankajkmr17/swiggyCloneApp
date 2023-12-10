package com.example.swiggyclone.adapters;


        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.recyclerview.widget.RecyclerView;

        import com.example.swiggyclone.R;
        import com.example.swiggyclone.model.VertiFoodsDataClass;

        import java.util.List;

public class VertiImageAdapter extends RecyclerView.Adapter<VertiImageAdapter.VertiImageHolder> {
    private List<VertiFoodsDataClass> vertiImageList;

    public VertiImageAdapter(List<VertiFoodsDataClass> vertiImageList) {
        this.vertiImageList = vertiImageList;
    }

    @Override
    public VertiImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_verti_card, parent, false);
        return new VertiImageHolder(view);
    }

    @Override
    public void onBindViewHolder(VertiImageHolder holder, int position) {
        VertiFoodsDataClass data = vertiImageList.get(position);
        holder.bind(data);
    }

    @Override
    public int getItemCount() {
        return vertiImageList.size();
    }

    public class VertiImageHolder extends RecyclerView.ViewHolder {
        private ImageView ivFood;
        private TextView tvHotelName;
        private TextView tvRating;
        private TextView tvTime;
        private TextView tvType;
        private TextView tvHotelLocation;
        private ImageView ivOffer;

        public VertiImageHolder(View itemView) {
            super(itemView);
            ivFood = itemView.findViewById(R.id.iv_food);
            tvHotelName = itemView.findViewById(R.id.tv_hotel_name);
            tvRating = itemView.findViewById(R.id.tv_rating);
            tvTime = itemView.findViewById(R.id.tv_time);
            tvType = itemView.findViewById(R.id.tv_type);
            tvHotelLocation = itemView.findViewById(R.id.tv_hotel_location);
            ivOffer = itemView.findViewById(R.id.iv_offer);
        }

        public void bind(VertiFoodsDataClass data) {
            ivFood.setImageResource(data.getImageName());
            tvHotelName.setText(data.getHotelName());
            tvRating.setText(data.getFoodRating());
            tvTime.setText(data.getDeliveryTime());
            tvType.setText(data.getFoodType());
            tvHotelLocation.setText(data.getHotelLocation());
            ivOffer.setImageResource(data.getOffer());
        }
    }
}


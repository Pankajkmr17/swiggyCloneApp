package com.example.swiggyclone.adapters;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.swiggyclone.R;
import com.example.swiggyclone.model.InstamartDataClass;

import java.util.List;

public class InstamartImageAdapter extends RecyclerView.Adapter<InstamartImageAdapter.InstamartImageHolder> {
    private final List<InstamartDataClass> instamartImageList;

    public InstamartImageAdapter(List<InstamartDataClass> instamartImageList) {
        this.instamartImageList = instamartImageList;
    }

    @Override
    public InstamartImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instamart_card, parent, false);
        return new InstamartImageHolder(view);
    }

    @Override
    public void onBindViewHolder(InstamartImageHolder holder, int position) {
        InstamartDataClass data = instamartImageList.get(position);
        holder.bind(data);
    }

    @Override
    public int getItemCount() {
        return instamartImageList.size();
    }

    public class InstamartImageHolder extends RecyclerView.ViewHolder {
        private final ImageView ivProduct;
        private final TextView tvProductCompany;
        private final TextView tvProductName;
        private final TextView tvProductNameTamil;
        private final TextView tvProductWeight;
        private final TextView tvOrgPrice;
        private final TextView tvDisPrice;

        public InstamartImageHolder(View itemView) {
            super(itemView);
            ivProduct = itemView.findViewById(R.id.iv_product_image);
            tvProductCompany = itemView.findViewById(R.id.product_company);
            tvProductName = itemView.findViewById(R.id.product_name);
            tvProductNameTamil = itemView.findViewById(R.id.product_name_tamil);
            tvProductWeight = itemView.findViewById(R.id.product_weight);
            tvOrgPrice = itemView.findViewById(R.id.tv_orgprice);
            tvDisPrice = itemView.findViewById(R.id.tv_disprice);
        }

        public void bind(InstamartDataClass data) {
            ivProduct.setImageResource(data.getProductImage());
            tvProductCompany.setText(data.getProductCompany());
            tvProductName.setText(data.getProductName());
            tvProductNameTamil.setText(data.getProductNameTamil());
            tvProductWeight.setText(data.getProductWeight());
            tvOrgPrice.setText("₹" + data.getOrgPrice());
            tvOrgPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            tvDisPrice.setText("₹" + data.getDisPrice());
        }
    }
}

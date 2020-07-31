package com.example.rentalio.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentalio.R;
import com.example.rentalio.model.Kendaraan;

import java.util.ArrayList;

public class KendaraanAdapter extends RecyclerView.Adapter<KendaraanAdapter.KendaraanViewHolder> {
    private Context context;
    private ArrayList<Kendaraan> kendaraan;

    public KendaraanAdapter(Context context, ArrayList<Kendaraan>kendaraan){
        this.context = context;
        this.kendaraan = kendaraan;
    }




    @Override
    public KendaraanAdapter.KendaraanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_kendaraab, parent,
                        false);
        return new KendaraanViewHolder(view);
    }

    public class KendaraanViewHolder extends RecyclerView.ViewHolder {
        TextView tvKendaraan;
        ImageView ivKendaraan;

        public KendaraanViewHolder(View itemView) {
            super(itemView);
            ivKendaraan = itemView.findViewById(R.id.iv_kendaraan);
            tvKendaraan = itemView.findViewById(R.id.tv_nama_kendaraan);
        }
    }

    @Override
    public void onBindViewHolder(KendaraanAdapter.KendaraanViewHolder holder, int position) {
        holder.tvKendaraan.setText((kendaraan.get(position).getNamaKendaraan()));
        holder.ivKendaraan.setImageResource(kendaraan.get(position).getGambarKendaraan());


    }

    @Override
    public int getItemCount() {

        return kendaraan.size();
    }


}

package com.example.hp.myapplication.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hp.myapplication.Interface.ItemClickListener;
import com.example.hp.myapplication.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;



    private ItemClickListener itemClickListener;

    public MenuViewHolder(final View itemView) {
        super(itemView);



            txtMenuName = itemView.findViewById(R.id.menu_name);
            imageView = itemView.findViewById(R.id.menu_image);



        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAbsoluteAdapterPosition(), false);
    }
}

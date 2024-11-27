package com.example.btck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedViewHolder> {

    private List<FeaturedItem> FeaturedList;

    public FeaturedAdapter(List<FeaturedItem> FeaturedList) {
        this.FeaturedList = FeaturedList;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bookmark, parent, false);
        return new FeaturedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
        FeaturedItem item = FeaturedList.get(position);
        holder.itemTitle.setText(item.getTitle());
        holder.itemDescription.setText(item.getDescription());
        holder.itemImage.setImageResource(item.getImageResourceId());

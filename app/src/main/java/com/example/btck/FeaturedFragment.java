package com.example.btck;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class FeaturedFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<FeaturedItem> FeaturedList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_featured, container, false);

        // Khởi tạo RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo dữ liệu mẫu
        FeaturedList = new ArrayList<>();
        FeaturedList.add(new FeaturedItem("Item 1", "Description 1", R.drawable.ic_placeholder));
        FeaturedList.add(new FeaturedItem("Item 2", "Description 2", R.drawable.ic_placeholder));

        // Khởi tạo adapter và set cho RecyclerView
        adapter = new FeaturedAdapter()FeaturedList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
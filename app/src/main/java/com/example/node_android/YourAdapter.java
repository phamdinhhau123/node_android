package com.example.node_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class YourAdapter extends RecyclerView.Adapter<YourAdapter.ViewHolder> {

    private List<String> dataList;

    public YourAdapter(List<String> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data at the specified position
        String item = dataList.get(position);
        // Bind the data to the ViewHolder
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        // Return the size of your data list
        return dataList.size();
    }

    // ViewHolder class to hold the views for each item
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            // Find and initialize the TextView from the item layout
            textViewTitle = itemView.findViewById(R.id.textViewTen);
        }

        // Method to bind data to the ViewHolder
        public void bind(String item) {
            textViewTitle.setText(item);
        }
    }
}

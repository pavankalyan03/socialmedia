package com.example.socialmedia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class nestedAdapter extends RecyclerView.Adapter<nestedAdapter.nestedViewHolder> {

    private final String details;
    private final int image;

    public nestedAdapter(String details, int image) {
        this.details = details;
        this.image = image;
    }

    @NonNull
    @NotNull
    @Override
    public nestedViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item, parent, false);
        return new nestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull nestedViewHolder holder, int position) {
        holder.mtv.setText(details);
        holder.mImageView.setImageResource(image);

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public static class nestedViewHolder extends RecyclerView.ViewHolder {

        private final TextView mtv;
        private final ImageView mImageView;

        public nestedViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            mtv = itemView.findViewById(R.id.nestedItemTv);
            mImageView = itemView.findViewById(R.id.imageView);
        }
    }

}

package com.example.lab3;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Auto> brands;

    DataAdapter(Context context, List<Auto> brands) {
        this.brands = brands;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        Auto auto = brands.get(position);
        holder.brandView.setText(auto.getBrand());
        holder.modelView.setText(auto.getModel());
        holder.imageView.setImageResource(auto.getImage());
        if(position%2 == 0){
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        else {
            holder.itemView.setBackgroundColor(Color.parseColor("#E9E9E9"));
        }
    }

    @Override
    public int getItemCount() {
        return brands.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView brandView, modelView;
        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.image);
            brandView = (TextView) view.findViewById(R.id.brand);
            modelView = (TextView) view.findViewById(R.id.model);
        }
    }
}

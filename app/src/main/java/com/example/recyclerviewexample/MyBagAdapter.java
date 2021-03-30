package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyBagAdapter extends RecyclerView.Adapter<MyBagAdapter.ViewHolder> {

    MyBagData[] myBagData;
    Context context;

    public MyBagAdapter(MyBagData[] myBagData,MainActivity activity) {
        this.myBagData = myBagData;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.bag_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyBagData myBagDataList = myBagData[position];
        holder.textViewName.setText(myBagDataList.getBagName());
        holder.textViewPrice.setText(myBagDataList.getBagPrice());
        holder.bagImage.setImageResource(myBagDataList.getBagImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,  myBagDataList.getBagName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myBagData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView bagImage;
        TextView textViewName;
        TextView textViewPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bagImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewPrice = itemView.findViewById(R.id.textPrice);


        }
    }
}

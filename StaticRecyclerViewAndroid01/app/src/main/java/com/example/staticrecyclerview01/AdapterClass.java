package com.example.staticrecyclerview01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.vholder> {

    String countriesListA[], countriesListB[];

    public AdapterClass(String[] countriesListA, String[] countriesListB) {
        this.countriesListA = countriesListA;
        this.countriesListB = countriesListB;
    }

    @NonNull
    @Override
    public vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_row, parent, false);
        return new vholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull vholder holder, int position) {
        holder.t1.setText(countriesListA[position]);
        holder.t2.setText(countriesListB[position]);
    }

    @Override
    public int getItemCount() {
        return countriesListA.length;
    }


    public class vholder extends RecyclerView.ViewHolder {
        TextView t1, t2;

        public vholder(@NonNull View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.t1);
            t2 = (TextView) itemView.findViewById(R.id.t2);
        }
    }
}

package com.example.maciek.rejestracjawizyt;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Maciek on 17.01.2018.
 */

public class LekaAdapter extends RecyclerView.Adapter<LekaAdapter.ViewHolder> {

    ArrayList<Lekarz> Lekarze_List= new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setNazwa(Lekarze_List.get(position).getName());
        holder.setSpecialisation(Lekarze_List.get(position).getSpecialist());
    }

    @Override
    public int getItemCount() {return Lekarze_List.size();}

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);





        }
        @BindView(R.id.Nazwa)
        TextView Nazwa;
        @BindView(R.id.Specialisation)
        TextView Specialisation;

        public void setNazwa(String nazwa)
        {
            Nazwa.setText(nazwa);
        }
        public void setSpecialisation(String spec)
        {
            Specialisation.setText(spec);
        }
    }
}

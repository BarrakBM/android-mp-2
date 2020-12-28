package com.example.day4app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;
import java.util.ArrayList;

class TvShowsAdapter extends RecyclerView.Adapter {

    ArrayList<TvShows> tvArray;
    Context context;

    public TvShowsAdapter(ArrayList<TvShows> tvArray, Context context) {
        this.tvArray = tvArray;
        this.context = context;
    }

    //public TvShowsAdapter(ArrayList<TvShows> tvLibrary) {
    //}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // connect it to TvShowslist
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tvshows_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).name.setText(tvArray.get(position).getName()+"");
        ((ViewHolder) holder).img.setImageResource(tvArray.get(position).getImg());
        ((ViewHolder) holder).year.setText(tvArray.get(position).getYear()+"");
        ((ViewHolder) holder).season.setText(tvArray.get(position).getSeasons()+"");

    }

    @Override
    public int getItemCount() { // عشان ترجع عدد العناصر بلستة المسلسلات
        return tvArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
       //هني تعريف العناصر
        public ImageView img;
        public TextView name;
        public TextView year;
        public TextView season;
        public View view; // مهمه

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // ربط العناصر الي فوق
            view = itemView;  // مهمه عشان يبينون العناصر لان هذا ادابتر مو اكتفتي
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.moviename);
            year = itemView.findViewById(R.id.movieyear);
            season = itemView.findViewById(R.id.movieseason);


        }
    }
}

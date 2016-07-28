package com.andreakim.concertconcierge;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.ImageView;
=======

import android.widget.ImageView;

>>>>>>> a297e3f6686bad91711cc25a23297e0a30dc3048
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by spoorthi on 7/25/16.
 */
public class ConcertAdapter extends RecyclerView.Adapter<ConcertAdapter.ViewHolder>{

    private ArrayList<Concert> concerts;

    public ConcertAdapter(ArrayList<Concert> concerts){
        this.concerts=concerts;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_rows,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tv_name_artist.setText(concerts.get(position).getName());
        holder.tv_time.setText(concerts.get(position).getTime());
        holder.tv_venue.setText(concerts.get(position).getVenue());
        holder.tv_city.setText(concerts.get(position).getCity());
<<<<<<< HEAD
        holder.tv_image.setImageBitmap(concerts.get(position).getImage());

=======

        holder.tv_image.setImageBitmap(concerts.get(position).getImage());


>>>>>>> a297e3f6686bad91711cc25a23297e0a30dc3048
    }

    @Override
    public int getItemCount() {
        return concerts.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name_artist, tv_time, tv_venue,tv_city;
<<<<<<< HEAD
        private ImageView tv_image;
=======

        private ImageView tv_image;

>>>>>>> a297e3f6686bad91711cc25a23297e0a30dc3048
        public ViewHolder(View view) {
            super(view);

            tv_name_artist = (TextView)view.findViewById(R.id.concert_artist);
            tv_time = (TextView)view.findViewById(R.id.concert_time);
            tv_venue = (TextView)view.findViewById(R.id.concert_venue);
            tv_city=(TextView)view.findViewById(R.id.concert_city);
<<<<<<< HEAD
            tv_image = (ImageView)view.findViewById(R.id.concert_image);
=======

            tv_image = (ImageView)view.findViewById(R.id.concert_image);

>>>>>>> a297e3f6686bad91711cc25a23297e0a30dc3048
        }
    }
}

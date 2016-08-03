package com.andreakim.concertconcierge;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ericaschulz on 8/1/16.
 */
public class WeatherFragment extends Fragment{


    public WeatherFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View weatherFragment = inflater.inflate(R.layout.weather_card_layout, container, false);
        TextView currentTemp = (TextView) weatherFragment.findViewById(R.id.weather_temp);
        TextView mDescription = (TextView)weatherFragment.findViewById(R.id.weather_desc);

//        currentTemp.setText();
//        mDescription.setText();

        return weatherFragment;


    }


    }




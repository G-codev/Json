package com.gustiramadhan.earthquakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.sql.Time;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class QuakeAdapter extends ArrayAdapter<EarthQuake> {
    private  static final String LOCATION_SEPARATOR = " of ";

    public QuakeAdapter(Context context, List<EarthQuake> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
       if (listItemView == null){
           listItemView = LayoutInflater.from(getContext())
                   .inflate(R.layout.earthquakelistitem, parent, false);
       }
       EarthQuake currentEarthquake = getItem(position);
        TextView magnitudeView  = listItemView.findViewById(R.id.magnitude);

        String formatMagnitude = formatMagnitude(currentEarthquake.getmMagnitude());
        magnitudeView.setText(formatMagnitude);

        return super.getView(position, convertView, parent);
    }

    private String formatMagnitude(double magnitude){
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }
    private  String  formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return  dateFormat.format(dateObject);
    }
     private String  formatTime(Time dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
         return  timeFormat.format(dateObject);
     }
     private int getMagnitudeColor(double magnitude){
        int magnitudeColorResourceid;
        int magnitudeFloor = (int) Math.floor(magnitude);

         switch (magnitudeFloor){
             case 0:
             case 1:
                magnitudeColorResourceid = R.color.magnitude1;
                break;
             case 2:
                 magnitudeColorResourceid = R.color.magnitude2;
                 break;
             case 3:
                 magnitudeColorResourceid = R.color.magnitude3;
                 break;
             case 4:
                 magnitudeColorResourceid = R.color.magnitude4;
                 break;
             case 5:
                 magnitudeColorResourceid = R.color.magnitude5;
                 break;
             case 6:
                 magnitudeColorResourceid = R.color.magnitude6;
                 break;
             case 7:
                 magnitudeColorResourceid = R.color.magnitude7;
                 break;
             case 8:
                 magnitudeColorResourceid = R.color.magnitude8;
                 break;
             case 9:
                 magnitudeColorResourceid = R.color.magnitude9;
                 default:
                     magnitudeColorResourceid = R.color.magnitude10;
                 break;
         }
         return ContextCompat.getColor(getContext(), magnitudeColorResourceid);
     }
}

package com.example.spandanroy.travelbuddy.Adapters;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spandanroy.travelbuddy.Others.Place;
import com.example.spandanroy.travelbuddy.R;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {

        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);

        placeTextView.setText(currentPlace.getPlace());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.loc_text_view);

        addressTextView.setText(currentPlace.getAddress());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.getImageResourceId() > 0) {
            iconView.setImageResource(currentPlace.getImageResourceId());
        } else

        {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

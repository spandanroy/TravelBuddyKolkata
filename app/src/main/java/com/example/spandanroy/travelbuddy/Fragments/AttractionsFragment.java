package com.example.spandanroy.travelbuddy.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.spandanroy.travelbuddy.Adapters.PlaceAdapter;
import com.example.spandanroy.travelbuddy.Others.Place;
import com.example.spandanroy.travelbuddy.R;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.vic_mem_hall), R.drawable.victoria_memorial, Uri.parse(getString(R.string.attr_loc1)),getString(R.string.attr_addr1)));
        places.add(new Place(getString(R.string.hwh_brdg), R.drawable.howrah_bridge, Uri.parse(getString(R.string.attr_loc2)),getString(R.string.attr_addr2)));
        places.add(new Place(getString(R.string.belur_math), R.drawable.belur_math, Uri.parse(getString(R.string.attr_loc3)),getString(R.string.attr_addr3)));
        places.add(new Place(getString(R.string.jorsnko_thkr_bri), R.drawable.jorasanko_thakurbari, Uri.parse(getString(R.string.attr_loc4)),getString(R.string.attr_addr4)));
        places.add(new Place(getString(R.string.shbhabzr_rjbri), R.drawable.shobhabazar_rajbari, Uri.parse(getString(R.string.attr_loc5)),getString(R.string.attr_addr5)));
        places.add(new Place(getString(R.string.mother_house), R.drawable.mother_house, Uri.parse(getString(R.string.attr_loc6)),getString(R.string.attr_addr6)));
        places.add(new Place(getString(R.string.fort_wllm), R.drawable.fort_william, Uri.parse(getString(R.string.attr_loc7)),getString(R.string.attr_addr7)));
        places.add(new Place(getString(R.string.the_ind_msm), R.drawable.indian_museum, Uri.parse(getString(R.string.attr_loc8)),getString(R.string.attr_addr8)));
        places.add(new Place(getString(R.string.ind_cffe_hse), R.drawable.coffee_house, Uri.parse(getString(R.string.attr_loc9)),getString(R.string.attr_addr9)));
        places.add(new Place(getString(R.string.mrbl_plce), R.drawable.marble_palace, Uri.parse(getString(R.string.attr_loc10)),getString(R.string.attr_addr10)));
        places.add(new Place(getString(R.string.edn_grdns), R.drawable.eden_gardens, Uri.parse(getString(R.string.attr_loc11)),getString(R.string.attr_addr11)));
        places.add(new Place(getString(R.string.brla_plntrm), R.drawable.birla_planetarium, Uri.parse(getString(R.string.attr_loc12)),getString(R.string.attr_addr12)));
        places.add(new Place(getString(R.string.sci_city), R.drawable.science_city, Uri.parse(getString(R.string.attr_loc13)),getString(R.string.attr_addr13)));
        places.add(new Place(getString(R.string.brla_tech_msm), R.drawable.bitm_kolkata, Uri.parse(getString(R.string.attr_loc14)),getString(R.string.attr_addr14)));
        places.add(new Place(getString(R.string.shd_mnr), R.drawable.shahid_minar, Uri.parse(getString(R.string.attr_loc15)),getString(R.string.attr_addr15)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Place place = places.get(position);
                Uri geoLocation = place.getLocationId();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        return rootView;
    }

}

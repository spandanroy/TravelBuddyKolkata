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


public class MallsFragment extends Fragment {

    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.sth_cty_mll), R.drawable.south_city, Uri.parse(getString(R.string.mall_loc1)),getString(R.string.mall_addr1)));
        places.add(new Place(getString(R.string.qst_mll), R.drawable.quest, Uri.parse(getString(R.string.mall_loc2)),getString(R.string.mall_addr2)));
        places.add(new Place(getString(R.string.cty_cntr_1), R.drawable.city_centre_1, Uri.parse(getString(R.string.mall_loc3)),getString(R.string.mall_addr3)));
        places.add(new Place(getString(R.string.cty_cntr_2), R.drawable.city_centre_2, Uri.parse(getString(R.string.mall_loc4)),getString(R.string.mall_addr4)));
        places.add(new Place(getString(R.string.acrpls_mll), R.drawable.acropolis_mall, Uri.parse(getString(R.string.mall_loc5)),getString(R.string.mall_addr5)));
        places.add(new Place(getString(R.string.mni_sqr), R.drawable.mani_square, Uri.parse(getString(R.string.mall_loc6)),getString(R.string.mall_addr6)));
        places.add(new Place(getString(R.string.axs_mll), R.drawable.axis_mall, Uri.parse(getString(R.string.mall_loc7)),getString(R.string.mall_addr7)));
        places.add(new Place(getString(R.string.mtrpls_mll), R.drawable.metropolis_mall, Uri.parse(getString(R.string.mall_loc8)),getString(R.string.mall_addr8)));
        places.add(new Place(getString(R.string.frm_crtyd), R.drawable.forum_mall, Uri.parse(getString(R.string.mall_loc9)),getString(R.string.mall_addr9)));
        places.add(new Place(getString(R.string.dlf_gllria), R.drawable.dlf_galleria, Uri.parse(getString(R.string.mall_loc10)),getString(R.string.mall_addr10)));
        places.add(new Place(getString(R.string.e_mll), R.drawable.emall, Uri.parse(getString(R.string.mall_loc11)),getString(R.string.mall_addr11)));
        places.add(new Place(getString(R.string.lke_mll), R.drawable.lake_mall, Uri.parse(getString(R.string.mall_loc12)),getString(R.string.mall_addr12)));
        places.add(new Place(getString(R.string.mrln_hmlnd), R.drawable.homeland, Uri.parse(getString(R.string.mall_loc13)),getString(R.string.mall_addr13)));
        places.add(new Place(getString(R.string.hmtwn_rjrht), R.drawable.hometown_rajarhat, Uri.parse(getString(R.string.mall_loc14)),getString(R.string.mall_addr14)));
        places.add(new Place(getString(R.string.pvr_dmnd_plza), R.drawable.pvr_diamond_plaza, Uri.parse(getString(R.string.mall_loc15)),getString(R.string.mall_addr15)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_malls);

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

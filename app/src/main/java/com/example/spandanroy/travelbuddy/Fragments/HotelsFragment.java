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


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.jw_mrriot), R.drawable.marriott, Uri.parse(getString(R.string.htl_loc1)),getString(R.string.htl_addr1)));
        places.add(new Place(getString(R.string.tj_bngl), R.drawable.taj_bengal, Uri.parse(getString(R.string.htl_loc2)),getString(R.string.htl_addr2)));
        places.add(new Place(getString(R.string.itc_snr), R.drawable.itc_sonar, Uri.parse(getString(R.string.htl_loc3)),getString(R.string.htl_addr3)));
        places.add(new Place(getString(R.string.hyt_rgncy), R.drawable.hyatt, Uri.parse(getString(R.string.htl_loc4)),getString(R.string.htl_addr4)));
        places.add(new Place(getString(R.string.the_lalit), R.drawable.lalit_great_eastern, Uri.parse(getString(R.string.htl_loc5)),getString(R.string.htl_addr5)));
        places.add(new Place(getString(R.string.nvtl_klkta), R.drawable.novotel, Uri.parse(getString(R.string.htl_loc6)),getString(R.string.htl_addr6)));
        places.add(new Place(getString(R.string.the_gtewy), R.drawable.gateway_hotel, Uri.parse(getString(R.string.htl_loc7)),getString(R.string.htl_addr7)));
        places.add(new Place(getString(R.string.the_obroi_grnd), R.drawable.oberoi_grand, Uri.parse(getString(R.string.htl_loc8)),getString(R.string.htl_addr8)));
        places.add(new Place(getString(R.string.swsotel), R.drawable.swissotel, Uri.parse(getString(R.string.htl_loc9)),getString(R.string.htl_addr9)));
        places.add(new Place(getString(R.string.the_prk_klkta), R.drawable.park_hotel, Uri.parse(getString(R.string.htl_loc10)),getString(R.string.htl_addr10)));
        places.add(new Place(getString(R.string.htl_hndsthn), R.drawable.hindusthan_international, Uri.parse(getString(R.string.htl_loc11)),getString(R.string.htl_addr11)));
        places.add(new Place(getString(R.string.prlss_inn), R.drawable.peerless_inn, Uri.parse(getString(R.string.htl_loc12)),getString(R.string.htl_addr12)));
        places.add(new Place(getString(R.string.vdic_vllg_rsrts), R.drawable.vedic_village, Uri.parse(getString(R.string.htl_loc13)),getString(R.string.htl_addr13)));
        places.add(new Place(getString(R.string.htl_prd_plza), R.drawable.pride_plaza, Uri.parse(getString(R.string.htl_loc14)),getString(R.string.htl_addr14)));
        places.add(new Place(getString(R.string.htl_snnt), R.drawable.sonnet_hotel, Uri.parse(getString(R.string.htl_loc15)),getString(R.string.htl_addr15)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_hotels);


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

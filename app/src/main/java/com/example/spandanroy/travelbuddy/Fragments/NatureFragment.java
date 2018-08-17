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


public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.eco_trsm_prk), R.drawable.eco_park, Uri.parse(getString(R.string.ntr_loc1)), getString(R.string.ntr_addr1)));
        places.add(new Place(getString(R.string.prncp_ght), R.drawable.princep_ghat, Uri.parse(getString(R.string.ntr_loc2)), getString(R.string.ntr_addr2)));
        places.add(new Place(getString(R.string.klkta_mdn), R.drawable.maidan, Uri.parse(getString(R.string.ntr_loc3)), getString(R.string.ntr_addr3)));
        places.add(new Place(getString(R.string.cntrl_prk), R.drawable.central_park, Uri.parse(getString(R.string.ntr_loc4)), getString(R.string.ntr_addr4)));
        places.add(new Place(getString(R.string.mllenm_prk), R.drawable.millennium_park, Uri.parse(getString(R.string.ntr_loc5)), getString(R.string.ntr_addr5)));
        places.add(new Place(getString(R.string.rbndr_srvr), R.drawable.rabindra_sarovar, Uri.parse(getString(R.string.ntr_loc6)), getString(R.string.ntr_addr6)));
        places.add(new Place(getString(R.string.alpr_zoo), R.drawable.alipore_zoo, Uri.parse(getString(R.string.ntr_loc7)), getString(R.string.ntr_addr7)));
        places.add(new Place(getString(R.string.shbpr_btncl_grdn), R.drawable.shibpur_botanical_garden, Uri.parse(getString(R.string.ntr_loc8)), getString(R.string.ntr_addr8)));
        places.add(new Place(getString(R.string.nlbn_btng_cmplx), R.drawable.nalban, Uri.parse(getString(R.string.ntr_loc9)), getString(R.string.ntr_addr9)));
        places.add(new Place(getString(R.string.alpr_hrtcltre_grdns), R.drawable.alipore_horticulture, Uri.parse(getString(R.string.ntr_loc10)), getString(R.string.ntr_addr10)));
        places.add(new Place(getString(R.string.eco_aqtc_hb), R.drawable.aquatic_hub, Uri.parse(getString(R.string.ntr_loc11)), getString(R.string.ntr_addr11)));
        places.add(new Place(getString(R.string.ncco_prk), R.drawable.nicco_park, Uri.parse(getString(R.string.ntr_loc12)), getString(R.string.ntr_addr12)));
        places.add(new Place(getString(R.string.aqtca), R.drawable.aquatica, Uri.parse(getString(R.string.ntr_loc13)), getString(R.string.ntr_addr13)));
        places.add(new Place(getString(R.string.ntr_prk), R.drawable.nature_park, Uri.parse(getString(R.string.ntr_loc14)), getString(R.string.ntr_addr14)));
        places.add(new Place(getString(R.string.chntmni_kr_brd_snctry), R.drawable.bird_sanctuary, Uri.parse(getString(R.string.ntr_loc15)), getString(R.string.ntr_addr15)));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_nature);


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

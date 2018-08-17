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


public class ReligiousFragment extends Fragment {

    public ReligiousFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.dakhsnr_kali_tmpl), R.drawable.dakshineshwar, Uri.parse(getString(R.string.relg_loc1)),getString(R.string.relg_addr1)));
        places.add(new Place(getString(R.string.brla_mndr), R.drawable.birla_mandir, Uri.parse(getString(R.string.relg_loc2)),getString(R.string.relg_addr2)));
        places.add(new Place(getString(R.string.kalighat_tmpl), R.drawable.kalighat, Uri.parse(getString(R.string.relg_loc3)),getString(R.string.relg_addr3)));
        places.add(new Place(getString(R.string.durga_mndr), R.drawable.durga_mandir, Uri.parse(getString(R.string.relg_loc4)),getString(R.string.relg_addr4)));
        places.add(new Place(getString(R.string.swmi_nryn_tmpl), R.drawable.swaminarayan, Uri.parse(getString(R.string.relg_loc5)),getString(R.string.relg_addr5)));
        places.add(new Place(getString(R.string.iskcon_tmpl), R.drawable.iskcon, Uri.parse(getString(R.string.relg_loc6)),getString(R.string.relg_addr6)));
        places.add(new Place(getString(R.string.nakhoda_msq), R.drawable.nakhoda, Uri.parse(getString(R.string.relg_loc7)),getString(R.string.relg_addr7)));
        places.add(new Place(getString(R.string.tipu_sltn_msjd), R.drawable.tipu_sultan_masjid, Uri.parse(getString(R.string.relg_loc8)),getString(R.string.relg_addr8)));
        places.add(new Place(getString(R.string.st_paul_cthedrl), R.drawable.st_paul, Uri.parse(getString(R.string.relg_loc9)),getString(R.string.relg_addr9)));
        places.add(new Place(getString(R.string.st_jhn_chrch), R.drawable.st_john, Uri.parse(getString(R.string.relg_loc10)),getString(R.string.regl_addr10)));
        places.add(new Place(getString(R.string.prsnth_jn_tmpl), R.drawable.pareshnath_jain_temple, Uri.parse(getString(R.string.relg_loc11)),getString(R.string.relg_addr11)));
        places.add(new Place(getString(R.string.agni_mndr), R.drawable.agni_mandir, Uri.parse(getString(R.string.relg_loc12)),getString(R.string.relg_addr12)));
        places.add(new Place(getString(R.string.grudwra_bari_sngt), R.drawable.gurdwara_bari_sangat, Uri.parse(getString(R.string.relg_loc13)),getString(R.string.relg_addr13)));
        places.add(new Place(getString(R.string.grudwara_snt_ktya), R.drawable.gurdwara_sant_kutiya, Uri.parse(getString(R.string.relg_loc14)),getString(R.string.relg_addr14)));
        places.add(new Place(getString(R.string.mgn_dvd_syngg), R.drawable.magen_david_synagogue, Uri.parse(getString(R.string.relg_loc15)),getString(R.string.relg_addr15)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_religious);

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

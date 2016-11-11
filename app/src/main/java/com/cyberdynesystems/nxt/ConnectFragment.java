package com.cyberdynesystems.nxt;

//import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;

/**
 * Created by wqin1 on 11/11/16.
 */
public class ConnectFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_connect, container, false);

        //TextView tv = (TextView) v.findViewById(R.id.vv_frag_connect_intro);
        //tv.setText(getArguments().getString("msg"));

        return v;
    }

    public static ConnectFragment newInstance() {


        ConnectFragment f = new ConnectFragment();
//        Bundle b = new Bundle();
//        b.putString("msg", text);
//
//        f.setArguments(b);
//
        return f;
    }

}

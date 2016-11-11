package com.cyberdynesystems.nxt;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;
/**
 * Created by wqin1 on 11/11/16.
 */
public class DriveFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drive, container, false);


        return v;
    }

    public static DriveFragment newInstance() {

        DriveFragment f = new DriveFragment();

        return f;
    }
}

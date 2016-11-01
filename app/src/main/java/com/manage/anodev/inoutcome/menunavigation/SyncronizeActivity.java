package com.manage.anodev.inoutcome.menunavigation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.manage.anodev.inoutcome.R;

public class SyncronizeActivity extends Fragment {

    public SyncronizeActivity(){}
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_syncronize, container, false);

        Toolbar toolbar = (Toolbar)getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Syncronize");
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorSyncron));
        LinearLayout linear = (LinearLayout)getActivity().findViewById(R.id.nav_head);
        linear.setBackgroundColor(getResources().getColor(R.color.colorSyncron));
        setHasOptionsMenu(true);
        return view;
    }
}

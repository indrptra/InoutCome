package com.manage.anodev.inoutcome.menunavigation;

import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.manage.anodev.inoutcome.DataHelper;
import com.manage.anodev.inoutcome.R;
import com.manage.anodev.inoutcome.userauthentication.Expense;
import com.manage.anodev.inoutcome.userauthentication.Income;

import java.util.ArrayList;

public class DashboardActivity extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "RecyclerViewActivity";

    public DashboardActivity(){}
    View view;
    DataHelper db;
    Expense ex;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_dashboard, container, false);

        Toolbar toolbar = (Toolbar)getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Dashboard");
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        LinearLayout linearnav = (LinearLayout)getActivity().findViewById(R.id.nav_head);
        linearnav.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

       /* mRecyclerView = (RecyclerView)view.findViewById(R.id.rv_expense);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
       // mAdapter = new MyRecycleViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        RecyclerView.ItemDecoration itemDecoration =
                new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL);
        mRecyclerView.addItemDecoration(itemDecoration);
        db = ((MainActivity)getActivity()).getDb();*/

        setHasOptionsMenu(true);
        return view;
    }
/*
    @Override
    public void onResume() {
        super.onResume();
        ((MyRecycleViewAdapter) mAdapter).setOnItemClickListener(new MyRecycleViewAdapter.MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
            }
        });
    }

    private ArrayList<DataObject> getDataSet() {
        ArrayList results = new ArrayList<DataObject>();
        Cursor c = db.getAllContacts();
        int temp =0;
        while (c.moveToNext()){
            DataObject dob = new DataObject(c.getString(1),
                    "Rp." + c.getInt(2));
            results.add(temp, dob);
            temp++;
        }

        return results;
    }
*/
}

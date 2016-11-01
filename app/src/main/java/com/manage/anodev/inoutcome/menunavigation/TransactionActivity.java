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
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.manage.anodev.inoutcome.DataHelper;
import com.manage.anodev.inoutcome.R;
import com.manage.anodev.inoutcome.userauthentication.Expense;
import com.manage.anodev.inoutcome.userauthentication.Income;

import static com.manage.anodev.inoutcome.userauthentication.Expense.saveExpense;
import static com.manage.anodev.inoutcome.userauthentication.Income.saveIncome;

public class TransactionActivity extends Fragment implements View.OnClickListener {
    EditText etdesex,etamoex,etdesin,etamoin;
    Button btnex,btnin;
    private DataHelper databaseHelper;

    public TransactionActivity(){}
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.activity_transaction, container, false);

        Toolbar toolbar = (Toolbar)getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Transaction");
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorTransaction));
        LinearLayout linear = (LinearLayout)getActivity().findViewById(R.id.nav_head);
        linear.setBackgroundColor(getResources().getColor(R.color.colorTransaction));
        setHasOptionsMenu(true);

        databaseHelper = ((MainActivity)getActivity()).getDb();

        etdesex = (EditText)view.findViewById(R.id.et_descripexpense);
        etdesin = (EditText)view.findViewById(R.id.et_descripincome);
        etamoex = (EditText)view.findViewById(R.id.et_amountexpense);
        etamoin = (EditText)view.findViewById(R.id.et_amountincome);
        btnex = (Button)view.findViewById(R.id.btn_addexpense);
        btnin = (Button)view.findViewById(R.id.btn_addincome);
        btnin.setOnClickListener(this);
        btnex.setOnClickListener(this);
        /*btnin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //myDB.open();
          Income income = new Income();
        income.setDescription(etdesin.getText().toString());
        income.setAmounth(Integer.valueOf(etamoin.getText().toString()));
        if(saveIncome(databaseHelper, income))
            Toast.makeText(getActivity(), "Succes Adding Data.", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getActivity(), "Failed Adding Data.", Toast.LENGTH_SHORT).show();
            }
        });*/

       // btnin.setOnClickListener(this);
        return view;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_addexpense :
                Expense expense = new Expense();
                expense.setDescription(etdesex.getText().toString());
                expense.setAmounth(Integer.valueOf(etamoex.getText().toString()));
                if(saveExpense(databaseHelper, expense))
                    Toast.makeText(getActivity(), "Succes Adding Data.", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(), "Failed Adding Data.", Toast.LENGTH_SHORT).show();

                break;
            case R.id.btn_addincome :
                Income income = new Income();
                income.setDescription(etdesin.getText().toString());
                income.setAmounth(Integer.valueOf(etamoin.getText().toString()));
                if(saveIncome(databaseHelper, income))
                    Toast.makeText(getActivity(), "Succes Adding Data.", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(), "Failed Adding Data.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

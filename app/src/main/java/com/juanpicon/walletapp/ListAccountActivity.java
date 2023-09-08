package com.juanpicon.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView myRecycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        myRecycleAccount = findViewById(R.id.rv_list_account);
        AccountAdapter myAdaptor = new AccountAdapter(listAccountRV);
        myRecycleAccount.setAdapter(myAdaptor);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData() {
        Account myAcocunt1 = new Account("Bancolombia", "Cuenta de ahorros", 100013550.0);
        Account myAcocunt2 = new Account("Davivienda", "Cuenta debito", 4512000.0);
        Account myAcocunt3 = new Account("Efecto", "Efectivo", 4567894.0);
        listAccountRV.add(myAcocunt1);
        listAccountRV.add(myAcocunt2);
        listAccountRV.add(myAcocunt3);

    }
}
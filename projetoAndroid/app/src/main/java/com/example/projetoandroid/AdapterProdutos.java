package com.example.projetoandroid;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class AdapterProdutos extends ArrayAdapter<Produto> {
    private Context context;

    private ArrayList<Produto> produtos;

    public AdapterProdutos(Context context, ArrayList<Produto>produtos)
    {
        super(context,R.layout.item_lista,produtos);
        this.context = context;

        this.produtos = produtos;

    }



}

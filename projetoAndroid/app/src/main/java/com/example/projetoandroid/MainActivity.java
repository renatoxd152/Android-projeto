package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaprodutos;
    private String[] itens =
    {
            "Arroz", "Feijão", "Carne"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaprodutos = findViewById(R.id.listaProdutos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaprodutos.setAdapter(adapter);
        listaprodutos.setOnItemClickListener( new EscutadorLista() );
        listaprodutos.setOnItemLongClickListener( new EscutadorLista() );
    }

    private class EscutadorLista implements AdapterView.OnItemClickListener,
            AdapterView.OnItemLongClickListener {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            Toast.makeText(MainActivity.this, "Clique comum: " + listaprodutos.getItemAtPosition(i).toString(),
                    Toast.LENGTH_SHORT).show();
        }

        @Override
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(MainActivity.this, "Clique longo: " + listaprodutos.getItemAtPosition(i).toString(),
                    Toast.LENGTH_SHORT).show();
            return true;
        }
    }
    public void segundaTela(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}

package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ArrayList<Produto> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void primeiraTela(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void inserir(View v) {

        TextView resultado = findViewById(R.id.mensagemAviso);
        resultado.setText("");

        EditText editTextNome = findViewById(R.id.nome_input);
        String nomeDigitado = editTextNome.getText().toString();

        EditText marca = findViewById(R.id.marca_input);
        String marcaDigitada = marca.getText().toString();

        EditText quantidade = findViewById(R.id.quantidade_input);
        String quantidadeDigitado = quantidade.getText().toString();

        int quantidadeInt = Integer.parseInt(quantidadeDigitado);

        if(nomeDigitado.isEmpty() || marcaDigitada.isEmpty() || quantidadeDigitado.isEmpty())
        {
            resultado.setText("Preencha todos os campos corretamente!");
        }
        else
        {
            Produto produto = new Produto(nomeDigitado,marcaDigitada,quantidadeInt);

            if(produtos.add(produto))
            {
                primeiraTela(v);
            }
            else
            {
                resultado.setText("Houve um erro ao adicionar o produto,tente novamente!");
            }
        }


    }

}
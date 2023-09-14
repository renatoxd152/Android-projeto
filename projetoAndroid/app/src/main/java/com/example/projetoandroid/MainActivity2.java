package com.example.projetoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void primeiraTela(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    Button btn = (Button)findViewById(R.id.inserir);
    btn.setOnClickListener(new View.OnClickListener()
    {
        
    });
}
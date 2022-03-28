package com.example.appindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Button btn_Enviar;
    private EditText pt_Nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_Enviar = findViewById(R.id.btn_Enviar);
        pt_Nombres = findViewById(R.id.pt_Nombre);

        btn_Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("Nombres", pt_Nombres.getText().toString());
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
package com.example.appindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Button btn_Enviar;
    private EditText tb_Nombres;
    private EditText tb_CorreoElectronico;
    private EditText tb_Telefono;
    private CheckBox cb_TieneMascotas;
    private EditText tb_CantidadMascotas;
    private EditText tb_AnimalAdoptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_Enviar = findViewById(R.id.btn_Enviar);
        tb_Nombres = findViewById(R.id.tb_Nombres);
        tb_CorreoElectronico = findViewById(R.id.tb_CorreoElectronico);
        tb_Telefono = findViewById(R.id.tb_Telefono);
        cb_TieneMascotas = findViewById(R.id.cb_TieneMascotas);
        tb_CantidadMascotas = findViewById(R.id.tb_CantidadMascotas);
        tb_AnimalAdoptar = findViewById(R.id.tb_AnimalAdoptar);

        btn_Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("Nombres", tb_Nombres.getText().toString());
                bundle.putString("CorreoElectronico", tb_CorreoElectronico.getText().toString());
                bundle.putString("Telefono", tb_Telefono.getText().toString());
                bundle.putString("TieneMascotas", cb_TieneMascotas.isChecked() ? "Si" : "No");
                bundle.putString("CantidadMascotas", tb_CantidadMascotas.getText().toString());
                bundle.putString("AnimalAdoptar", tb_AnimalAdoptar.getText().toString());

                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}
package com.example.appindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button btn_Salir;
    private TextView tv_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn_Salir = findViewById(R.id.btn_Salir);
        tv_Resultado = findViewById(R.id.tv_Resultado);

        String DatosIngresados = "";
        Bundle bundle = getIntent().getExtras();

        String Nombres = bundle.getString("Nombres");
        String CorreoElectronico = bundle.getString("CorreoElectronico");
        String Telefono = bundle.getString("Telefono");
        String TieneMascotas = bundle.getString("TieneMascotas");
        String CantidadMascotas = bundle.getString("CantidadMascotas");
        String AnimalAdoptar = bundle.getString("AnimalAdoptar");


        DatosIngresados += "Nombres: " + Nombres + "\n\n";
        DatosIngresados += "Correo electrónico: " + CorreoElectronico + "\n\n";
        DatosIngresados += "Telefono: " + Telefono + "\n\n";
        DatosIngresados += "Tiene Mascotas: " + TieneMascotas + "\n\n";
        DatosIngresados += "Cantidad Mascotas: " + CantidadMascotas + "\n\n";
        DatosIngresados += "Animal Adoptar: " + AnimalAdoptar + "\n\n";

        tv_Resultado.setText(DatosIngresados);

        btn_Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);
            }
        });
    }
}
package com.example.loginproject.UI;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.text.Html;

import com.example.loginproject.R;

public class PoliticasDeActivity extends AppCompatActivity {

    private TextView txtPoliticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicas_de);

        txtPoliticas = findViewById(R.id.txtPoliticas);

        //codigo dado en la guia 6
        /*
        String politicasTexto = "Términos y Condiciones:\n\n"
                + "1. **Privacidad:** Todos los datos personales proporcionados serán utilizados exclusivamente para mejorar el servicio.\n\n"
                + "2. **Uso Responsable:** Los usuarios se comprometen a utilizar la aplicación de manera ética y conforme a la ley.\n\n"
                + "3. **Modificaciones:** La empresa se reserva el derecho de modificar los términos de uso y políticas de privacidad en cualquier momento.\n\n"
                + "4. **Responsabilidad:** La empresa no se hace responsable por el mal uso de la aplicación por parte de los usuarios.\n\n"
                + "5. **Seguridad:** Se implementarán medidas de seguridad para proteger la información del usuario, aunque no se garantiza la protección absoluta.\n\n"
                + "6. **Consentimiento:** Al utilizar esta aplicación, el usuario acepta estos términos y condiciones.";


        // Asignar el texto al TextView
        txtPoliticas.setText(politicasTexto);
         */

        //codigo con unas pequeñas mejoras para darle un aspecto mas suave
        //incorporando un poco de html debido a que se trabaja desde la clase .java
        String politicasTexto = "<h2>Términos y Condiciones:</h2>"
                + "<p><b>1. Privacidad:</b> Todos los datos personales proporcionados serán utilizados exclusivamente para mejorar el servicio.</p>"
                + "<p><b>2. Uso Responsable:</b> Los usuarios se comprometen a utilizar la aplicación de manera ética y conforme a la ley.</p>"
                + "<p><b>3. Modificaciones:</b> La empresa se reserva el derecho de modificar los términos de uso y políticas de privacidad en cualquier momento.</p>"
                + "<p><b>4. Responsabilidad:</b> La empresa no se hace responsable por el mal uso de la aplicación por parte de los usuarios.</p>"
                + "<p><b>5. Seguridad:</b> Se implementarán medidas de seguridad para proteger la información del usuario, aunque no se garantiza la protección absoluta.</p>"
                + "<p><b>6. Consentimiento:</b> Al utilizar esta aplicación, el usuario acepta estos términos y condiciones.</p>";

        TextView txtPoliticas = findViewById(R.id.txtPoliticas);
        txtPoliticas.setText(Html.fromHtml(politicasTexto));

    }

}
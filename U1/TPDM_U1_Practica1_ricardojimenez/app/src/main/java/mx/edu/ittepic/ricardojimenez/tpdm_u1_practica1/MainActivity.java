package mx.edu.ittepic.ricardojimenez.tpdm_u1_practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText nombre;
    TextView titulo;
    Button btn;
    RadioButton rb;
    Spinner cmbEscuela;
    Switch swSolicitud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inicializar variables
        nombre = findViewById(R.id.inNombre);
        btn = findViewById(R.id.btnSaludar);
        rb = findViewById(R.id.rbEscuela);
        cmbEscuela = findViewById(R.id.escuela);
        swSolicitud = findViewById(R.id.swSolicitud);
        titulo = findViewById(R.id.tittulo);

//        desactivar oculto
        cmbEscuela.setEnabled(false);
        swSolicitud.setEnabled(false);
    }

    public void saludar(View v){


            Toast.makeText(this,"Saludos "+nombre.getText().toString(),Toast.LENGTH_LONG).show();
    }

    public void activarParte(View v){

            cmbEscuela.setEnabled(true);
            swSolicitud.setEnabled(true);

    }

    public void enviarSolicitud(View v){
        if(swSolicitud.isChecked()){
            titulo.setText("Solicitud enviada a: "+cmbEscuela.getSelectedItem().toString());
        }else{
            titulo.setText("Bienvenido");
        }
    }
}

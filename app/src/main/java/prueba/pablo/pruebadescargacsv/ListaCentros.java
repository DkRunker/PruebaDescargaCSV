package prueba.pablo.pruebadescargacsv;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class ListaCentros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_centros);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        leeFicheroCSV();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista_centros, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<CentroMedico> listaCentros = new ArrayList<CentroMedico>();
    private void leeFicheroCSV(){
        InputStream is = getResources().openRawResource(R.raw.registro_de_centros_sanitarios_de_castilla_y_le_n);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

        String line = "";
        try {
            reader.readLine();
            while ((line = reader.readLine()) != null){
                if(line.contains(";")){
                    //Separar por ;
                    String[] elementos = line.split(";");

                    //Tratar la linea de informacion
                    CentroMedico centro = new CentroMedico();
                    if(elementos.length >= 12 && elementos[0] != null)
                        centro.setNombre(elementos[0]);
                    else
                        centro.setNombre("");
                    if(elementos.length >= 12 && elementos[1] != null)
                        centro.setNumRegistro(elementos[1]);
                    else
                        centro.setNumRegistro("");
                    if(elementos.length >= 12 && elementos[2] != null)
                        centro.setDireccion(elementos[2]);
                    else
                        centro.setDireccion("");
                    if(elementos.length >= 12 && elementos[3] != null)
                        centro.setCodPostal(elementos[3]);
                    else
                        centro.setCodPostal("");
                    if(elementos.length >= 12 && elementos[4] != null)
                        centro.setLocalidad(elementos[4]);
                    else
                        centro.setLocalidad("");
                    if(elementos.length >= 12 && elementos[5] != null)
                        centro.setProvincia(elementos[5]);
                    else
                        centro.setProvincia("");
                    if(elementos.length >= 12 && elementos[6] != null)
                        centro.setTelefono(elementos[6]);
                    else
                        centro.setTelefono("");
                    if(elementos.length >= 12 && elementos[7] != null)
                        centro.setFax(elementos[7]);
                    else
                        centro.setFax("");
                    if(elementos.length >= 12 && elementos[8] != null)
                        centro.setTipoCentro(elementos[8]);
                    else
                        centro.setTipoCentro("");
                    if(elementos.length >= 12 && elementos[9] != null)
                        centro.setFinalidadAsistencial(elementos[9]);
                    else
                        centro.setFinalidadAsistencial("");
                    if(elementos.length >= 12 && elementos[10] != null)
                        centro.setTitularidad(elementos[10]);
                    else
                        centro.setTitularidad("");
                    if(elementos.length >= 12 && elementos[11] != null)
                        centro.setDependenciaFuncional(elementos[11]);
                    else
                        centro.setDependenciaFuncional("");
                    listaCentros.add(centro);

                    Log.d("MyActivity", "Centro: " + centro);
                }
            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error leyendo el fichero en la línea " + line, e);
            e.printStackTrace();
        }

    }
}


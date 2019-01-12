package ifpe.com.br.exercicio_duplas.Native;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class ListadeContatosActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listade_contatos);


        Button buttonConecta = (Button) findViewById(R.id.buttonConecta);


        buttonConecta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                String s = "Conexão";
                if(wifi.isConnected()){
                    s += " Wi-fi";
                }else if (mobile.isConnected()){
                    s += " Móvel";
                }else{
                    s = "Sem conexão";
                }
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }});

        Button buttonContatos = (Button) findViewById(R.id.buttonContatos);

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ListadeContatosActivity.this, ContatosActivity.class);
                startActivity(it);
            }
        });

        Button buttonVoltar12 = (Button) findViewById(R.id.buttonVoltar12);

        buttonVoltar12.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent it = new Intent(ListadeContatosActivity.this, MainActivity.class);
                    startActivity(it);
                }
            });

        }
}

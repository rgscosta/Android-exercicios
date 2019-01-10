package ifpe.com.br.exercicio_duplas.Native;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class ListadeContatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listade_contatos);

        Button buttonVoltar12 = (Button) findViewById(R.id.buttonVoltar12);

        buttonVoltar12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ListadeContatosActivity.this, MainActivity.class);
                startActivity(it);
            }
        });

    }
}

package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class ViewActivity extends AppCompatActivity {


    private  View ver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        ver = (View) findViewById(R.id.view);
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                boolean  checked = ((View)ver).isClickable();
                StringBuffer result = new StringBuffer();

                if(checked){
                    result.append("View : ").append("TRUE");
                }else {
                    result = new StringBuffer();
                    result.append("View : ").append("FALSE");
                }
                Toast.makeText(ViewActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonVoltar1 = (Button) findViewById(R.id.buttonVoltar1);
        buttonVoltar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ViewActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}

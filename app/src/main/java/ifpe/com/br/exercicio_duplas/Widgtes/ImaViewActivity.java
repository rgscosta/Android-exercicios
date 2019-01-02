package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class ImaViewActivity extends AppCompatActivity {

    private ImageView imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ima_view);

        imagem = (ImageView) findViewById(R.id.imageViewSanta);
        imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean  checked = ((ImageView)imagem).isClickable();
                StringBuffer result = new StringBuffer();

                if(checked){
                    result.append("Imagem: ").append("TRUE");
                }else {
                    result = new StringBuffer();
                    result.append("Imagem : ").append("FALSE");
                }
                Toast.makeText(ImaViewActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonVoltar2 = (Button) findViewById(R.id.buttonVoltar2);
        buttonVoltar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ImaViewActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}

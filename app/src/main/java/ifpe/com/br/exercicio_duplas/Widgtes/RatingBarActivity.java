package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class RatingBarActivity extends AppCompatActivity {


    private TextView txtRatingValor;
    private Button buttonEnviar;
    private RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        addListenerOnButton();
        addListenerOnRatingBar();
    }
    public void addListenerOnRatingBar() {

        ratingBar = findViewById(R.id.ratingBar);
        txtRatingValor = findViewById(R.id.txtRatingValor);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

                txtRatingValor.setText(String.valueOf(rating));
            }
        });
    }
    public void addListenerOnButton() {


        buttonEnviar = findViewById(R.id.buttonEnviar);
        ratingBar = findViewById(R.id.ratingBar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(RatingBarActivity.this,
                        String.valueOf(ratingBar.getRating()),
                        Toast.LENGTH_SHORT).show();

            }

        });

        Button buttonVoltar9 = findViewById(R.id.buttonVoltar9);

        buttonVoltar9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent( RatingBarActivity.this , MainActivity.class);
                startActivity(it);
            }
        });

    }
}

package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class SeekBarActivity extends AppCompatActivity {



    private SeekBar seekBar;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);
        inicializarVariaveis();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                int progress = 0;
                @Override
                public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                    progress =  progressValue;
                    Toast.makeText(getApplicationContext(), "Carregando seekbar", Toast.LENGTH_SHORT).show();
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(getApplicationContext(), "Iniciando  seekbar", Toast.LENGTH_SHORT).show();
                }
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    textView.setText("Covered: " + progress + "/" + seekBar.getMax());
                    Toast.makeText(getApplicationContext(), "Parando  seekbar", Toast.LENGTH_SHORT).show();
                }
            });

        Button buttonVoltar8 = findViewById(R.id.buttonVoltar8);
        buttonVoltar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent( SeekBarActivity.this , MainActivity.class);
                startActivity(it);
            }
        });
        }
        private void inicializarVariaveis() {
            seekBar = findViewById(R.id.seekBar);
            textView = findViewById(R.id.textViewSeekBar);
        }



}


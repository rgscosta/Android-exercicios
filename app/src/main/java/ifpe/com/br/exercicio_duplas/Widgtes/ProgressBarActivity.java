package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class ProgressBarActivity extends AppCompatActivity {

    protected static final int TIMER_RUNTIME = 10000;

    private boolean pgAtivo; //verifica se progress está ativa
    private ProgressBar tProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        tProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        final Thread timeThread = new Thread() {

            @Override
            public void run() {
                pgAtivo = true;
                try {
                    int waited = 0;
                    while (pgAtivo && (waited < TIMER_RUNTIME)) {
                        sleep(200);
                        if (pgAtivo) {
                            waited += 200;
                            Progress(waited);
                        }
                    }
                } catch (InterruptedException e) {

                } finally {
                    onContinue();
                }
            }
        };
        timeThread.start();
    }
    private void Progress(final int timePassed) {
        if (null != tProgressBar) {
            final int progress = tProgressBar.getMax() * timePassed / TIMER_RUNTIME;
            tProgressBar.setProgress(progress);
        }
    }
         private void onContinue() {
        Log.d("messagemFinal", "load finalizou");

        Button buttonVoltar6 = (Button) findViewById(R.id.buttonVoltar6);
        buttonVoltar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent( ProgressBarActivity.this , MainActivity.class);
                startActivity(it);
            }
        });
    }

}


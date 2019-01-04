package ifpe.com.br.exercicio_duplas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ifpe.com.br.exercicio_duplas.Native.CompartilhamentoActivity;
import ifpe.com.br.exercicio_duplas.Native.HelloCameraActivity;
import ifpe.com.br.exercicio_duplas.Native.HelloPhoneActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.CalendViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ImaViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ProgressBarActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.RatingBarActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.SearchViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.SeekBarActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.VideoViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.WebViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonView = (Button) findViewById(R.id.buttonView);
        buttonView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(it);
            }
        });

        Button buttonImaView = (Button) findViewById(R.id.buttonImaView);
        buttonImaView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ImaViewActivity.class);
                startActivity(it);
            }
        });

        Button buttonWebView = (Button) findViewById(R.id.buttonWebView);
        buttonWebView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(it);
            }
        });

        Button buttoncalendView = (Button) findViewById(R.id.buttoncalendView);
        buttoncalendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CalendViewActivity.class);
                startActivity(it);
            }
        });

        Button buttonProgressBar = (Button) findViewById(R.id.buttonProgressBar);
        buttonProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ProgressBarActivity.class);
                startActivity(it);
            }
        });

        Button buttonVideoView = (Button) findViewById(R.id.buttonVideoView);
        buttonVideoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, VideoViewActivity.class);
                startActivity(it);
            }
        });


        Button buttonSeekBar = (Button) findViewById(R.id.buttonSeekBar);
        buttonSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, SeekBarActivity.class);
                startActivity(it);
            }
        });

        Button buttonRatingBar = (Button) findViewById(R.id.buttonRatingBar);
        buttonRatingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, RatingBarActivity.class);
                startActivity(it);
            }
        });

        Button buttonFoto = (Button) findViewById(R.id.buttonFoto);
        buttonFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, HelloCameraActivity.class);
                startActivity(it);
            }
        });

        Button buttonLigar = (Button) findViewById(R.id.buttonLigar);
        buttonLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, HelloPhoneActivity.class);
                startActivity(it);
            }
        });

        Button buttonCompart = (Button) findViewById(R.id.buttonCompart);
        buttonCompart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CompartilhamentoActivity.class);
                startActivity(it);
            }
        });

        Button buttonSearchView = (Button) findViewById(R.id.buttonSearchView);
        buttonSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, SearchViewActivity.class);
                startActivity(it);
            }
        });


    }
}

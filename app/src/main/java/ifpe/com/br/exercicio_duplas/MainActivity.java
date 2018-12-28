package ifpe.com.br.exercicio_duplas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ifpe.com.br.exercicio_duplas.Widgtes.CalendViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ImaViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ProgressBarActivity;
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


    }
}

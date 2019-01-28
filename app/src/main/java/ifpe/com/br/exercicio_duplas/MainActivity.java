package ifpe.com.br.exercicio_duplas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ifpe.com.br.exercicio_duplas.Native.CompartilhamentoActivity;
import ifpe.com.br.exercicio_duplas.Native.HelloCameraActivity;
import ifpe.com.br.exercicio_duplas.Native.HelloPhoneActivity;
import ifpe.com.br.exercicio_duplas.Native.ListadeContatosActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ActionBarActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.CalendViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ImaViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ProgressBarActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.RatingBarActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.SearchViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.SeekBarActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.VideoViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.ViewActivity;
import ifpe.com.br.exercicio_duplas.Widgtes.WebViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonView = (Button) findViewById(R.id.buttonView);
        Button buttonImaView = (Button) findViewById(R.id.buttonImaView);
        Button buttonWebView = (Button) findViewById(R.id.buttonWebView);
        Button buttoncalendView = (Button) findViewById(R.id.buttoncalendView);
        Button buttonProgressBar = (Button) findViewById(R.id.buttonProgressBar);
        Button buttonVideoView = (Button) findViewById(R.id.buttonVideoView);
        Button buttonSeekBar = (Button) findViewById(R.id.buttonSeekBar);
        Button buttonRatingBar = (Button) findViewById(R.id.buttonRatingBar);
        Button buttonFoto = (Button) findViewById(R.id.buttonFoto);
        Button buttonLigar = (Button) findViewById(R.id.buttonLigar);
        Button buttonCompart = (Button) findViewById(R.id.buttonCompart);
        Button buttonSearchView = (Button) findViewById(R.id.buttonSearchView);
        Button buttonActionBar = (Button) findViewById(R.id. buttonActionBar);
        Button buttonContatos= (Button) findViewById(R.id. buttonContatos);

        buttonView.setOnClickListener(this);
        buttonImaView.setOnClickListener(this);
        buttonWebView.setOnClickListener(this);
        buttoncalendView.setOnClickListener(this);
        buttonProgressBar.setOnClickListener(this);
        buttonVideoView.setOnClickListener(this);
        buttonSeekBar.setOnClickListener(this);
        buttonRatingBar.setOnClickListener(this);
        buttonFoto.setOnClickListener(this);
        buttonLigar.setOnClickListener(this);
        buttonCompart.setOnClickListener(this);
        buttonSearchView.setOnClickListener(this);
        buttonActionBar.setOnClickListener(this);
        buttonContatos.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttonView :
                Intent View = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(View);
                break;
            case R.id.buttonImaView :
                Intent ImaView = new Intent(MainActivity.this, ImaViewActivity.class);
                startActivity(ImaView);
                break;
            case R.id.buttonWebView :
                Intent WebView = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(WebView);
                break;
            case R.id.buttoncalendView :
                Intent calendView = new Intent(MainActivity.this, CalendViewActivity.class);
                startActivity(calendView);
                break;
            case R.id.buttonProgressBar :
                Intent ProgressBar = new Intent(MainActivity.this, ProgressBarActivity.class);
                startActivity(ProgressBar);
                break;
            case R.id.buttonVideoView :
                Intent VideoView = new Intent(MainActivity.this, VideoViewActivity.class);
                startActivity(VideoView);
                break;
            case R.id.buttonSeekBar:
                Intent SeekBar = new Intent(MainActivity.this, SeekBarActivity.class);
                startActivity(SeekBar);
                break;
            case R.id.buttonRatingBar :
                Intent RatingBar = new Intent(MainActivity.this, RatingBarActivity.class);
                startActivity(RatingBar);
                break;
            case R.id.buttonFoto :
                Intent HelloCamera = new Intent(MainActivity.this, HelloCameraActivity.class);
                startActivity(HelloCamera);
                break;
            case R.id.buttonLigar :
                Intent HelloPhone = new Intent(MainActivity.this, HelloPhoneActivity.class);
                startActivity(HelloPhone);
                break;
            case R.id.buttonCompartilhamento :
                Intent Compartilhamento = new Intent(MainActivity.this, CompartilhamentoActivity.class);
                startActivity(Compartilhamento);
                break;
            case R.id.buttonSearchView :
                Intent SearchView = new Intent(MainActivity.this, SearchViewActivity.class);
                startActivity(SearchView);;
                break;
            case R.id.buttonActionBar :
                Intent ActionBarActivity = new Intent(MainActivity.this, ActionBarActivity.class);
                startActivity(ActionBarActivity);
                break;
            case R.id.buttonContatos :
                Intent ListadeContatos = new Intent(MainActivity.this, ListadeContatosActivity.class);
                startActivity(ListadeContatos);
                break;
        }

    }
}

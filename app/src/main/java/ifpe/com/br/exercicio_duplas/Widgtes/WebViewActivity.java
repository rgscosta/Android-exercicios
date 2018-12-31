package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;


public class WebViewActivity extends AppCompatActivity {


    private WebView web;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        web = (WebView) findViewById(R.id.webView);
        editText = (EditText) findViewById(R.id.url);

        web.setWebViewClient(new MyBrowser());

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        Button buttonVoltar4 = (Button) findViewById(R.id.buttonVoltar4);
        buttonVoltar4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent it = new Intent(WebViewActivity.this, MainActivity.class);
                startActivity(it);
            }
        });

    }
    public void abriView (View v) {

        String url = editText.getText().toString();
        web.getSettings().setLoadsImagesAutomatically(true);
        web.getSettings().setJavaScriptEnabled(true);
        web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        web.loadUrl(url);
    }
     public void acessodireto (View v) {
        web.getSettings().setLoadsImagesAutomatically(true);
        web.getSettings().setJavaScriptEnabled(true);
        web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        web.loadUrl("http://www.google.com.br");
    }
    private class  MyBrowser  extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}

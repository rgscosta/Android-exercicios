package ifpe.com.br.exercicio_duplas.Widgtes;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ifpe.com.br.exercicio_duplas.R;

public class ActionBarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);

        //Button volta no actionbar porem esta com erros.
       //getActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){

       getMenuInflater().inflate(R.menu.menu_main,menu);
       return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_search) {
            toast("clicou em Search");
            return true;
        } else if (id == R.id.action_refresh) {
            toast("Clicou em Refresh");
            return true;
        } else if (id == R.id.action_settings) {
            toast("Clicou em Settings");
            return true;
        } else if (id == R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);

        }
        //Cria mensagens para passar no Toast
        private void toast (String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}

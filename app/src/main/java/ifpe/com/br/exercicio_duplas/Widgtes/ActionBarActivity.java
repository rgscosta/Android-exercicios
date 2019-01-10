package ifpe.com.br.exercicio_duplas.Widgtes;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import ifpe.com.br.exercicio_duplas.R;

import static android.R.id.home;

public class ActionBarActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
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
        } else if (id == home){
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





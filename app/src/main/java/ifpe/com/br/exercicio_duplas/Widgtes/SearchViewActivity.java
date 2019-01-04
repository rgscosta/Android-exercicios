package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class SearchViewActivity extends AppCompatActivity {

    private SearchView searchView;
    private ListView listView;
    private List<String> list = Arrays.asList("Santa Cruz", "Sport-PE", "Náutico", "Porto", "Afogados",
            "Petrolina", "Salgueiro", "Vitória", "América-PE", "Flamengo de Arcoverde");
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        inicializarVariaveis();
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
            listView.setAdapter(adapter);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {

               if (list.contains(query)) {
                   adapter.getFilter().filter(query);
              } else {
                   Toast.makeText(SearchViewActivity.this, "Não achou o seu time", Toast.LENGTH_LONG).show();
               }
               return false;
               }
               @Override
               public boolean onQueryTextChange(String newText) {
                    adapter.getFilter().filter(newText);
                    return false;
                }
            });
        Button buttonVoltar11 = findViewById(R.id.buttonVoltar11);
        buttonVoltar11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent( SearchViewActivity.this , MainActivity.class);
                startActivity(it);
            }
        });
        }
        private void inicializarVariaveis() {
            searchView = findViewById(R.id.searchView);
            listView = findViewById(R.id.listView);
        }
    }

package ifpe.com.br.exercicio_duplas.Native;


import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

public class ContatosActivity extends AppCompatActivity {

    ListView vl;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);

        vl = (ListView) findViewById(R.id.ListViewContatos);

        /*
        Button buttonContact = (Button) findViewById(R.id.buttonContact);

        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                get();
            }
        });*/
        Button buttonVoltar13 = (Button) findViewById(R.id.buttonVoltar13);

        buttonVoltar13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ContatosActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
    public void get(View v){
        Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null,null,null,null);
        startManagingCursor(cursor);

        String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER,
                ContactsContract.CommonDataKinds.Phone._ID};

        int[] to = {android.R.id.text1, android.R.id.text2};

        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, cursor, from, to);
        vl.setAdapter(simpleCursorAdapter);
        vl.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }

}

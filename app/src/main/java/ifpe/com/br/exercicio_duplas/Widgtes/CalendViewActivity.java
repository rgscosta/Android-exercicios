package ifpe.com.br.exercicio_duplas.Widgtes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

import ifpe.com.br.exercicio_duplas.MainActivity;
import ifpe.com.br.exercicio_duplas.R;

import static ifpe.com.br.exercicio_duplas.R.id.calendarView;

public class CalendViewActivity extends AppCompatActivity {


    private Calendar calender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calend_view);

        CalendarView calender = (CalendarView) findViewById(R.id.calendarView);
        calender.getDate();
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {
                String date = dayOfMonth + "/" + month +"/"+ year;
                Toast.makeText(getApplicationContext(),"Data" + date,Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonVoltar5 = (Button) findViewById(R.id.buttonVoltar5);
        buttonVoltar5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(CalendViewActivity.this, MainActivity.class);
                startActivity(it);
            }
        });
    }
}

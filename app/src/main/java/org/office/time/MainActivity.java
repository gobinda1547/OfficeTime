package org.office.time;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {
    private static final String DEBUG = "[MainActivity]";

    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(DEBUG, "onCreateCalled");


        datePicker = findViewById(R.id.date_picker);

    }

    public void dateSelectionFinal(View v){
        Log.d(DEBUG, "dateSelectionFinal");

        Log.d(DEBUG, String.valueOf(datePicker.getYear()));
        Log.d(DEBUG, String.valueOf(datePicker.getMonth()));
        Log.d(DEBUG, String.valueOf(datePicker.getDayOfMonth()));
    }

}

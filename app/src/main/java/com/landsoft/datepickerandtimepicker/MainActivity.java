package com.landsoft.datepickerandtimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.dp_date_picker);
        tp = findViewById(R.id.tp_time_picker);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        dp.init(year,month,day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this, "Ngày " + i2 + " tháng " + i1 + " năm " +i,Toast.LENGTH_LONG).show();
            }
        });

       int hour = calendar.get(Calendar.HOUR_OF_DAY);
       int minute = calendar.get(Calendar.MINUTE);
       int second = calendar.get(Calendar.SECOND);

       tp.setCurrentHour(hour);
       tp.setCurrentMinute(minute);
       tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
           @Override
           public void onTimeChanged(TimePicker timePicker, int i, int i1) {
               Toast.makeText(MainActivity.this, "Hour " +  i + " minute " +i1,Toast.LENGTH_LONG).show();
           }
       });
    }
}

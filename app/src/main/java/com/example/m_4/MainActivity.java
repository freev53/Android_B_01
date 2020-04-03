package com.example.m_4;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

import android.graphics.Color;
import android.os.Bundle;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class MainActivity extends AppCompatActivity {

    MaterialCalendarView MCview;
    OneDayDecorator odd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MCview = (MaterialCalendarView) findViewById(R.id.calendarView);

        Calendar calendar = Calendar.getInstance();
        MCview.setArrowColor(Color.BLUE);
        MCview.setSelectionColor(Color.parseColor("#292929"));
        MCview.setSelectedDate(calendar.getTime());


        CalendarDay day = CalendarDay.from(calendar);

    }
}

package com.example.timezoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class MainActivity extends AppCompatActivity {
    private TextView dateTimeDisplay;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
   private String date;
    private Button twelvehour;
    private Button twentyfourhour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateTimeDisplay = (TextView)findViewById(R.id.editText);
        TimeZone.setDefault(TimeZone.getTimeZone("Australia/Sydney"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);


        dateTimeDisplay = (TextView)findViewById(R.id.newyorktime);
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);


        dateTimeDisplay = (TextView)findViewById(R.id.losangelestime);
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);



        dateTimeDisplay = (TextView)findViewById(R.id.beijingtime);
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);



        dateTimeDisplay = (TextView)findViewById(R.id.moscowtime);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Moscow"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);



        dateTimeDisplay = (TextView)findViewById(R.id.londontime);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);


        twelvehour = (Button)findViewById(R.id.button2);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        dateTimeDisplay = (TextView)findViewById(R.id.editText);
        TimeZone.setDefault(TimeZone.getTimeZone("Australia/Sydney"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, HH:mm");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
            }});

        twelvehour = (Button)findViewById(R.id.button2ny);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        dateTimeDisplay = (TextView)findViewById(R.id.newyorktime);
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, HH:mm");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
            }});

        twelvehour = (Button)findViewById(R.id.button2los);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        dateTimeDisplay = (TextView)findViewById(R.id.losangelestime);
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, HH:mm");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
            }});

        twelvehour = (Button)findViewById(R.id.button2bei);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        dateTimeDisplay = (TextView)findViewById(R.id.beijingtime);
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, HH:mm");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);

            }});

        twelvehour = (Button)findViewById(R.id.button2mosc);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        dateTimeDisplay = (TextView)findViewById(R.id.moscowtime);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Moscow"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, HH:mm");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
            }});

        twelvehour = (Button)findViewById(R.id.button2lon);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        dateTimeDisplay = (TextView)findViewById(R.id.londontime);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("EEE, MMM d, HH:mm");
        date = dateFormat.format(calendar.getTime());
        dateTimeDisplay.setText(date);
            }});


        twelvehour = (Button)findViewById(R.id.button);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                dateTimeDisplay = (TextView)findViewById(R.id.editText);
                calendar = Calendar.getInstance();
                dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
                date = dateFormat.format(calendar.getTime());
                dateTimeDisplay.setText(date);
            }});
                twelvehour = (Button)findViewById(R.id.buttonny);
                twelvehour.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                dateTimeDisplay = (TextView)findViewById(R.id.newyorktime);
                TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
                calendar = Calendar.getInstance();
                dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
                date = dateFormat.format(calendar.getTime());
                dateTimeDisplay.setText(date);
                    }});

        twelvehour = (Button)findViewById(R.id.buttonlos);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dateTimeDisplay = (TextView)findViewById(R.id.losangelestime);
                TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
                calendar = Calendar.getInstance();
                dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
                date = dateFormat.format(calendar.getTime());
                dateTimeDisplay.setText(date);

            }});

        twelvehour = (Button)findViewById(R.id.buttonbei);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        dateTimeDisplay = (TextView)findViewById(R.id.beijingtime);
                TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
                calendar = Calendar.getInstance();
                dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
                date = dateFormat.format(calendar.getTime());
                dateTimeDisplay.setText(date);
            }});
                twelvehour = (Button)findViewById(R.id.buttonmosc);
                twelvehour.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                dateTimeDisplay = (TextView)findViewById(R.id.moscowtime);
                TimeZone.setDefault(TimeZone.getTimeZone("Europe/Moscow"));
                calendar = Calendar.getInstance();
                dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
                date = dateFormat.format(calendar.getTime());
                dateTimeDisplay.setText(date);
                    }});

        twelvehour = (Button)findViewById(R.id.buttonlon);
        twelvehour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateTimeDisplay = (TextView)findViewById(R.id.londontime);
                TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
                calendar = Calendar.getInstance();
                dateFormat = new SimpleDateFormat("EEE, MMM d, h:mm a");
                date = dateFormat.format(calendar.getTime());
                dateTimeDisplay.setText(date);

            }});  }}
package com.example.medhaparashar.vibgyor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.widget.TextView textView_violet = (android.widget.TextView) findViewById(R.id.violet);
        textView_violet.setOnClickListener(new android.view.View.OnClickListener() {
            // @Override
            public void onClick(android.view.View v) {
                android.widget.Toast.makeText(getApplicationContext(), "Clicked ON : VIOLET", android.widget.Toast.LENGTH_SHORT).show();
            }

        });

        android.widget.TextView textView_indigo = (android.widget.TextView) findViewById(R.id.indigo);
        textView_indigo.setOnClickListener(new android.view.View.OnClickListener()
        {
            // @Override
            public void onClick(android.view.View v)
            {
                android.widget.Toast.makeText(getApplicationContext(),"Clicked ON : INDIGO",android.widget.Toast.LENGTH_SHORT).show();
            }

        });

        android.widget.TextView textView_blue = (android.widget.TextView) findViewById(R.id.blue);
        textView_blue.setOnClickListener(new android.view.View.OnClickListener()
        {
            // @Override
            public void onClick(android.view.View v)
            {
                android.widget.Toast.makeText(getApplicationContext(),"Clicked ON :BLUE",android.widget.Toast.LENGTH_SHORT).show();
            }

        });

        android.widget.TextView textView_green = (android.widget.TextView) findViewById(R.id.green);
        textView_green.setOnClickListener(new android.view.View.OnClickListener()
        {
            // @Override
            public void onClick(android.view.View v)
            {
                android.widget.Toast.makeText(getApplicationContext(),"Clicked ON :GREEN",android.widget.Toast.LENGTH_SHORT).show();
            }

        });

        android.widget.TextView textView_yellow = (android.widget.TextView) findViewById(R.id.yellow);
        textView_yellow.setOnClickListener(new android.view.View.OnClickListener()
        {
            // @Override
            public void onClick(android.view.View v)
            {
                android.widget.Toast.makeText(getApplicationContext(),"Clicked ON :YELLOW",android.widget.Toast.LENGTH_SHORT).show();
            }

        });

        android.widget.TextView textView_orange = (android.widget.TextView) findViewById(R.id.orange);
        textView_orange.setOnClickListener(new android.view.View.OnClickListener()
        {
            // @Override
            public void onClick(android.view.View v)
            {
                android.widget.Toast.makeText(getApplicationContext(),"Clicked ON :ORANGE",android.widget.Toast.LENGTH_SHORT).show();
            }

        });

        android.widget.TextView textView_red = (android.widget.TextView) findViewById(R.id.red);
        textView_red.setOnClickListener(new android.view.View.OnClickListener()
        {
            // @Override
            public void onClick(android.view.View v)
            {
                android.widget.Toast.makeText(getApplicationContext(),"Clicked ON :RED",android.widget.Toast.LENGTH_SHORT).show();
            }

        });

    }
}

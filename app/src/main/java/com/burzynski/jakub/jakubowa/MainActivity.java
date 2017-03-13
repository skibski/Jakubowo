package com.burzynski.jakub.jakubowa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    button1 = (Button) findViewById(R.id.button1);
    button2 = (Button) findViewById(R.id.button2);
    button3 = (Button) findViewById(R.id.button3);
    button4 = (Button) findViewById(R.id.button4);


    button1.setOnClickListener(new View.OnClickListener()  {
            @Override
                    public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Okno1.class);
                startActivity(i);
                ffffgfgffgfgx

            }

        });
    button2.setOnClickListener(new View.OnClickListener()  {
            @Override
                    public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Okno2.class);
                startActivity(i);

            }

        });
    button3.setOnClickListener(new View.OnClickListener()  {
            @Override
                    public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Okno3.class);
                startActivity(i);

            }

        });
    button4.setOnClickListener(new View.OnClickListener()  {
            @Override
                    public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Okno4.class);
                startActivity(i);

            }

        });


    }







}

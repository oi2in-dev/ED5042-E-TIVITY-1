package com.example.ed5042_e_tivity_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonA = (Button) findViewById(R.id.About);
        Button buttonM = (Button) findViewById(R.id.Menu);



        buttonA.setOnClickListener(this);
        buttonM.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Menu:
                Intent menu = new Intent(getApplicationContext(), Menu.class);
                startActivity(menu);
                finish();
                break;

            case R.id.About:
                Intent About= new Intent(getApplicationContext(), About.class);
                startActivity(About);
                finish();
                break;
            default:
                break;
        }
    }
}
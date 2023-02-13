package com.example.ed5042_e_tivity_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button button10 = (Button)  findViewById(R.id.button10);

        button10.setOnClickListener(this);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button10:
                Intent AboutHome = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(AboutHome);
                finish();
                break;
        }
    }
}
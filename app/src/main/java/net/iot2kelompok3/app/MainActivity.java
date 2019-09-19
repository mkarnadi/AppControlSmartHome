package net.iot2kelompok3.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LED(View view) {
        Intent intent = new Intent(MainActivity.this, LedActivity.class);
        startActivity(intent);
    }

    public void FAN(View view) {
        Intent intent = new Intent(MainActivity.this, FanActivity.class);
        startActivity(intent);
    }

    public void NOTIF(View view) {
        Intent intent = new Intent(MainActivity.this, DoorActivity.class);
        startActivity(intent);
    }

    public void DATA(View view) {
        Intent intent = new Intent(MainActivity.this, DataActivity.class);
        startActivity(intent);
    }
}
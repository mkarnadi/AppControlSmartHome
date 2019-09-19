package net.iot2kelompok3.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;

public class ManualFanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_fan);
        Button btnLow = (Button)findViewById(R.id.btn_low);
        btnLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "LOW";
                sendData(data);
                Toast.makeText(ManualFanActivity.this, "terkirim", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnHigh = (Button)findViewById(R.id.btn_high);
        btnHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "HIGH";
                sendData(data);
                Toast.makeText(ManualFanActivity.this, "terkirim", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnOff = (Button)findViewById(R.id.btn_off);
        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "OFF";
                sendData(data);
                Toast.makeText(ManualFanActivity.this, "terkirim", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void sendData(String pesan) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("status_kipas");
        myRef.setValue(pesan);
    }
}

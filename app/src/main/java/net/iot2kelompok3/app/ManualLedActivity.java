package net.iot2kelompok3.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;


public class ManualLedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_led);
        Button btnOn = (Button)findViewById(R.id.btn_on);
        btnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "ON";
                sendData(data);
                Toast.makeText(ManualLedActivity.this, "terkirim", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnOff = (Button)findViewById(R.id.btn_off);
        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "OFF";
                sendData(data);
                Toast.makeText(ManualLedActivity.this, "terkirim", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void sendData(String pesan) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("status_led");
        myRef.setValue(pesan);
    }
}

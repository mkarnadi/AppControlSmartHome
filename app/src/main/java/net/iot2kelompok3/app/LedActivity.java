package net.iot2kelompok3.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led);
    }

    public void MANUALLED (View view) {
        String data = "manual";
        sendData(data);
        Toast.makeText(this, "LED Mode: Manual", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LedActivity.this, ManualLedActivity.class);
        startActivity(intent);
    }

    public void AUTO (View view){
        String data = "auto";
        sendData(data);
        Toast.makeText(this, "LED Mode: Auto", Toast.LENGTH_SHORT).show();
    }

    private void sendData(String pesan) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("control_led");
        myRef.setValue(pesan);
    }
}

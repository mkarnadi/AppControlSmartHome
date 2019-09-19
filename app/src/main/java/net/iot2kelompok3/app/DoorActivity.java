package net.iot2kelompok3.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DoorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);
        String data = "manual";
        sendDataControl(data);
        Toast.makeText(this, "kontrol pintu manual", Toast.LENGTH_SHORT).show();
    }

    public void OPENDOOR (View view) {
        String data = "buka";
        sendData(data);
        Toast.makeText(this, "Pintu Terbuka", Toast.LENGTH_SHORT).show();
    }

    public void COLSEDOOR (View view){
        String data = "tutup";
        sendData(data);
        Toast.makeText(this, "Pintu Tertutup", Toast.LENGTH_SHORT).show();
    }

    private void sendData(String pesan) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("status_servo");
        myRef.setValue(pesan);
    }

    private void sendDataControl(String pesan){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("control_servo");
        myRef.setValue(pesan);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        String data = "auto";
        sendDataControl(data);
        Toast.makeText(this, "kontrol pintu auto", Toast.LENGTH_SHORT).show();
    }
}

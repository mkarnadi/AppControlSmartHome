package net.iot2kelompok3.app;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DataActivity extends AppCompatActivity {

    //Deklarasi Variable
    private TextView GetLed, GetSuhu, GetFan, GetFlame, GetLDR, GetBuzzer;
    private FirebaseAuth auth;
    private FirebaseDatabase getDatabase;
    private DatabaseReference getRefenence;
    private String GetUserID;
    private FirebaseDatabase database;
    private DatabaseReference getSuhu;
    private DatabaseReference getLDR;
    private DatabaseReference getFlame;
    private DatabaseReference getKipas;
    private DatabaseReference getLed;
    private DatabaseReference getBuzzer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        getSupportActionBar().setTitle("Halaman Data");
        GetLed = findViewById(R.id.getled);
        GetSuhu = findViewById(R.id.getsuhu);
        GetFan = findViewById(R.id.getfan);
        GetFlame = findViewById(R.id.getflame);
        GetLDR = findViewById(R.id.getLDR);
        GetBuzzer = findViewById(R.id.getBuzzer);

        database = FirebaseDatabase.getInstance();

        getSuhu = database.getReference("status_suhu");
        getSuhu.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String suhu = dataSnapshot.getValue(String.class);
                GetSuhu.setText(suhu);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(DataActivity.this, "gagal membaca data!", Toast.LENGTH_SHORT).show();
            }
        });


        getFlame = database.getReference("status_flame");
        getFlame.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String suhu = dataSnapshot.getValue(String.class);
                GetFlame.setText(suhu);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(DataActivity.this, "gagal membaca data!", Toast.LENGTH_SHORT).show();
            }
        });

        getLDR = database.getReference("status_ldr");
        getLDR.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String suhu = dataSnapshot.getValue(String.class);
                GetLDR.setText(suhu);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(DataActivity.this, "gagal membaca data!", Toast.LENGTH_SHORT).show();
            }
        });

        getBuzzer = database.getReference("status_buzzer");
        getBuzzer.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String suhu = dataSnapshot.getValue(String.class);
                GetBuzzer.setText(suhu);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(DataActivity.this, "gagal membaca data!", Toast.LENGTH_SHORT).show();
            }
        });

        getLed = database.getReference("status_led");
        getLed.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String suhu = dataSnapshot.getValue(String.class);
                GetLed.setText(suhu);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(DataActivity.this, "gagal membaca data!", Toast.LENGTH_SHORT).show();
            }
        });

        getKipas = database.getReference("status_kipas");
        getKipas.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String suhu = dataSnapshot.getValue(String.class);
                GetFan.setText(suhu);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(DataActivity.this, "gagal membaca data!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
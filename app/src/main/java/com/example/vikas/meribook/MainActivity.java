package com.example.vikas.meribook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private FirebaseApp mApp;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);

        mApp = FirebaseApp.getInstance();

        db = FirebaseFirestore.getInstance();
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("Name","Poloman");
        db.collection("users").document("Polo").set(map);

    }
}

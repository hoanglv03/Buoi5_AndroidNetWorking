package com.example.buoi5_androidnetworking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvAlbum;
    BackgroundGET backgroundGET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAlbum = findViewById(R.id.lvAlbum);
        backgroundGET = new BackgroundGET(lvAlbum,this);
        backgroundGET.execute();
    }
}
package com.example.universemouth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mToolbar = findViewById(R.id.main_app_bar);
    setSupportActionBar(mToolbar);
    getSupportActionBar().setTitle("WhatsApp");
    }
}

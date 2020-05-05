package com.example.makeyouradventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent= getIntent();
        String name =intent.getStringExtra("name");

        Toast.makeText(this, name, Toast.LENGTH_LONG).show();

    }
}

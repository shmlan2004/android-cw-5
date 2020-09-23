package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView n = findViewById(R.id.textView);
        final TextView r = findViewById(R.id.textView2);

        Bundle k = getIntent().getExtras();
       String sham = k.getString("licen");
        String sham1 = k.getString("licen1");

        n.setText(sham);
        r.setText(sham1);

    }
}
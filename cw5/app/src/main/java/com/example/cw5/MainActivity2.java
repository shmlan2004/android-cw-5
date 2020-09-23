package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button z = findViewById(R.id.back);
        final TextView n = findViewById(R.id.textView);
        final TextView r = findViewById(R.id.textView2);

        Bundle k = getIntent().getExtras();
       String sham = k.getString("licen");
        String sham1 = k.getString("licen1");

        n.setText(sham);
        r.setText(sham1);

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity2.this , MainActivity.class);

                startActivity(a);
            }
        });
    }
}
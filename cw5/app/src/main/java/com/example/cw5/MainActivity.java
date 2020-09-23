package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button z = findViewById(R.id.nextPage);
        final EditText n = findViewById(R.id.name);
        final EditText r = findViewById(R.id.age);

          z.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent a = new Intent(MainActivity.this , MainActivity2.class);
                  a.putExtra("licen",n.getText().toString() );
                  a.putExtra("licen1",r.getText().toString() );
                  startActivity(a);
              }
          });
    }
}
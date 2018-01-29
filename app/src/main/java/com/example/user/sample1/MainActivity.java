package com.example.user.sample1;

import android.graphics.drawable.LevelListDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView)findViewById(R.id.cellular);
        Button minus = (Button)findViewById(R.id.minus);
        Button plus = (Button)findViewById(R.id.plus);

       minus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (count <= 0){
                   Toast.makeText(MainActivity.this,"Baterai Low", Toast.LENGTH_LONG).show();
                   imageView.setImageLevel(0);
               } else {
                   count--;
                   imageView.setImageLevel(count);
               }
           }
       });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count >= 6){
                    Toast.makeText(MainActivity.this,"Baterai Sudah Full", Toast.LENGTH_LONG).show();
                    imageView.setImageLevel(6);
                } else {
                    count++;
                    imageView.setImageLevel(count);
                }

            }
        });

    }
}

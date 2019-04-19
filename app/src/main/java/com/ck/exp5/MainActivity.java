package com.ck.exp5;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button Red,Green,Blue;
    RelativeLayout Relative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Red = findViewById(R.id.button1);
        Green = findViewById(R.id.button2);
        Blue = findViewById(R.id.button3);
        Relative = findViewById(R.id.Relative);

      final Drawable dr1 = getResources().getDrawable(R.drawable.ic_launcher_background);
        dr1.setColorFilter(Color.parseColor("#FF0000"), PorterDuff.Mode.SRC_ATOP);

        final Drawable dr2 = getResources().getDrawable(R.drawable.ic_launcher_background);
        dr2.setColorFilter(Color.parseColor("#008000"), PorterDuff.Mode.SRC_ATOP);

        final Drawable dr3 = getResources().getDrawable(R.drawable.ic_launcher_background);
        dr3.setColorFilter(Color.parseColor("#000080"), PorterDuff.Mode.SRC_ATOP);

        Red.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Relative.setBackground(dr1);
            }
        });


        Green.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Relative.setBackground(dr2);
            }
        });


        Blue.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Relative.setBackground(dr3);
            }
        });
    }
}

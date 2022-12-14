package com.example.flashlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private  FlashClass flashClass;
    private ImageView imageViewFlashOn;
    private ImageView imageViewFlashOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flashClass = new FlashClass(this);
        imageViewFlashOn = findViewById(R.id.imageFlashOn);
        imageViewFlashOff = findViewById(R.id.imageFlashOf);

        imageViewFlashOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flashClass.isStatus()) {
                    flashClass.FlashOff();
                    imageViewFlashOn.setVisibility(View.VISIBLE);
                    imageViewFlashOff.setVisibility(View.INVISIBLE);
                } else if (!flashClass.isStatus()) {
                    flashClass.FlashOn();
                    imageViewFlashOff.setVisibility(View.VISIBLE);
                    imageViewFlashOn.setVisibility(View.INVISIBLE);
                }
            }
        });

        imageViewFlashOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flashClass.isStatus()) {
                    flashClass.FlashOff();
                    imageViewFlashOn.setVisibility(View.VISIBLE);
                    imageViewFlashOff.setVisibility(View.INVISIBLE);
                } else if (!flashClass.isStatus()) {
                    flashClass.FlashOn();
                    imageViewFlashOff.setVisibility(View.VISIBLE);
                    imageViewFlashOn.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

}
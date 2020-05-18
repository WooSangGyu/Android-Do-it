package com.example.androiddoit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class UpdownImage extends AppCompatActivity {

    ScrollView scrollView;
    ImageView imageView, imageView2;
    BitmapDrawable bitmap;

    int IndexCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updown_image);

        scrollView = findViewById(R.id.Scroll1);
        imageView = findViewById(R.id.image1);
        imageView2 = findViewById(R.id.image2);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.p6);
        int bitwi = bitmap.getIntrinsicWidth();
        int bithe = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitwi;
        imageView.getLayoutParams().height = bithe;
    }

    public void updown(View v) {
        UpandDown();
    }

    private void UpandDown(){
        if (IndexCode == 0){
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.p6);
            int bitwi = bitmap.getIntrinsicWidth();
            int bithe = bitmap.getIntrinsicHeight();

            imageView2.setImageDrawable(bitmap);
            imageView2.getLayoutParams().width = bitwi;
            imageView2.getLayoutParams().height = bithe;

            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            IndexCode = 1;
        } else {
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.p6);
            int bitwi = bitmap.getIntrinsicWidth();
            int bithe = bitmap.getIntrinsicHeight();

            imageView.setImageDrawable(bitmap);
            imageView.getLayoutParams().width = bitwi;
            imageView.getLayoutParams().height = bithe;

            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            IndexCode = 0;
        }
    }

    public void next(View v){
        nextActivity();
    }

    private void nextActivity(){
        Intent intent = new Intent(UpdownImage.this, CountingNumber.class);
        startActivity(intent);
    }
}

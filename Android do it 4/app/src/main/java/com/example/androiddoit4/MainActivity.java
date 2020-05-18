package com.example.androiddoit4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.Scroll);
        imageView = findViewById(R.id.picture);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap =(BitmapDrawable) res.getDrawable(R.drawable.p6);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

    public void ch(View v){
        changeImage();
    }

    private void changeImage(){
        Resources res = getResources();
        bitmap =(BitmapDrawable) res.getDrawable(R.drawable.p8);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

    public void  nextAc(View v){
        nextActivity();
    }

    private void nextActivity(){
        Intent intent = new Intent(MainActivity.this, UpdownImage.class);
        startActivity(intent);
    }
}

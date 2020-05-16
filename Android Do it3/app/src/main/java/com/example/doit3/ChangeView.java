package com.example.doit3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChangeView extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_view);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
    }

    public void onButtonClicked(View v){
        changeImage();
    }

    private void changeImage() {
        if(imageIndex == 0) {
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        } else if (imageIndex == 1){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);

            imageIndex = 2;
        } else{
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);

            imageIndex = 0;
        }
    }
}

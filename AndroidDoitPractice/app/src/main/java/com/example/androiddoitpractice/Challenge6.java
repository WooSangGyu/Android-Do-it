package com.example.androiddoitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class Challenge6 extends AppCompatActivity {

    SeekBar seekBar;
    TextView showper;
    public int number = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge6);

        seekBar = findViewById(R.id.seekBar);
        showper = findViewById(R.id.percentView);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //Seekbar의 상태(정도)가 변경되었을 때 실행될 사항
                number = seekBar.getProgress();
                update();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Seekbar의 움직임이 시작될 때 실행될 사항
                number = seekBar.getProgress();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Seekabar의 움직임이 멈춘다면 실행될 함수
                number = seekBar.getProgress();
            }
        });
    }
    public void update() {
        showper.setText(new StringBuilder().append(number)); // seekbar의 값에 따라 percentView 값 변경시키기

        ProgressBar progressBar = findViewById(R.id.progressBar2); // Progressbar 객체 참조 시키기
        progressBar.setProgress(number); // number 값에 맞춰서 Progressbar 값 변경시켜주기
    }
}

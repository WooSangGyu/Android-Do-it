package com.example.androiddoitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Progressbar extends AppCompatActivity {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);

        ProgressBar progressBar = findViewById(R.id.progressBar); // progressbar 객체 참조 설정
        progressBar.setIndeterminate(false);
        progressBar.setProgress(80);

        Button pro_show = findViewById(R.id.proshow);
        pro_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new ProgressDialog(Progressbar.this); // progress 대화상자 객체 만들고 설정하기
                dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // SPINNER 는 멈추지 않는 프로그레스바 , HORIZONTAL는 0/100으로 표시
                dialog.setMessage("데이터를 확인하는 중입니다.");

                dialog.show();
            }
        });

        Button pro_exit = findViewById(R.id.proexit);
        pro_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dialog != null) {      // progress 대화상자 닫기
                    dialog.dismiss();
                }
            }
        });
    }
}

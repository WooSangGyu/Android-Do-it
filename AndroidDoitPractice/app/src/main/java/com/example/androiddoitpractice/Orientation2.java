package com.example.androiddoitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class Orientation2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation2);
    }

    @Override
    protected void onStart() { //액티비티가 화면에 보이기 전 호출 즉, 실행할 때
        super.onStart();

        showToast("onStart 호출됨");
    }

    @Override
    protected void onStop() { // 액티비티가 보이다가 사라질 때 즉, 종료할때 호출
        super.onStop();

        showToast("onStop 호출됨");
    }

    @Override
    protected void onDestroy() { //메모리에서 아예 지워질 때 호출
        super.onDestroy();

        showToast("onDestroy 호출됨");
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            showToast("방향 : ORIENTATION_LANDSCAPE");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            showToast("방향 : ORIENTATION_PORTRAIT");
        }
    }

    public void showToast(String data){
        Toast.makeText(this,data,Toast.LENGTH_LONG).show();
    }
}

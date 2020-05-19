package com.example.androiddoitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Orientation extends AppCompatActivity {

    String name;

    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //메모리 할당
        setContentView(R.layout.activity_orientation);

        showToast("onCreate 호출됨.");

        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();   // 버튼 클릭 시 name에 변수 값 할당
                showToast("입력된 값을 변수에 저장했습니다 : " + name);
            }
        });

        if (savedInstanceState != null){ //화면이 초기화 될 때 name 변수의 값을 복원
            name = savedInstanceState.getString("name");
            showToast("값을 복원했습니다 : " + name);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("name", name); //변수의 값 저장
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

    public void showToast(String data){
        Toast.makeText(this,data,Toast.LENGTH_LONG).show();
    }
}

package com.example.androiddoit4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CountingNumber extends AppCompatActivity {

    EditText ed;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting_number);

        ed = findViewById(R.id.edit); //edit 텍스트 매칭
        tv = findViewById(R.id.number); //edit 텍스트 매칭

        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String num = ed.getText().toString();
                tv.setText(num.length()+" / 80 글자 수");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void SendButton(View v){ //SendButton 함수 설정
        send();
    }

    private void send() { //send 함수 설정
        String editmessage = ed.getText().toString();
        Toast.makeText(CountingNumber.this,editmessage,Toast.LENGTH_SHORT).show();


    }
}

package com.example.androiddoitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.androiddoitpractice.R.id.text;

public class ToastMessage extends AppCompatActivity {

    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toastmessage);

        editText = findViewById(R.id.editText3);
        editText2 = findViewById(R.id.editText4);
    }

    public void onButtonClick(View v) {
        try {
            Toast toastView = Toast.makeText(this, "위치가 바뀐 토스트 메시지 입니다.", Toast.LENGTH_LONG);

            int xOffset = Integer.parseInt(editText.getText().toString());
            int yOffset = Integer.parseInt(editText2.getText().toString());

            toastView.setGravity(Gravity.CENTER|Gravity.TOP, xOffset, yOffset); // Gravity.? | Gravity ?? , x값, y값 == ?+x, ??+y 의 좌표에 토스트띄움
            toastView.show();
        } catch ( NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void onButtonClick2(View v) {
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(
                R.layout.toastborder,
                (ViewGroup) findViewById(R.id.toast_layout_root));
        TextView text = layout.findViewById(R.id.text);

        Toast toast = new Toast(this); //토스트 객체 생성
        text.setText("모양 바꾼 토스트");
        toast.setGravity(Gravity.CENTER, 0, -100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout); //토스트가 보이는 뷰 설정
        toast.show();
    }
}

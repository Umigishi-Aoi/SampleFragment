package com.zerokaraapp.samplefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //レイアウトからボタンを取得
        Button button = findViewById(R.id.button2);
        //ボタンにリスナオブジェクトを設定
        button.setOnClickListener(new ButtonClickListener2());
    }

    //ボタンを押したとき動くリスナクラスを定義
    private class ButtonClickListener2 implements View

            .OnClickListener{
        @Override
        public void onClick(View view){
            //画面を終了、画面1へ移動
            finish();
        }
    }
}
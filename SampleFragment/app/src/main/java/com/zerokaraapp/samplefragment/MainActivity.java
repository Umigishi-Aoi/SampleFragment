package com.zerokaraapp.samplefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //レイアウトからボタンを取得
        Button button = findViewById(R.id.button);
        //ボタンにリスナオブジェクトを設定
        button.setOnClickListener(new ButtonClickListener());
    }

    //ボタンを押したとき動くリスナクラスを定義
    private class ButtonClickListener implements View

            .OnClickListener{
        @Override
        public void onClick(View view){
            //画面2移動用のIntentを取得
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            //画面2へ移動
            startActivity(intent);
        }
    }
}
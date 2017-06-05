package kr.iuu.mission6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onButton1Click(View v){
        Intent intent = new Intent();
        intent.putExtra("menu", "고객관리");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void onButton2Click(View v){
        Intent intent = new Intent();
        intent.putExtra("menu", "매출관리");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void onButton3Click(View v){
        Intent intent = new Intent();
        intent.putExtra("menu", "상품관리");
        setResult(RESULT_OK, intent);
        finish();
    }

}

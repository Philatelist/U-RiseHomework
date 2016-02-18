package com.slavyanin.example.u_risehomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView countText;
    private Button countButton;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        TextView textView = (TextView) findViewById(R.id.textCount);
        textView.setText("Count " + count++);
    }

//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        countButton = (Button) findViewById(R.id.button);
//        countText = (TextView) findViewById(R.id.textCount);
//
//        countButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                countText.setText("Count - " + ++count);
//            }
//        });
//    }


}

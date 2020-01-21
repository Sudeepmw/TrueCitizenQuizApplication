package com.bawp.truecitizenquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button falsebutton;
    private Button truebutton;
    private TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        falsebutton = findViewById(R.id.false_button);
        truebutton = findViewById(R.id.true_button);
        question = findViewById(R.id.Answer_text_view);

        falsebutton.setOnClickListener(this);
        truebutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.false_button:
                Toast.makeText(MainActivity.this,"false",Toast.LENGTH_SHORT).show();
                break;
            case R.id.true_button:
                Toast.makeText(MainActivity.this,"True",Toast.LENGTH_SHORT).show();

        }



    }
}

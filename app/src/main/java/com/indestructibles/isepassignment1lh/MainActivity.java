package com.indestructibles.isepassignment1lh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.buttonConfirm);
        mEditText = findViewById(R.id.editText);
        mTextView = findViewById(R.id.textView);

    }

    public void buttonConfirmed(View v){
        TextView text = findViewById(R.id.textView);
        text.setText(mEditText.getText().toString());
    }


    public void buttonColored(View view) {
        Random rand = new Random();
        mTextView.setTextColor(Color.rgb(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
    }

    public void buttonSized(View view) {
        Random rand = new Random();
        mTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,rand.nextInt(25)+10);
    }
}
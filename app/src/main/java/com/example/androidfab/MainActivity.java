package com.example.androidfab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton mMainAddFab;
    private FloatingActionButton mAddUserFab;
    private FloatingActionButton mAddContactFab;
    private TextView mAddUserText, mAddContactText;
    private boolean isOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mMainAddFab = findViewById(R.id.floatingActionButton3);
        mAddUserFab = findViewById(R.id.floatingActionButton);
        mAddContactFab = findViewById(R.id.floatingActionButton2);

        mAddUserText = findViewById(R.id.textView);
        mAddContactText = findViewById(R.id.textView2);

        isOpen = false;
        mMainAddFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isOpen){
                    isOpen = false;
                }else {
                    isOpen = true;
                }
            }
        });
    }
}
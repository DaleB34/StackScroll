package com.example.stackscroll;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = findViewById(R.id.stackedList);

        //initialize a stack with a few elements in it
        StackList stack = new StackList();

        for(int i = 0; i< 61; i++)
        {
            //0 will be the head, or the bottom, and 60 will be the top, or the tail
            stack.addTailNode(i);
        }

        //fill the scrollview/linear layout with elements from stack
        stack.fillLayout(ll);



    }
}
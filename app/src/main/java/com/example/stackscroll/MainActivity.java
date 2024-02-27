package com.example.stackscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Node;

public class MainActivity extends AppCompatActivity {

    LinearLayout displayLayout = (LinearLayout)findViewById(R.id.stackedList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialize a list with a few elements in it
        //when adding or deleting an element, refresh the list
        //to display/refresh the list, go through every node, and for each one, add a new TextView to the scrollview
        StackList stack = new StackList();
        stack.addTailNode(0);
        stack.addTailNode(1);
        stack.addTailNode(2);
        stack.addTailNode(3);
        stack.addTailNode(4);
        stack.showList();

        TextView context = new TextView(this);
        stack.fillLayout(displayLayout, context.getContext());

    }
}
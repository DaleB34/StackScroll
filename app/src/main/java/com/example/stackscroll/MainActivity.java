package com.example.stackscroll;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Node;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = findViewById(R.id.stackedList);

        //initialize a list with a few elements in it
        //when adding or deleting an element, refresh the list
        //to display/refresh the list, go through every node, and for each one, add a new TextView to the scrollview
        StackList stack = new StackList();
        stack.addTailNode(0);
        stack.addTailNode(1);
        stack.addTailNode(2);
        stack.addTailNode(3);
        stack.addTailNode(4);


        System.out.println(stack.makeSet());
        int[] booch = stack.makeSet();

        String blah = "";
        for(int n: booch)
        {
            blah+= n+"";
        }

        TextView tv = new TextView(this);
            tv.setText(blah);
            ll.addView(tv);
//        while( != null)
//        {
//            TextView tv = new TextView(this);
//            tv.setText("asdf");
//            ll.addView(tv);
//
//
//        }


    }
}
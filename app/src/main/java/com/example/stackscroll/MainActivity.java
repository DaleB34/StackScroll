package com.example.stackscroll;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Node;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout displayLayout = findViewById(R.id.stackedList);

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

        ViewGroup viewLayout = (ViewGroup) findViewById(R.id.stackedList);
        View last = viewLayout.getChildAt(viewLayout.getChildCount() - 1);

        TextView tv = (TextView)
                LayoutInflater.from(getContext()).inflate(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, null);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        int id = 125;
        if (last != null) {
            params.addRule(LinearLayout, last.getId());
            id = last.getId() + 125;
        }
        tv.setLayoutParams(params);
        tv.setId(id);
        viewLayout.addView(tv);


//        StackList.Node n = stack.getTailNode();
//        while(n != null)
//        {
//            TextView tv = new TextView(this);
//            tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//            tv.setText(n.getData());
//            displayLayout.addView(tv);
//            n= n.getLink();
//        }


    }
}
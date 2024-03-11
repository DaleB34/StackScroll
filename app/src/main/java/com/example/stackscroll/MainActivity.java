package com.example.stackscroll;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Node;
import org.w3c.dom.Text;

import java.security.AccessController;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = findViewById(R.id.stackedList);
        TextView input = findViewById(R.id.addText);
        Button addBtn = findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                TextView tv = new TextView(ll.getContext());
                tv.setText(input.getText());
                input.setText("");
                tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25f);
                ll.addView(tv);
            }

        });

        //initialize a stack with a few elements in it
        StackList stack = new StackList();
        stack.addTailNode(0);//head
        stack.addTailNode(1);
        stack.addTailNode(2);
        stack.addTailNode(3);
        stack.addTailNode(4);//tail

        //fill the scrollview/linear layout with elements from stack
        stack.fillLayout(ll);



    }
}
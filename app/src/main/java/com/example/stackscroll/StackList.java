package com.example.stackscroll;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StackList
{
    private Node head;
    private Node tail;

    public StackList()
    {
        head = null;
        tail = null;
    }

    public void addTailNode(int addData)
    {
        if(tail == null)
        {
            tail = new Node(addData, null); //in the case of an empty list
            head = tail;
        }
        else {
            tail = new Node(addData, tail);
        }
    }

    public void deleteTailNode()
    {
        Node position = tail;
        if(length() == 0)
        {
            System.out.println("Deleting from empty list");
            System.exit(0);
        }
        else
        {
            tail = tail.getLink();
        }
    }


    public boolean hasNext()
    {
        Node position = tail;
        if (position.getLink() != null)
            return true;
        return false;
    }

    public int length()
    {
        int count = 0;
        Node position = tail;
        while (position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    public void showList()
    {
        Node position = tail;
        while (position != null)
        {
            System.out.println(position.getData() + " ");
            position = position.getLink();
        }
        System.out.println();
    }

    public int getHeadData()
    {
        return head.getData();
    }

    public int getTailData()
    {
        return tail.getData();
    }

    public Node getTailNode(){
        return tail;
    }

    public Node getNext(Node n){
        return n.getLink();
    }

    public int getThisData(Node n ){
        return n.getData();
    }





    private class Node
    {

        private int data;
        private Node link;

        public Node (int data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        public int getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }
        public void setLink(Node next)
        {
            this.link = next;
        }

        public String toString()
        {
            return "data:" + data + " links to " + link;
        }


    }//end of Node

}//end of DioList
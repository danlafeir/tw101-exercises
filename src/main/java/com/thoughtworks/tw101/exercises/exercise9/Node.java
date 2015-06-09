package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    Node leftNode;
    Node rightNode;

    public Node(String name) {
        this.name = name;
        leftNode = null;
        rightNode = null;
    }

    public void add(String nameOfNewNode) {
        if(name.compareTo(nameOfNewNode) > 0){
            if(leftNode == null){
                leftNode = new Node(nameOfNewNode);
            }
            else{
                leftNode.add(nameOfNewNode);
            }
        }
        else{
            if(rightNode == null){
                rightNode = new Node(nameOfNewNode);
            }
            else{
                rightNode.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        if(rightNode == null && leftNode == null){
            ArrayList<String> newList = new ArrayList<>(1);
            newList.add(name);
            return newList;
        }
        else {
            List<String> templeft = new ArrayList<>();
            List<String> tempRight = new ArrayList<>();
            if(leftNode != null) {
                templeft = leftNode.names();
            }
            if(rightNode != null){
                tempRight = rightNode.names();
            }
            templeft.add(name);
            templeft.addAll(tempRight);
            return templeft;
        }
    }
}

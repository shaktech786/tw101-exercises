package com.thoughtworks.tw101.exercises.exercise9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Node {
    private Node right, left;
    private String name;
    private List<String> namesList;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
        namesList = new ArrayList<>();
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 1) {
            if (this.left == null) {
                this.left = new Node(nameOfNewNode);
                return;
            } else {
                this.left.add(nameOfNewNode);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(nameOfNewNode);
                return;
            } else {
                this.right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        inOrderTraversal(this);
        return namesList;
    }

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            namesList.add(root.name);
            inOrderTraversal(root.right);
        }
    }
}

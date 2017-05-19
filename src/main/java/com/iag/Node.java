package com.iag;

import java.util.List;

/**
 * Created by xueshan.wei on 5/19/2017.
 */
public class Node {
    private String id;
    private String name;
    private String value;
    private String parentId;
    private List<Node> children;

    public Node() {
    }

    public Node(String id, String name, String value, String parentId) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", parentId='" + parentId + '\'' +
                ", children=" + children +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}

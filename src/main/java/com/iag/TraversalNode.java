package com.iag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xueshan.wei on 5/19/2017.
 */
public class TraversalNode {
    private List<Node> nodes = new ArrayList<Node>();
    public List<Node> traversal(Node node){
        visit(node);
        return nodes;
    }

    private void visit(Node node){
        if(node != null){
            nodes.add(new Node(node.getId(), node.getName(), node.getValue(), node.getParentId()));
            if(node.getChildren() != null && node.getChildren().size() > 0){
                for(Node temp : node.getChildren()){
                    visit(temp);
                }
            }
        }
    }
}

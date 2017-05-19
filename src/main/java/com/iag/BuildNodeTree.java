package com.iag;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xueshan.wei on 5/19/2017.
 */
public class BuildNodeTree {
    private Node root;

    public BuildNodeTree(String rootNodeId) {
        root = new Node(rootNodeId, "树根", "treeroot", "none");
    }

    public Node build(List<Node> nodes) throws Exception{

        if(nodes != null && nodes.size() > 0){
            while (nodes.size() >0){
                List<Node> noFathers = new ArrayList<Node>();

                for(Node temp : nodes){
                    if(lookupFather(root, temp)){
                        System.out.println("找到爸爸了");
                    }else {
                        System.out.println("没找到爸爸");
                        noFathers.add(temp);
                    }
                }
                nodes = noFathers;
            }
            return root;
        }
        throw new Exception("节点列表不能为空");
    }
    private boolean lookupFather(Node father, Node children){
        if(father != null){
            if(father.getId().equals(children.getParentId())){
                father.getChildren().add(children);
                return true;
            }
            if(father.getChildren() != null && father.getChildren().size() > 0){
                for(Node temp : father.getChildren()){
                    if(lookupFather(temp, children)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

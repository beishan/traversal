package com.iag;

import com.google.gson.Gson;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            String str = ReadText.readTextToString("src/source.text");
            Gson gson = new Gson();
            Node node = gson.fromJson(str, Node.class);
            System.out.println(node);

            TraversalNode traversalNode = new TraversalNode();

            List<Node> nodes =  traversalNode.traversal(node);
            if(nodes != null){
                for(Node temp : nodes){
                    System.out.println(temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

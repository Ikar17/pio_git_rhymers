package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.Node;
import org.junit.Assert;
import org.junit.Test;
public class NodeTest {

    @Test
    public void testNode(){
        int value = 4;
        Node node = new Node(value);
        Assert.assertEquals(node.value, value);
    }

}
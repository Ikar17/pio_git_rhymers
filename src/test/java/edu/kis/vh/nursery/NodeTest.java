package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.Node;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

    @Test
    public void testGetValue() {
        int value = 4;
        Node node = new Node(value);
        int result = node.getValue();
        Assert.assertEquals(value, result);
    }
}
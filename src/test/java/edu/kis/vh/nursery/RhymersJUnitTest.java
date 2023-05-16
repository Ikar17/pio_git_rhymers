package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheckWhenIsEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testCallCheckWhenIsNotEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        rhymer.countIn(888);

        boolean result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekabooWhenIsEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testPeekabooWhenIsNotEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOutWhenIsEmpty() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}

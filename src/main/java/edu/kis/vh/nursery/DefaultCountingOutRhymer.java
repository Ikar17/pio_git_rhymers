package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE_TABLE = 12;
    private static final int SIZE_FULL = SIZE_TABLE-1;
    private static final int EMPTY = -1;
    private static final int IF_EMPTY =-1;

    private final int[] numbers = new int[SIZE_TABLE];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IF_EMPTY;
    }

    public boolean isFull() {
        return total == SIZE_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}

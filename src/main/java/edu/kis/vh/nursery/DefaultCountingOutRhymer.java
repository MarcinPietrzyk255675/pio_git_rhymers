package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int EMPTY = -1;
    private final int CAPACITY = 12;
    private final int DEFAULT_VALUE = -1;


    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}

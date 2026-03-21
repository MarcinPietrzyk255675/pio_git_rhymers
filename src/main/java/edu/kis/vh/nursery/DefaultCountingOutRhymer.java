package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int ERROR = -1;
    private final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];

    public int total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}

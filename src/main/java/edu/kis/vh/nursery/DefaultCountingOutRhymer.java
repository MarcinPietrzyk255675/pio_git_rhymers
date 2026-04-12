package edu.kis.vh.nursery;

/**
 * Klasa implementująca interfejs stosu na potrzeby klas FIFORhymer oraz HanoiRhymer
 */
public class DefaultCountingOutRhymer {

    private final int EMPTY = -1;
    private final int CAPACITY = 12;
    private final int DEFAULT_VALUE = -1;
    // TODO: Rozważyć użycie wyjątków zamiast zwracania -1


    private final int[] numbers = new int[CAPACITY];

    /**
     * Funkcja zwracająca ilość liczb w tablicy numbers.
     * @return ilość liczb w tablicy numbers
     */
    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    /**
     * Funkcja dodająca wartość do tablicy numbers.
     * @param in wartość dodawana w tablicy
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Funkcja sprawdzająca, czy tablica numbers jest pusta.
     * @return true jeśli tablica numbers jest pusta, false w przeciwnym wypadku
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Funkcja sprawdzająca czy tablica numbers jest pełna.
     * @return true jeśli tablica numbers jest pełna, false w przeciwnym wypadku
     */
    public boolean isFull() {
        return total == CAPACITY-1;
    }

    /**
     * Funkcja sprawdzająca ostatnio dodaną wartość do tablicy numbers.
     * @return ostatnio dodana wartość z tablicy numbers
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Funkcja zdejmująca ostatnio dodaną wartość do tablicy numbers.
     * @return ostatnio dodana wartość do tablicy numbers
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}

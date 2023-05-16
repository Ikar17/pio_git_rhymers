package edu.kis.vh.nursery;

/**
 * Klasa pozwala wstawiać oraz pobierać liczby z tablicy wartości(liczb) zgodnie z kolejką LIFO
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int IF_EMPTY =-1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    /**
     * Metoda dodaje wartość przekazaną jako parametr do tablicy wartości.
     * @param in jest liczbą dodawaną do tablicy wartości
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Metoda sprawdza czy tablica wartości jest pusta.
     * @return true jeżeli tablica jest pusta, w przeciwnym wypadku false
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Metoda sprawdza czy tablica wartości jest pełna.
     * @return true jeżeli tablica jest pełna, w przeciwnym wypadku false
     */
    public boolean isFull() {
        return total == CAPACITY-1;
    }

    /**
     *Metoda zwraca ostatnią dodaną wartość do tablicy wartości.
     *@return ostatnią dodaną wartość do tablicy wartości, a jeżeli jest pusta zwraca -1
     */
    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    /**
     *Metoda zwraca ostatnią dodaną wartość do tablicy wartości i usuwą ją z tej tablicy.
     *@return ostatnią dodaną wartość do tablicy wartości i usuwą ją z tej tablicy, a jeżeli jest pusta zwraca -1
     */
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}

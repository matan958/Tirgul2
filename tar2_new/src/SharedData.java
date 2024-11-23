/**
 * The {@code SharedData} class serves as a shared resource for managing
 * data between threads. It stores an integer array, a win array, a target sum,
 * and a flag to indicate whether a desired result has been found.
 */
public class SharedData {

    /** The array of integers used in the computation. */
    private int[] array;

    /** A boolean array indicating the elements used in the solution. */
    private boolean[] winArray;

    /** A flag indicating if the desired result has been found. */
    private boolean flag;

    /** The target sum to achieve. */
    private final int b;

    /**
     * Constructs a {@code SharedData} instance with the given array and target sum.
     *
     * @param array the array of integers to be used in the computation
     * @param b     the target sum
     */
    public SharedData(int[] array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Gets the win array that represents which elements in the array
     * contribute to the solution.
     *
     * @return the win array
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the win array indicating the elements that contribute to the solution.
     *
     * @param winArray the win array to set
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Gets the array of integers used in the computation.
     *
     * @return the array of integers
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Gets the target sum to achieve.
     *
     * @return the target sum
     */
    public int getB() {
        return b;
    }

    /**
     * Gets the current value of the flag indicating whether a solution has been found.
     *
     * @return {@code true} if the solution has been found, {@code false} otherwise
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag indicating whether a solution has been found.
     *
     * @param flag {@code true} if the solution has been found, {@code false} otherwise
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

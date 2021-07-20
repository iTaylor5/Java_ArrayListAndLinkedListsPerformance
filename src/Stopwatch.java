/**
 * A utility class to measure the running time (wall clock) of a program.
 * 
 * @author Sedgewick
 * @author Wayne
 * @version 1.0
 */

public class Stopwatch {
	
	private final long start;

    /**
     * Initialises a new stop watch.
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    } 

    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

}

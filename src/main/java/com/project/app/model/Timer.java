package com.project.app.model;

/**
 * A simple one-shot countdown timer that runs in the background.
 * Usage:
 *   Timer timer = new Timer(10_000, () -> {
 *       System.out.println("Timer finished!");
 *   });
 *   timer.start();
 *   // Also available:
 *   long remaining = timer.getRemainingMillis();
 *   System.out.println("Seconds left: " + remaining / 1000);
 * <p>
 *   Note: AI was used in learning how to implement multithreading.
 */
public class Timer {
    // Total duration of the countdown (in milliseconds).
    private final long durationMillis;
    // Volatile means changes in one thread are visible in another.
    // Time (in ms since epoch) when the timer should finish.
    private volatile long endTimeMillis;
    // Indicates whether the timer is currently running.
    private volatile boolean running;
    // Background thread that handles the countdown.
    private Thread workerThread;
    // Optional callback that is run once when the timer finishes naturally.
    private final Runnable onFinish;
    /**
     * Constructs a countdown timer.
     *
     * @param durationMillis total time to count down, in milliseconds.
     * @param onFinish       callback to run when the timer reaches zero (may be null).
     */
    public Timer(long durationMillis, Runnable onFinish) {
        if (durationMillis <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0");
        }
        this.durationMillis = durationMillis;
        this.onFinish = onFinish;
        this.running = false;
        this.endTimeMillis = 0;
    }
    /**
     * Convenience constructor when callback is not needed.
     */
    public Timer(long durationMillis) {
        this(durationMillis, null);
    }
    /**
     * Starts the timer in the background.
     * If the timer is already running, this method does nothing.
     */
    public synchronized void start() {
        if (running) {
            // Already running; a second worker thread is not needed.
            return;
        }
        // Compute the "end time" once, using the current system time.
        this.endTimeMillis = System.currentTimeMillis() + durationMillis;
        this.running = true;
        // Create the background worker as a lambda Runnable.
        workerThread = new Thread(() -> {
            try {
                while (running) {
                    long now = System.currentTimeMillis();
                    long remaining = endTimeMillis - now;
                    if (remaining <= 0) {
                        // Time is up.
                        break;
                    }
                    // Sleep in small chunks to avoids busy waiting and saves CPU.
                    long sleepTime = Math.min(remaining, 200);
                    Thread.sleep(sleepTime);
                }
            } catch (InterruptedException e) {
                //exit the loop and end the thread in the event of cancel().
            } finally {
                // We are leaving the thread: the timer is no longer running.
                boolean finishedNaturally = running; // capture current state
                running = false;
                // If here because time expired (not because of cancel() ),
                // and a finish callback was provided, run it.
                if (finishedNaturally && onFinish != null) {
                    onFinish.run();
                }
            }
        });
        // Mark as daemon so it won't keep the JVM alive if only this thread is left.
        workerThread.setDaemon(true);
        // Actually start the background thread.
        workerThread.start();
    }
    /**
     * Cancels the timer before it finishes.
     * After calling cancel(), isRunning() will return false.
     */
    public synchronized void cancel() {
        if (!running) {
            return;
        }
        running = false;
        if (workerThread != null) {
            workerThread.interrupt(); // wakes up the thread if it's sleeping
        }
    }
    /**
     * Returns how many milliseconds are left in the countdown.
     * If the timer hasn't been started yet, or has finished, this may return 0.
     */
    public long getRemainingMillis() {
        if (!running) {
            long remaining = endTimeMillis - System.currentTimeMillis();
            return Math.max(0, remaining);
        }
        long remaining = endTimeMillis - System.currentTimeMillis();
        return Math.max(0, remaining);
    }
    /**
     * Returns true if the timer is currently counting down.
     */
    public boolean isRunning() {
        return running;
    }


    public String getFormattedTime(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }
}

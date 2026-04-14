
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

/**
 * Displays JVM memory usage information including heap, non-heap, and configured limits.
 */
public class Check {
    private static final long MB = 1024 * 1024;

    /** Prints current JVM memory statistics to stdout. */
    public static void main(String[] args) {
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long xmx = memoryBean.getHeapMemoryUsage().getMax() / MB;
        long xms = memoryBean.getHeapMemoryUsage().getInit() / MB;
        System.out.println("heap: " + memoryBean.getHeapMemoryUsage());
        System.out.println("non-heap: " + memoryBean.getNonHeapMemoryUsage());
        System.out.println("Initial Memory (xms): " + xms + " MB");
        System.out.println("Max memory (xmx): " + xmx + " MB");
    }
}


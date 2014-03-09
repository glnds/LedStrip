package be.pixxis.lpd8806;

/**
 * Simple class to test a led strip.
 *
 * @author Gert Leenders
 */
public class Example {

    public static void main(String[] args) {
        // Test proper working of a led strip.
        // The led strip in this example has 12 leds.
        final LedStrip ledStrip = new LedStrip(12, 0.5F);
        try {
            ledStrip.testStrip();
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}

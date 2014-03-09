package be.pixxis.lpd8806;

import com.pi4j.wiringpi.Spi;

/**
 * Simple class to test a led strip.
 *
 * @author Gert Leenders
 */
public class Example {

    public static void main(String[] args) {

        // setup SPI for communication with the led strip.
        int fd = Spi.wiringPiSPISetup(0, 10000000);
        if (fd <= -1) {
            System.out.println("SPI initialization FAILED.");
            return;
        }
        System.out.println("SPI initialization SUCCEEDED.");


        // Test proper working of a led strip.
        // The led strip in this example has 12 leds.
        final LedStrip ledStrip = new LedStrip(12, 0.5F);
        try {
            System.out.println("Start testing led strip.");

            ledStrip.testStrip();

            System.out.println("Test finished.");

        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}

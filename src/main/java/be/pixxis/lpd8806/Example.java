package be.pixxis.lpd8806;

import com.pi4j.wiringpi.Spi;

/**
 * Simple class which acts both as a simple test class and as an example.
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

            Thread.sleep(1000);

            animate(ledStrip);

            Thread.sleep(4000);

            ledStrip.allOff();
            ledStrip.update();

            System.out.println("Test finished.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void animate(final LedStrip ledStrip) {
        ledStrip.allOff();
        ledStrip.setLed(1, 0, 0, 255, 0.6F);
        ledStrip.setLed(2, 127, 0, 255, 0.6F);
        ledStrip.setLed(3, 255, 0, 255, 0.6F);
        ledStrip.setLed(4, 255, 0, 127, 0.6F);

        ledStrip.setLed(5, 0, 0, 255, 0.5F);
        ledStrip.setLed(8, 0, 0, 255, 0.5F);
        ledStrip.setLed(6, 127, 0, 255, 0.5F);
        ledStrip.setLed(7, 127, 0, 255, 0.5F);

        ledStrip.setLed(12, 0, 0, 255, 0.6F);
        ledStrip.setLed(11, 127, 0, 255, 0.6F);
        ledStrip.setLed(10, 255, 0, 255, 0.6F);
        ledStrip.setLed(9, 255, 0, 127, 0.6F);
        ledStrip.update();
    }
}

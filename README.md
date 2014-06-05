
## Description

This java library allows you to control LPD8806 based Led strips.

The library is tested with the use of the [Digital RGB LED Weatherproof Strip from Adafruit](http://www.adafruit.com/products/306).

## Maven install

	<dependency>
    	<groupId>be.pixxis</groupId>
        <artifactId>LedStrip</artifactId>
        <version>1.0</version>
    </dependency>


### How to connect the Led Strip to the Raspberry Pi

http://learn.adafruit.com/assets/1589


## Dependencies

- Pi4j
	- Raspian: http://pi4j.com/
	- Arch: https://github.com/glnds/pi4j-arch
	
## Run the example

	sudo java -cp LedStrip-1.0.jar:.:classes:/opt/pi4j/lib/'*' be.pixxis.lpd8806.Example

	

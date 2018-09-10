package edu.arielperez.advancedjava;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/*
 * Test class for the Microcontroller class
 */
public class MicrocontrollerTest {

	Microprocessor testCPU;
	Storage testRAM;
	Microcontroller testMicro;

	/*
	 * Creates a microcontroller object for testing
	 */
	@Before
	public void setup() {
		testCPU = new Microprocessor(4, 2.6, "Acme");
		testRAM = new Storage(1024, 1.8);
		testMicro = new Microcontroller(testCPU, testRAM);
	}

	/*
	 * Test default status, which is 'off'
	 */
	@Test
	public void testStatus() {
		assertTrue(testMicro.getStatus() == "Off");
	}

	/*
	 * Test default direction. Since the drill is off, direction should be 'off'
	 */
	@Test
	public void testDirection() {
		assertTrue(testMicro.getDirection() == "Off");
	}

	/*
	 * Test the status of the drill after setting input A to true
	 */
	@Test
	public void testStatusOn() {
		testMicro.setInputA(true);
		assertTrue(testMicro.getStatus() == "On");
	}

	/*
	 * Test the direction of the drill after setting input A to true,
	 * and input B is set to the default value of false.
	 */
	@Test
	public void testDirectionForward() {
		testMicro.setInputA(true);
		assertTrue(testMicro.getDirection().equalsIgnoreCase("Forward"));
	}

	/*
	 * Test direction of drill after setting input A and input B to true
	 */
	@Test
	public void testDirectionBackward() {
		testMicro.setInputA(true);
		testMicro.setInputB(true);
		assertTrue(testMicro.getDirection().equalsIgnoreCase("Backward"));
	}

	/*
	 * Test maximum speed of the drill
	 */
	@Test
	public void testMaximumSpeed() {
		assertTrue(testMicro.getMaxSpeed() == 1.48);
	}

}

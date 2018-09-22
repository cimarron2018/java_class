package edu.arielperez.advancedjava;

/*
 * Microcontroller for a micro-drill.
 * Two inputs to control the drill: 
 * inputA -> controls the power
 * inputB -> controls direction (forward, reverse)
 * 
 */

public class Microcontroller {

	// Microcontroller components
	private Microprocessor cpu;
	private Storage ram;
	private boolean inputA = false;
	private boolean inputB = false;

	/**
	 * Creates a Microcontroller using the following components
	 * 
	 * @param cpu
	 * @param ram
	 */
	public Microcontroller(Microprocessor cpu, Storage ram) {
		this.cpu = cpu;
		this.ram = ram;
	}

	/**
	 * @return the cpu
	 */
	public Microprocessor getCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(Microprocessor cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the ram
	 */
	public Storage getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(Storage ram) {
		this.ram = ram;
	}

	/**
	 * Calculates maximum speed of micro-drill
	 * 
	 * @return maxSpeed
	 */
	public double getMaxSpeed() {
		return (cpu.getSpeed() * .5 + ram.getSpeed() * .1); // some crazy formula to calculate the maximum speed of the
															// drill
	}

	/*
	 * set input A
	 * 
	 * @param input -> boolean
	 * @return void
	 */
	public void setInputA(boolean input) {
		this.inputA = input;
	}

	/*
	 * set input b
	 * 
	 * @param input -> boolean
	 * 
	 * @return void
	 */
	public void setInputB(boolean input) {
		this.inputB = input;
	}

	/*
	 * get input A
	 * 
	 * @return inputA boolean
	 */
	public boolean getInputA() {
		return inputA;
	}

	/*
	 * get input B
	 * 
	 * @return inputB boolean
	 */
	public boolean getInputB() {
		return inputB;
	}

	/*
	 * Return direction of drill
	 * 
	 * @return direction -> Backward, forward, off
	 */
	public String getDirection() {
		return inputA ? (inputB ? "Backward" : "Forward") : "Off";
	}

	/*
	 * Return drill status
	 * 
	 * @return status -> on, off
	 */
	public String getStatus() {
		return inputA ? "On" : "Off";
	}
}

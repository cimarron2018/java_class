package edu.arielperez.advancedjava;

public class Storage {

	private int size; // megabytes
	private double speed; // megaherz

	/**
	 * Creates a solid state storage device  with the followin attributes
	 * 
	 * @param size
	 * @param speed
	 */
	public Storage(int size, double speed) {
		super();
		this.size = size;
		this.speed = speed;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

}

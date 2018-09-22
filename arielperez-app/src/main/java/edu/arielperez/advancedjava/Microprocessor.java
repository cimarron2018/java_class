package edu.arielperez.advancedjava;

public class Microprocessor {

	private int cores; // number of cores
	private double speed; // gigahertz (GHz)
	private String maker; // manufacturer name

	/**
	 * Creates a microprocessor with the following attributes
	 * 
	 * @param cores
	 * @param speed
	 * @param maker
	 */
	public Microprocessor(int cores, double speed, String maker) {
		super();
		this.cores = cores;
		this.speed = speed;
		this.maker = maker;
	}

	/**
	 * @return the cores
	 */
	public int getCores() {
		return cores;
	}

	/**
	 * @param cores the cores to set
	 */
	public void setCores(int cores) {
		this.cores = cores;
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

	/**
	 * @return the maker
	 */
	public String getMaker() {
		return maker;
	}

	/**
	 * @param maker the maker to set
	 */
	public void setMaker(String maker) {
		this.maker = maker;
	}

}

package com.mrmrmr7.figure.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.log4j.Logger;

/**
 * Entity class of Sphere
 * @author meow
 * @version 1.0
 */

@Entity
public class Sphere extends Point  {
	final static Logger log = Logger.getLogger(Sphere.class);
	
	@Id
	private double z;
	private double r;

	/**
	 * Constructor - creating new object with known parameters
	 * @param x x-orb coordinate
	 * @param y y-orb coordinate
	 * @param z z-orb coordinate
	 * @param r radius of Sphere
	 */
	public Sphere(double r, double x, double y, double z) {
		super(x, y);
		this.z = z;
		this.r = r;
		log.info("Was created object Sphere");
	}
	
	/**
	 * Sphere.java
	 * Method to get private parameter <b>r</b>
	 * @return radius of Sphere
	 */
	public double getR() {
		return r;
	}

	/**
	 * Method to set private parameter <b>r</b>
	 * @param r new radius of Sphere
	 */
	public void setR(double r) {
		this.r = r;
	}

	/**
	 * Method to get private parameter <b>z</b>
	 * @return z coordinate of Sphere
	 */
	public double getZ() {
		return z;
	}

	/**
	 * Method to set private parameter <b>z</b>
	 * @param z new z coordinate
	 */
	public void setZ(double z) {
		this.z = z;
	}
		
}

package com.mrmrmr7.figure.entity;

import javax.persistence.Entity;

/**
 * Point.java
 * Entity class of point
 * @author meow
 * @version 1.0
 */

@Entity
public class Point extends Figure implements FigureInterface {
		
	/**
	 * Class extend fields <b>X</b> and <b>Y</b>
	 */
	
	/**
	 * Constructor - creating new object with known parameters
	 * @param x x-orb coordinate
	 * @param y y-orb coordinate 
	 */
	public Point(double x, double y) {
		super(x,y);
	}
	
	/**
	 * Constructor - creating new object with default parameters 
	 */
	public Point() { 
		super();
	}
	
	/** 
	 * Method to get value of field {@link Point#Figure#x}
	 * @return value of x-field
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Method to set value of field {@link Point#Figure#x}
	 * @param value that you want to set to <b>x</b>
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Method to get value of field {@link Point#Figure#y}
	 * @return value of y-field
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Method to set value of field {@link Point#Figure#y}
	 * @param value that you want to set to <b>y</b>
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	
}

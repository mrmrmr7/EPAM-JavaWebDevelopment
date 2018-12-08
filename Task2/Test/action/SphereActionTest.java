package com.mrmrmr7.figure.action;

import com.mrmrmr7.figure.entity.Sphere;
import com.mrmrmr7.figure.action.SphereAction;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class SphereActionTest {
	public static Sphere sphere;
	public SphereAction calculate = new SphereAction();
	public final Logger log = Logger.getLogger(SphereActionTest.class);
	
	@Rule 
	public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
		sphere = new Sphere(1, 2, 3, 4);
	}

	@Test
	public void isRightSquare() {
		double square = calculate.square(sphere);
		assertEquals("Error: not correct square calculate: \n" , 201.056, square, 0.01);
	}
	
	@Test
	public void isRightVolume() {
		double volume = calculate.volume(sphere);
		assertEquals("Error: not correct volume calculate: \n", 268.08, volume, 0.01);
	}
	
	@Test
	public void isRightDissectionByXY() {
		double ratio = calculate.dissectionByPlane(sphere, Plane.XY);
		assertEquals("Error: not correct ratio for XY: \n", 0.04, ratio, 0.01);
	}
	
	@Test
	public void isRightDissectionByXZ() {
		double ratio = calculate.dissectionByPlane(sphere, Plane.XZ);
		assertEquals("Error: not correct ratio for XY: \n", 0.162, ratio, 0.01);
	}
	
	@Test
	public void isRightDissectionByZY() {
		double ratio = calculate.dissectionByPlane(sphere, Plane.ZY);
		assertEquals("Error: not correct ratio for XY: \n", 0.31, ratio, 0.01);
	}

	@Test
	public void isTouchXY() {
		boolean isTouch = calculate.isTouchPlane(sphere, Plane.XY);
		assertEquals("Error: not correct comparing: \n", false, isTouch);
	}
	
	@Test
	public void isTouchXZ() {
		boolean isTouch = calculate.isTouchPlane(sphere, Plane.XZ);
		assertEquals("Error: not correct comparing: \n", false, isTouch);
	}
	
	@Test
	public void isTouchZY() {
		boolean isTouch = calculate.isTouchPlane(sphere, Plane.ZY);
		assertEquals("Error: not correct comparing: \n", false, isTouch);
	}
	
	@After 
	public void after() throws Exception {
		log.info("Test: " + name.getMethodName() + " done;\n");
	}
}
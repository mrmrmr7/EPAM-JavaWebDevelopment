package com.mrmrmr7.figure.entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.apache.log4j.Logger;

public class SphereTest {
	private static Sphere sphere;
	final static Logger log = Logger.getLogger(SphereTest.class);
	
	@Rule
	public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
		sphere = new Sphere(2,3,4,5);
	}
	
	@Test
	public void isXEqualsTo2() {
		assertEquals("Error: bad X init: \n", sphere.getX(), 2, 0.01);
	}
	
	@Test
	public void isYEqualsTo3() {
		assertEquals("Error: bad Y init: \n", sphere.getY(), 3, 0.01);
	}	
	
	@Test
	public void isZEqualsTo4() {
		assertEquals("Error: bad ZS init: \n", sphere.getZ(), 4, 0.01);
	}
	
	@Test
	public void isREqualsTo5() {
		assertEquals("Error: bad R init: \n", sphere.getR(), 5, 0.01);
	}
	
	@Test
	public void isSetXTo3() {
		sphere.setX(3);
		assertEquals("Error: not correct setX(): \n", sphere.getX(), 3, 0.01);
	}
	
	@Test
	public void isSetYTo3() {
		sphere.setY(3);
		assertEquals("Error: not correct setY(): \n", sphere.getY(), 3, 0.01);
	}
	
	@Test
	public void isSetZTo3() {
		sphere.setZ(3);
		assertEquals("Error: not correct setZ(): \n", sphere.getZ(), 3, 0.01);
	}	
	
	@Test
	public void isSetRTo3() {
		sphere.setR(3);
		assertEquals("Error: not correct setY(): \n", sphere.getR(), 3, 0.01);
	}
	

	@After 
	public void after() throws Exception {
		log.info("Test: " + name.getMethodName() + " done;\n");
	}
}

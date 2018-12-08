package com.mrmrmr7.figure.entity;

import static org.junit.Assert.*;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.mrmrmr7.figure.entity.Point;

public class PointTest {
	private static Point point;
	final static Logger log = Logger.getLogger(PointTest.class);
	@Rule
	public TestName name = new TestName();

	@Before
	public void setUp() throws Exception {
		point = new Point(5,4);
	}
	
	@Test
	public void isXEqualsTo5() {
		assertEquals("Error: not correct X init: \n", point.getX(), 5, 0.01);
	}
	
	@Test
	public void isYEqualsTo5() {
		assertEquals("Error: not correct Y init: \n", point.getY(), 4, 0.01);
	}
	
	@Test
	public void isSetXTo3() {
		Point pt = new Point();
		pt.setX(3);
		assertEquals("Error: not correct setX(): \n", pt.getX(), 3, 0.01);
	}
	
	@Test
	public void isSetYTo3() {
		Point pt = new Point();
		pt.setY(3);
		assertEquals("Error: not correct setY(): \n", pt.getY(), 3, 0.01);
	}
	
	@After
	public void after() {
		log.info("Test: " + name.getMethodName() + " done\n");
	}
}

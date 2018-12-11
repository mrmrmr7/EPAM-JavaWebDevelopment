package com.mrmrmr7.figure.action;

import com.mrmrmr7.figure.entity.Sphere;
import com.mrmrmr7.figure.interfaces.Action;

public class SphereAction implements Action {
	SphereAction(){};
	
	public double area(Sphere a) {
		final double radius = a.getR();
		return 4 * Math.PI * radius * radius;
	}
	
	public double volume(final Sphere a) {
		final double radius = a.getR();
		return 4 * Math.PI * radius * radius * radius / 3;
	}
	
	public boolean isRightFigure(final Sphere a) {
		return a.getR() != 0;
	}
	
	public double dissectionByPlane(final Sphere a, Plane plane) {
		double res = 0.0;
		double distToAsix = 0;
		
		if (plane == Plane.XY || plane == Plane.YX) {
			distToAsix = a.getZ();
		} else if (plane == Plane.YZ || plane == Plane.ZY) {
			distToAsix = a.getX();
		} else if (plane == Plane.ZX || plane == Plane.XZ) {
			distToAsix = a.getY();
		}
		
		final double R = a.getR();
		
		if (distToAsix < R) {
			double volume = volume(a);
			double h = R - distToAsix;
			double segmentVolume = Math.PI * h * h  * (3 * R - h) / 3;
			res = segmentVolume / volume;
		}
		
		return res;
	}
	
	public boolean isTouchPlane(final Sphere a, Plane plane) {
	
		double distToAsix = 0;
		
		if (plane == Plane.XY || plane == Plane.YX) {
			distToAsix = a.getZ();
		} else if (plane == Plane.YZ || plane == Plane.ZY) {
			distToAsix = a.getX();
		} else if (plane == Plane.ZX || plane == Plane.XZ) {
			distToAsix = a.getY();
		}
		
		return Math.abs(distToAsix - a.getR()) < 0.01;
	}

}


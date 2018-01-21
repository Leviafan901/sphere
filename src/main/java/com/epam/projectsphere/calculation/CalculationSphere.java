package com.epam.projectsphere.calculation;

import java.lang.Math;

public class CalculationSphere {

	public double getSphereArea(double radius) {
		return Math.PI * 4 * radius * radius;
	}
	
	public double getVolumeSphere(double radius) {
		return 4/3 * Math.PI * radius * radius * radius;
	}
	
	public void getVolumeRatio() {
		
	}
	
	public boolean isSphere(double radius) {
		return radius > 0;
	}
	
	public boolean isTouchedCoordinatePlane(double radius,
			double ordinatePoint, double abscissaPoint) {
		return (radius == ordinatePoint) || (radius == abscissaPoint);
	}
}

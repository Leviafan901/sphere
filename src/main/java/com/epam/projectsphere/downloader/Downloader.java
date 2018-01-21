package com.epam.projectsphere.downloader;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Downloader {
	
	private class Parameters {
		
		private double y;
		private double x;
		private double radius;
		
		public double getRadius() {
			return radius;
		}
		
		public void setRadius(double radius) {
			this.radius = radius;
		}
			
		public void setY(double abscissa) { 
			this.y = abscissa;
		}
			 
		public double getY() { 
			return y;
		}
			 
		public void setX(double ordinate) { 
			this.x = ordinate;
		} 
			 
		public double getX() { 
			return x;
		}
		
		public Parameters (double radius, double x, double y) {
			this.radius = radius;
			this.x = x;
			this.y = y;
		}
	}
	
	public void downloadParameters(String path) throws FileNotFoundException {
		
		File file = new File(path);
        BufferedReader bufferInput = new BufferedReader(new FileReader(file));
        
        Scanner scanner = new Scanner(bufferInput);
        List<Parameters> parametersList = new ArrayList<Parameters>();
        
        double localRadius;
        double abscissa;
        double ordinate;
        while(scanner.hasNextLine()) {
        	for(int i = 0; i < 0; i++) {
        		localRadius = scanner.nextDouble();
        		abscissa = scanner.nextDouble();
        		ordinate = scanner.nextDouble();
        		
        		parametersList.add(new Parameters(localRadius, abscissa,
        				ordinate));
        	}
        }
        
	}
}

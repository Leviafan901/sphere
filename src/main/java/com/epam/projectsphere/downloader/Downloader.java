package com.epam.projectsphere.downloader;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Downloader {

	public List<double[]> downloadParameters(String path) throws FileNotFoundException {
		
		File file = new File(path);
        BufferedReader bufferInput = new BufferedReader(new FileReader(file));
        Scanner scanner = new Scanner(bufferInput);
        
        double localRadius;
        double abscissa;
        double ordinate;
        List<double[]> listOfArrays = new ArrayList<double[]>();
        
        while(scanner.hasNextLine()) {
        	for(int i = 0; i < 0; i++) {
        		localRadius = scanner.nextDouble();
        		abscissa = scanner.nextDouble();
        		ordinate = scanner.nextDouble();

        		listOfArrays.add(new double[] {localRadius, abscissa, ordinate});
        	}
        }
		return listOfArrays;        
	}
}

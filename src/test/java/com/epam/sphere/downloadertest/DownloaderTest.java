package com.epam.sphere.downloadertest;

import org.junit.Assert;
import org.junit.Test;
import com.epam.projectsphere.downloader.Downloader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DownloaderTest {

	private Downloader downloader = new Downloader();
	private static final String PATH = "D:\\test.txt";
	private double[] testArray = {1.0, 2.0, 3.0};
	private List<double[]> list = new ArrayList<double[]>();
	
	
	@Test
	public void shouldDownloadFileAndReturnListOfArraysDouble() throws FileNotFoundException {
		
		List<double[]> listOfArrays = downloader.downloadParameters(PATH);
		list.add(testArray);
		Assert.assertEquals(listOfArrays, list); 
	}
	
}

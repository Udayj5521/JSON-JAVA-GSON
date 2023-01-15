package com.converters;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.model.Car;

public class TestCarJSONToJavaObject {

	public static void main(String[] args) throws FileNotFoundException {

		// pointing to json file data using reader
		FileReader fr = new FileReader("Car.json");

		// creating gson class object
		Gson gson = new Gson();

		// converting json file data to java object
		Car c = gson.fromJson(fr, Car.class);
		
		
		System.out.println(c);
	}
}

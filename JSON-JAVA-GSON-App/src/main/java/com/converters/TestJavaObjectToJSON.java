package com.converters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Car;

public class TestJavaObjectToJSON {
	public static void main(String[] args) {

		// create model class object
		Car c = new Car();

		// setting data to model class obj
		c.setModel(2022);
		c.setBrand("Audi");
		c.setColor("White");

		// Creating Gson class object
		Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();

		// Converting java obj to json string
		String jsonStr = gson.toJson(c);

		// printing json on console
		System.out.println(jsonStr);

	}
}

package com.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car {

	@SerializedName("car-id")
	@Expose
	private int model;

	@Expose
	private String brand;

	@Expose
	private String color;

	
	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + ", color=" + color + "]";
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

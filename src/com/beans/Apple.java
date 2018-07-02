package com.beans;

public class Apple {

	
	public String color;
	public int size;
	public double weight;
	
	public Apple(String color, int size, double weight) {
		super();
		this.color = color;
		this.size = size;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", size=" + size + ", weight=" + weight + "]";
	}
	
}

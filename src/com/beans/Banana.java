package com.beans;

public class Banana {

	public String color;
	public int size;
	public double weight;
	
	
	public Banana(String color, int size, double weight) {
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
		return "Banana [color=" + color + ", size=" + size + ", weight=" + weight + "]";
	}
	
	
}

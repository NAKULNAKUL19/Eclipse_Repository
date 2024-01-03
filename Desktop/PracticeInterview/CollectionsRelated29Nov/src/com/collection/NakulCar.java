package com.collection;

public class NakulCar {
public String model;
public String color;
NakulCar()
{
	
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public NakulCar(String model, String color) {
	super();
	this.model = model;
	this.color = color;
}
@Override
public String toString() {
	return "NakulCar from Fantasy League sports earned by him are [model=" + model + ", color=" + color + "]";
}


}

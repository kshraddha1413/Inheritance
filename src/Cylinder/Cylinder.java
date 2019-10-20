package Cylinder;
//class cylinder is a subclass and Circle class is parant class(super class)
//Cylinder class inheriting all properties of Circle class
//which avoid redundency of code
public class Cylinder extends Circle {
	double hight;

	public Cylinder(double radius, double hight) {
		super(radius);//calling super class(Circle) consturctot
		this.hight = hight;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		if(hight<0) {
		this.hight = 0.0;}
		else {
			this.hight=hight;
		}
	}
	public double getVolume() {
		double vol=getArea()*getHight();//using getArea method of super class
		return vol;
	}
	
	

}

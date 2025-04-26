package com.ust;

import java.util.logging.Logger;

public class AreaShapes{ 
public static Logger logger = Logger.getLogger(AreaShapes.class.getName());
 
int area(int side) {
	return side * side;
}
 double area(int length,int breadth) {
	 return length * breadth;
 }
	 double area(double radious) {
		 return 3.14 * radious *radious;
	 }
	 double area (double base,double height) {
		 return 0.5* base* height;
	 }
	 public static void main (String[] args)  {
 AreaShapes c=new AreaShapes();
 logger.info("area of square"+c.area(5));
 logger.info("area of rectangle"+c.area(4,6));
 logger.info("area of circle"+c.area(1.5));
 logger.info("area of triangle"+c.area(4.0,5.0));

 
	 }
 }
	 



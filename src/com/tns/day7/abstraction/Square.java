package com.tns.day7.abstraction;

public class Square extends Shape 
{
 private float side;
 
 public Square()
 {
	 side=2.0f;
 }
 
 public Square(float side) 
 {
     this.side=side;
 }
 
 @Override
 void calArea() {
     area=side*side;
	
 }
}
 

package com.company; // com.company 경로의 패키지에 속한 Circle 클래스

public class Circle {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}

package support;

import cucumber.api.java8.Ca;

public class Test {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 50);

        System.out.println("Rect1 perimeter: " + rect1.getPerimeter());
        System.out.println("Rect1 area: " + rect1.getArea());

        Rectangle rect2 = new Rectangle(10, 30);

        System.out.println("Rect2 perimeter: " + rect2.getPerimeter());
        System.out.println("Rect2 area: " + rect2.getArea());
    }
}

class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
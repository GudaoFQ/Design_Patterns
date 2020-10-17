package designdemo.factory;

/**
 * Author : GuDao
 * 2020-10-09
 */

public class SquareShape implements Shape {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}

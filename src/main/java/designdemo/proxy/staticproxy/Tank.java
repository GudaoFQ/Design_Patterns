package designdemo.proxy.staticproxy;

/**
 * 坦克实体，实现了move接口中的移动方法
 * Author : GuDao
 * 2020-11-03
 */

public class Tank implements Move {
    @Override
    public void move() {
        System.out.println("Tank Moving");
    }
}

package designdemo.proxy.staticproxy;

/**
 * 坦克的代理类，添加了坦克移动前后的日志操作
 * Author : GuDao
 * 2020-11-03
 */

public class TankProxy implements Move {

    Move tank = new Tank();

    @Override
    public void move() {
        System.out.println(">> start");
        tank.move();
        System.out.println(">> end");
    }
}

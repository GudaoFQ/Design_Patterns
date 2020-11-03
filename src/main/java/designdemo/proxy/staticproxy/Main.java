package designdemo.proxy.staticproxy;

/**
 *
 * 需求：在坦克实现移动的前后，添加日志操作
 *
 * Author : GuDao
 * 2020-11-03
 */

public class Main {
    public static void main(String[] args) {
        TankProxy tankProxy = new TankProxy();
        tankProxy.move();
    }
}

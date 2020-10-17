package designdemo.factory;

import designdemo.factory.methodfactory.Bus;
import designdemo.factory.methodfactory.Car;

/**
 * 通过反射创建出实体类
 * Author : GuDao
 * 2020-10-09
 */

public class EasyFactory {
    /**
     * 直接获取实体类
     *
     * @param clazz clazz
     * @return {@link Object}
     */
    public static Object getBean(Class<? extends Shape> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 获取实体前可以进行前置操作
     *
     * @return {@link Car}
     */
    public static Car getCar(){
        //前置操作：如打印日志等信息
        return new Car();
    }
    /**
     * 获取实体前可以进行前置操作
     *
     * @return {@link Car}
     */
    public static Bus getBus(){
        //前置操作：如打印日志等信息
        return new Bus();
    }
}

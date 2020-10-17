package designdemo.factory.abstractfactory.usaclass;

import designdemo.factory.abstractfactory.abstractclass.Gun;

/**
 * USA使用的武器实体类
 * Author : GuDao
 * 2020-10-11
 */
public class Ak extends Gun {
    @Override
    public void usering() {
        System.out.println("AK使用7.62子弹");
    }
}

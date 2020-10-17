package designdemo.factory.abstractfactory.ukclass;

import designdemo.factory.abstractfactory.abstractclass.Gun;

/**
 * UK使用的武器实体类
 * Author : GuDao
 * 2020-10-11
 */
public class Uzi extends Gun {
    @Override
    public void usering() {
        System.out.println("UZI使用9mm子弹");
    }
}

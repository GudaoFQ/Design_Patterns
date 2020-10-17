package designdemo.factory.abstractfactory.ukclass;

import designdemo.factory.abstractfactory.abstractclass.Food;

/**
 * UK食物实体类
 * Author : GuDao
 * 2020-10-11
 */
public class Noodles extends Food {
    @Override
    public void eating() {
        System.out.println("UK吃面条");
    }
}

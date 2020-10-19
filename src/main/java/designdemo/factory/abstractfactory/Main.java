package designdemo.factory.abstractfactory;

import designdemo.factory.abstractfactory.abstractclass.AbstractFactory;
import designdemo.factory.abstractfactory.abstractclass.Food;
import designdemo.factory.abstractfactory.abstractclass.Gun;
import designdemo.factory.abstractfactory.abstractclass.Transportion;
import designdemo.factory.abstractfactory.ukclass.UkFactory;

/**
 * 抽象工厂中生产两类实体，一个是以UkFactory为工厂的UK系列对象；一个是以UsaFactory为工厂的USA系列对象
 * Author : GuDao
 * 2020-10-11
 */
public class Main {
    public static void main(String[] args) {
        //当前使用Uas的族类工厂
        //AbstractFactory factory = new UsaFactory();
        //想变成Uk的只需要修改工厂实体就行
        AbstractFactory factory = new UkFactory();

        //下面的代码不会修改
        Food food = factory.createFood();
        food.eating();
        Transportion transportion = factory.createTransportion();
        transportion.moving();
        Gun gun = factory.createGun();
        gun.usering();
    }
}

package designdemo.factory.abstractfactory.usaclass;

import designdemo.factory.abstractfactory.abstractclass.AbstractFactory;
import designdemo.factory.abstractfactory.abstractclass.Food;
import designdemo.factory.abstractfactory.abstractclass.Gun;
import designdemo.factory.abstractfactory.abstractclass.Transportion;

/**
 * usa的同族工厂实体
 * Author : GuDao
 * 2020-10-11
 */
public class UsaFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Steak();
    }

    @Override
    public Gun createGun() {
        return new Ak();
    }

    @Override
    public Transportion createTransportion() {
        return new Car();
    }
}

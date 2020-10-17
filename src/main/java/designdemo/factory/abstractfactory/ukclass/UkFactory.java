package designdemo.factory.abstractfactory.ukclass;

import designdemo.factory.abstractfactory.abstractclass.AbstractFactory;
import designdemo.factory.abstractfactory.abstractclass.Food;
import designdemo.factory.abstractfactory.abstractclass.Gun;
import designdemo.factory.abstractfactory.abstractclass.Transportion;

/**
 * uk的同族工厂实体
 * Author : GuDao
 * 2020-10-11
 */
public class UkFactory extends AbstractFactory {

    @Override
    public Food createFood() {
        return new Noodles();
    }

    @Override
    public Gun createGun() {
        return new Uzi();
    }

    @Override
    public Transportion createTransportion() {
        return new Bus();
    }
}

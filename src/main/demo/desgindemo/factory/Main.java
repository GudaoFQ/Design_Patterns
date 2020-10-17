package desgindemo.factory;

/**
 * Author : GuDao
 * 2020-10-09
 */

public class Main {
    public static void main(String[] args) {
        EasyFactory factory = new EasyFactory();
        //两者二选一；网上推荐使用第一种，将类的路径写在配置文件中，但我测试第二种也能使用，所以此处就不将第一种详细使用方法过多说明了
        //RoundShape roundShape = (RoundShape) factory.getBean(desgindemo.factory.RoundShape.class);
        RoundShape roundShape = (RoundShape) factory.getBean(RoundShape.class);
        roundShape.draw();
    }
}

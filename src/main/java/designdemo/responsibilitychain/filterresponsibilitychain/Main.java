package designdemo.responsibilitychain.filterresponsibilitychain;

/**
 * 执行request顺序为：filter1->filter2->filter；执行response顺序为：filter3->filter2->filter1
 * Author : GuDao
 * 2020-10-16
 */

public class Main {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        StringBuffer request = new StringBuffer();
        StringBuffer response = new StringBuffer();
        //向责任链中添加Filter
        chain.add(new FirstFilter()).add(new TwiceFilter()).add(new ThreeFilter());
        chain.doFilter(request, response, chain);
        System.out.println(request);
        System.out.println(response);
    }
}

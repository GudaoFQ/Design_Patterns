package designdemo.responsibilitychain.realfilterresponsibilitychain;

/**
 * Author : GuDao
 * 2020-10-16
 */
public class TwiceFilter implements Filter {
    @Override
    public boolean doFilter(StringBuffer request, StringBuffer response, RealFilterChain chain) {
        //处理request业务
        request.append("TwiceFilter ");
        //调用chain，通过chain来执行下一个Filter中的request业务
        chain.doFilter(request, response);
        //处理Response
        response.append("TwiceFilter ");
        return true;
    }
}

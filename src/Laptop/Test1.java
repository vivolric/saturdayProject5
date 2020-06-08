package Laptop;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {


    @Test
    public void test1() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100000);

        Assert.assertTrue("result should be 850 but your result is " + num, num == 850);
    }

    @Test
    public void test2() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100001);

        Assert.assertTrue("result should be 750 but your result is " + num, num == 750);
    }


    @Test
    public void test3() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100002);

        Assert.assertTrue("result should be 1100 but your result is " + num, num == 1100);
    }


    @Test
    public void test4() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100003);

        int num2 = p1.getPrice(1100004);

        int total = num + num2;

        total = p1.getDiscount(total, 20);

        Assert.assertTrue("result should be 2120 but your result is " + num, total == 2120);
    }

    @Test
    public void test5() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100006);

        int num2 = p1.getPrice(1100007);

        int total = num + num2;

        total = p1.getDiscount(total, 10);

        Assert.assertTrue("result should be 1845 but your result is " + num, total == 1845);
    }

    @Test
    public void test6() {
        PriceForOneLaptop p1 = new PriceForOneLaptop();

        int num = p1.getPrice(1100005);

        int num2 = p1.getPrice(1100008);

        int total = num + num2;

        total = p1.getDiscount(total, 10);

        Assert.assertTrue("result should be 2025 but your result is " + num, total == 2025);
    }


}

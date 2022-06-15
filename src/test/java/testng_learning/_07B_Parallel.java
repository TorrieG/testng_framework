package testng_learning;

import org.testng.annotations.Test;
import scripts.Base;
import utilities.Waiters;

public class _07B_Parallel {
    @Test(priority = 1)
    public void testB1(){
        Waiters.pause(5);
        System.out.println("This is testB1");
        System.out.println("Thread id = " + Thread.currentThread().getName());
    }

    @Test(priority = 2)
    public void testB2(){
        Waiters.pause(10);
        System.out.println("This is testB2");
        System.out.println("Thread id = " + Thread.currentThread().getName());
    }

    @Test(priority = 3)
    public void testB3(){
        Waiters.pause(15);
        System.out.println("This is testB3");
        System.out.println("Thread id = " + Thread.currentThread().getName());
    }
}

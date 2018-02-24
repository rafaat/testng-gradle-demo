package com.rafaat.demo;

import org.testng.annotations.Test;

public class FeatureATest {

    @Test
    public void testA1() {
        System.out.println("testA1 - " + Thread.currentThread());
    }

    @Test
    public void testA2() {
        System.out.println("testA2 - " + Thread.currentThread());
    }

    @Test(groups = {"uat"})
    public void testA3() {
        System.out.println("testA3 - " + Thread.currentThread());
    }
}

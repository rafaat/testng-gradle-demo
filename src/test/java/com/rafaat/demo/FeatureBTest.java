package com.rafaat.demo;

import org.testng.annotations.Test;

public class FeatureBTest {

    @Test(groups = {"uat"})
    public void testB1() {
        System.out.println("testB1 - " + Thread.currentThread());
    }

    @Test(groups = {"uat","prod"})
    public void testB2() {
        System.out.println("testB2 - " + Thread.currentThread());
    }

    @Test(groups = {"prod"})
    public void testB3() {
        System.out.println("testB3 - " + Thread.currentThread());
    }
}

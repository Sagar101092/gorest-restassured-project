package com.gorest.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Sagar Goswami
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://gorest.co.in";
    }
}

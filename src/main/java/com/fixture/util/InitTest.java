package com.fixture.util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

public class InitTest {
    protected RequestSpecification httpRequest;

    @BeforeClass
    public void inItTest(){
        RestAssured.baseURI = "http://localhost:3000";
        httpRequest = RestAssured.given().headers(this.getHeadersContent()).log().all();

    }

    private Map getHeadersContent() {
        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put("Content-type", ContentType.JSON);
        return headerMap;
    }

}

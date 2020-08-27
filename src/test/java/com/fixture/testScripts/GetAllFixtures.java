package com.fixture.testScripts;

import com.fixture.dto.Fixtures;
import com.fixture.util.InitTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class GetAllFixtures extends InitTest {

    @Test
    public void testGetAllFixtures(){
        Response response = httpRequest.get("/fixtures");
        response.prettyPrint();
        Fixtures getAllFixtures[] = response.getBody().as(Fixtures[].class);
        assertThat(response.getStatusCode(), equalTo(200));
        assertThat(getAllFixtures.length, equalTo(3));
        String expectedFixtureId[] = {"1", "2", "3"};
        for(int idx = 0 ; idx<getAllFixtures.length; idx++){
            assertThat(getAllFixtures[idx].getFixtureId(), equalTo(expectedFixtureId[idx]));
        }
    }
}

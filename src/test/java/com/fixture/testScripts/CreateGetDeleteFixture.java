package com.fixture.testScripts;

import com.fixture.dto.Fixtures;
import com.fixture.util.InitTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateGetDeleteFixture extends InitTest {

    @Test
    public void testCreateGetFixture() throws InterruptedException {

        // we are calling the getFixturePayload method to get the create fixture payload.
        Fixtures payload  = Fixtures.getFixturePayload();

        // Below code will create a fixture
        Response createFixtureResponse = httpRequest.body(payload).post("/fixture");
        createFixtureResponse.prettyPrint();
        assertThat(createFixtureResponse.getStatusCode(), equalTo(200));

        // Added a delay to get a above created fixture
        Thread.sleep(5000);

        // Below code will retrve the above created fixture and validate the 1st team teamID
        Response fixtureByIdResponse = httpRequest.get("/fixture/5");
        Fixtures getAllFixtures = fixtureByIdResponse.getBody().as(Fixtures.class); // Deserialize the json object back to java pojo
        String actualTeamId = getAllFixtures.getFootballFullState().getTeams().get(0).getTeamId();
        assertThat(actualTeamId, equalTo("HOME"));
    }

    @Test(dependsOnMethods = "testCreateGetFixture")
    public void testDeleteFixture() throws InterruptedException {

        // Below code will delete above created fixture
        Response deleteFixtureResponse = httpRequest.delete("/fixture/5");
        assertThat(deleteFixtureResponse.getStatusCode(), equalTo(200));
        deleteFixtureResponse.prettyPrint();
    }
}

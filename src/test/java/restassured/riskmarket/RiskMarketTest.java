package restassured.riskmarket;

import com.sidenis.qaacademy.common.BaseRiskMarketTest;
import com.sidenis.qaacademy.restassured.controller.riskmarket.InternalController;
import com.sidenis.qaacademy.restassured.controller.riskmarket.RiskmarketController;
import io.restassured.RestAssured;
import org.junit.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RiskMarketTest extends BaseRiskMarketTest {



    @Test
    public void TestRiskMarketCookie(){
        System.out.println();
    }

    @Test
    public void TestGetCurrentUser() {
        System.out.println(InternalController.getCurrentUser());
    }

    @Test
    public void TestGetCurrentUserEmail() {
        System.out.println(InternalController.getCurrentUser());
    }
}

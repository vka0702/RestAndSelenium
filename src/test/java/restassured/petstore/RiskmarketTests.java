package restassured.petstore;

import com.sidenis.qaacademy.common.BaseRiskMarketTest;
import com.sidenis.qaacademy.restassured.controller.riskmarket.InternalController;
import com.sidenis.qaacademy.restassured.vo.riskmarket.RiskmarketUser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Started by ML on 9/12/2018.
 */
public class RiskmarketTests extends BaseRiskMarketTest {

    @Test
    public void testGetCurrentUserPositive() {
        RiskmarketUser user = InternalController.getCurrentUser();
        assertEquals("+7 (111) 111-11-11", user.getPhoneNumber());
    }
}

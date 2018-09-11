package restassured.petstore;

import com.sidenis.qaacademy.common.BasePetStoreTest;
import com.sidenis.qaacademy.restassured.controller.petstore.PetsController;
import com.sidenis.qaacademy.restassured.vo.petstore.Pet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Started by ML on 9/10/2018.
 */
public class PetstoreTests extends BasePetStoreTest {

    @Test
    public void testGetPetById() {
        final Long petId = 7L;
        String expectedName = "panda";
        Pet pet = PetsController.getPet(petId);
        assertEquals(expectedName, pet.getName());
    }
}

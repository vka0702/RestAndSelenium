package restassured.petstore;

import com.sidenis.qaacademy.common.BasePetStoreTest;
import com.sidenis.qaacademy.common.annotation.RestTest;
import com.sidenis.qaacademy.restassured.controller.petstore.PetsController;
import com.sidenis.qaacademy.restassured.vo.petstore.Pet;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * Started by ML on 9/10/2018.
 */
public class PetstoreTests extends BasePetStoreTest {

    @Test
    @Category({RestTest.class})
    public void testGetPetById() {
        final Long petId = 60L;
        String expectedName = "elephant";
        Pet pet = PetsController.getPet(petId);
        assertEquals(expectedName, pet.getName());
    }

    @Test
    public void testPostPet() {
        String expectedName = "elph";
        String expectedStatus ="true";
        PetsController.postPet();
        Pet pet = PetsController.getPet(57L);
        assertEquals(expectedName, pet.getName());
        assertEquals(expectedStatus,pet.getStatus());
    }

    @Test
    public void testPostPetById() {
        final Long petId = 12L;
        String expectedName="lion";
        String expectedStatus="xxxx";
        PetsController.postPetbyId(petId,expectedName,expectedStatus);
        Pet pet =PetsController.getPet(12L);
        assertEquals(expectedName, pet.getName());
        //Pet pet = PetsController.postPet(petId, expectedName, expectedStatus);
        //assertEquals(expectedName, PetsController);

    }




}

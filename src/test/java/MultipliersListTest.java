import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MultipliersListTest {

	@Test
	public void shouldCreateListOfMultipliersOf3() {
		List<Integer> listMultipliers = MultipliersList.getListMultipliers(3);
		for (Integer integer : listMultipliers) {
			Assert.assertEquals((integer % 3), 0);
		}
	}

	@Test
	public void shouldCreateListOfMultipliersOf5() {
		List<Integer> listMultipliers = MultipliersList.getListMultipliers(5);
		for (Integer integer : listMultipliers) {
			Assert.assertEquals(integer % 5, 0);
		}
	}

	@Test
	public void shouldCreateListOfMultipliersOf1000() {
		List<Integer> listMultipliers = MultipliersList.getListMultipliers(1000);
		for (Integer integer : listMultipliers) {
			Assert.assertEquals(integer % 1000, 0);
		}
	}

	@Test
	public void shouldGet150AsSumOfTheList() {
		List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1, 2,
				3, 4, 5, 6, 7, 0, 2, 50, 10, 10, 50));
		Assert.assertEquals(150, MultipliersList.getSumOfList(integerList));
	}

	@Test
	public void shouldGetSumOfMultiplesOf3And5As() {
		Assert.assertTrue(true);
		Assert.assertEquals(266333,
				MultipliersList.calculateListOfMultipliesOf3or5());
	}

}

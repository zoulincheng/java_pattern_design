package com.zlkj.abstract_docment.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zlkj.abstract_document.domain.Car;
import com.zlkj.abstract_document.domain.HasModel;
import com.zlkj.abstract_document.domain.HasParts;
import com.zlkj.abstract_document.domain.HasPrice;
import com.zlkj.abstract_document.domain.HasType;
import com.zlkj.abstract_document.domain.Part;

import static junit.framework.TestCase.assertEquals;

public class DomainTest {

	private static final String TEST_PART_TYPE = "test-part-type";
	private static final String TEST_PART_MODEL = "test-part-model";
	private static final long TEST_PART_PRICE = 0L;
	
	private static final String TEST_CAR_MODEL = "test-car-model";
	private static final long TEST_CAR_PRICE = 1L;
	
	
	@Test
	public void shouldConstructPart() {
		Map<String, Object> partProperties = new HashMap<>();
		partProperties.put(HasType.PROPERTY, TEST_PART_TYPE);
		partProperties.put(HasModel.PROPERTY, TEST_PART_MODEL);
		partProperties.put(HasPrice.PROPERTY, TEST_PART_PRICE);
		Part part = new Part(partProperties);
		
		System.out.println(part.getType().get());
		System.out.println(part.getModel().get());
		System.out.println(part.getType().get());
		assertEquals(TEST_PART_TYPE, part.getType().get());
		assertEquals(TEST_PART_MODEL, part.getModel().get());
		assertEquals(TEST_PART_PRICE, part.getType().get());
	}
	
	@Test
	public void shouldConstructCar(){
		Map<String, Object> carProperties = new HashMap<>();
		carProperties.put(HasType.PROPERTY, TEST_CAR_MODEL);
		carProperties.put(HasPrice.PROPERTY, TEST_CAR_PRICE);
		carProperties.put(HasParts.PROPERTY, Arrays.asList(new HashMap<>(), new HashMap<>()));
		Car car = new Car(carProperties);
		
		System.out.println(car.getModel().get());
		System.out.println(car.getPrice().get());
		System.out.println(car.getParts().count());
		assertEquals(TEST_CAR_MODEL, car.getModel().get());
		assertEquals(TEST_CAR_PRICE, car.getPrice().get());
		assertEquals(2, car.getParts().count());
	}

}

package com.dhiva.tests;

import org.junit.Test;

import com.dhiva.Mocks.AirCraft;
import com.dhiva.Mocks.AirCraftFunctions;

public class AirCraftTest {

	@Test
	public void test() {
		AirCraft air = new AirCraft(010, "Air", "PASSENGER", "LARGE");
		AirCraft cathay = new AirCraft(020, "cathay", "CARGO", "SMALL");
		AirCraft air1 = new AirCraft(011, "Air", "PASSENGER", "SMALL");
		AirCraft air2 = new AirCraft(015, "Air", "CARGO", "LARGE");
		AirCraft eti = new AirCraft(010, "Eti", "PASSENGER", "LARGE");
		AirCraft eti1 = new AirCraft(010, "Eti", "CARGO", "LARGE");
		AirCraftFunctions.enqueue(air);
		AirCraftFunctions.enqueue(eti);		
		AirCraftFunctions.enqueue(eti1);
		AirCraftFunctions.enqueue(air2);
		AirCraftFunctions.enqueue(cathay);
		AirCraftFunctions.enqueue(air1);
		AirCraftFunctions.dequeue(air);
		System.out.println("air1" + AirCraftFunctions.returnPostion(air1));
		System.out.println("air" + AirCraftFunctions.returnPostion(air));
		//System.out.println("cathay" + AirCraftFunctions.returnPostion(cathay));
		System.out.println("air2" + AirCraftFunctions.returnPostion(air2));
		System.out.println("eti" + AirCraftFunctions.returnPostion(eti));
		System.out.println("eti1" + AirCraftFunctions.returnPostion(eti1));
		System.out.println(AirCraftFunctions.returnList("Air"));
		
		AirCraftFunctions.dequeue(cathay);
		System.out.println("air1" + AirCraftFunctions.returnPostion(air1));
		System.out.println("air" + AirCraftFunctions.returnPostion(air));
		System.out.println("cathay" + AirCraftFunctions.returnPostion(cathay));
		System.out.println("air2" + AirCraftFunctions.returnPostion(air2));
		System.out.println("eti" + AirCraftFunctions.returnPostion(eti));
		System.out.println(AirCraftFunctions.returnList("air"));
		AirCraftFunctions.dequeue(air1);
		AirCraftFunctions.dequeue(eti);
		AirCraftFunctions.dequeue(eti1);
		AirCraftFunctions.dequeue(air2);
	}
}

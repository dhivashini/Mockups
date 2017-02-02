package com.dhiva.tests;

import java.util.HashMap;

import org.junit.Test;

import com.dhiva.Mocks.AirCraft;
import com.dhiva.Mocks.AirCraftFunctions;

public class AirCraftTest {

	@Test
	public void test() {
		AirCraft air = new AirCraft(01, "Air", "PASSENGER", "LARGE");
		AirCraft air1 = new AirCraft(02, "Air", "PASSENGER", "SMALL");
		AirCraft air2 = new AirCraft(05, "Air", "CARGO", "LARGE");
		AirCraft eti = new AirCraft(07, "Eti", "PASSENGER", "LARGE");
		AirCraft eti1 = new AirCraft(06, "Eti", "CARGO", "LARGE");
		AirCraft eti2 = new AirCraft(11, "Eti", "CARGO", "SMALL");	
		AirCraftFunctions.enqueue(eti1);
		AirCraftFunctions.enqueue(air2);
		AirCraftFunctions.enqueue(air1);
		AirCraftFunctions.enqueue(eti2);
		//AirCraftFunctions.enqueue(air);
		AirCraftFunctions.enqueue(eti);	
		
		System.out.println("After position air----");
		System.out.println("air1-" + AirCraftFunctions.returnPostion(air1));
		System.out.println("air-" + AirCraftFunctions.returnPostion(air));
		System.out.println("air2-" + AirCraftFunctions.returnPostion(air2));
		System.out.println("eti-" + AirCraftFunctions.returnPostion(eti));
		System.out.println("eti1-" + AirCraftFunctions.returnPostion(eti1));
		System.out.println("eti2-" + AirCraftFunctions.returnPostion(eti2));

		System.out.println("After list----");
		HashMap<AirCraft,Integer> obj = AirCraftFunctions.returnList("Air");
		for(AirCraft i :obj.keySet()){
			System.out.println(i.getName()+"-"+obj.get(i));
		}
		
		AirCraftFunctions.dequeue();
		System.out.println("After dequeue ----");	
		System.out.println("air1-" + AirCraftFunctions.returnPostion(air1));
		System.out.println("air-" + AirCraftFunctions.returnPostion(air));
		System.out.println("air2-" + AirCraftFunctions.returnPostion(air2));
		System.out.println("eti2-" + AirCraftFunctions.returnPostion(eti2));
		System.out.println("eti-" + AirCraftFunctions.returnPostion(eti));
		System.out.println("eti1-" + AirCraftFunctions.returnPostion(eti1));

		System.out.println("After list---");
		HashMap<AirCraft,Integer> obj1 = AirCraftFunctions.returnList("Air");
		for(AirCraft i :obj1.keySet()){
			System.out.println(i.getName()+"-"+obj1.get(i));
		}
		AirCraftFunctions.dequeue();
		AirCraftFunctions.dequeue();
		AirCraftFunctions.dequeue();
		AirCraftFunctions.dequeue();
		AirCraftFunctions.dequeue();
		System.out.println("After dequeue all----");
		HashMap<AirCraft,Integer> obj2 = AirCraftFunctions.returnList("Air");
		for(AirCraft i :obj2.keySet()){
			System.out.println(i.getName()+"-"+obj2.get(i));
		}
	}
}

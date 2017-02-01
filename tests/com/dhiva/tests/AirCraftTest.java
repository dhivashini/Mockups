package com.dhiva.tests;

import java.util.HashMap;

import org.junit.Test;

import com.dhiva.Mocks.AirCraft;
import com.dhiva.Mocks.AirCraftFunctions;

public class AirCraftTest {

	@Test
	public void test() {
		AirCraft air = new AirCraft(010, "Air", "PASSENGER", "LARGE");
		AirCraft air1 = new AirCraft(011, "Air", "PASSENGER", "SMALL");
		AirCraft air2 = new AirCraft(015, "Air", "CARGO", "LARGE");
		AirCraft eti = new AirCraft(017, "Eti", "PASSENGER", "LARGE");
		AirCraft eti1 = new AirCraft(016, "Eti", "CARGO", "LARGE");
		AirCraft turk = new AirCraft(000, "Emirates", "CARGO", "SMALL" );
		AirCraftFunctions.enqueue(air);
		AirCraftFunctions.enqueue(eti);		
		AirCraftFunctions.enqueue(eti1);
		AirCraftFunctions.enqueue(air2);
		AirCraftFunctions.enqueue(turk);
		AirCraftFunctions.enqueue(air1);
		AirCraftFunctions.dequeue(air);
		System.out.println("air1" + AirCraftFunctions.returnPostion(air1));
		System.out.println("air" + AirCraftFunctions.returnPostion(air));
		System.out.println("air2" + AirCraftFunctions.returnPostion(air2));
		System.out.println("turk" + AirCraftFunctions.returnPostion(turk));
		System.out.println("eti" + AirCraftFunctions.returnPostion(eti));
		System.out.println("eti1" + AirCraftFunctions.returnPostion(eti1));
		HashMap<AirCraft,Integer> obj = AirCraftFunctions.returnList("Air");
		for(AirCraft i :obj.keySet()){
			System.out.println(i.getName()+"-"+obj.get(i));
		}
		
		//AirCraftFunctions.dequeue(turk);
		System.out.println("air1" + AirCraftFunctions.returnPostion(air1));
		System.out.println("air" + AirCraftFunctions.returnPostion(air));
		System.out.println("air2" + AirCraftFunctions.returnPostion(air2));
		System.out.println("eti" + AirCraftFunctions.returnPostion(eti));
		HashMap<AirCraft,Integer> obj1 = AirCraftFunctions.returnList("Air");
		for(AirCraft i :obj.keySet()){
			System.out.println(i.getName()+"-"+obj1.get(i));
		}
		AirCraftFunctions.dequeue(air1);
		AirCraftFunctions.dequeue(eti);
		AirCraftFunctions.dequeue(eti1);
		AirCraftFunctions.dequeue(air2);
	}
}

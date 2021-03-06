package com.dhiva.Mocks;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

import com.dhiva.Mocks.AirCraft;

public class AirCraftFunctions {
	static int position = 0;
	static PriorityQueue<AirCraft> acQueue = new PriorityQueue<AirCraft>(10, new Comparator<AirCraft>() {
//		@Override
//		public int compare(AirCraft o1, AirCraft o2) {
//			if (o1.getType() == "PASSENGER") {
//				return 1;
//			} else if (o1.type == o2.type) {
//				if (o1.getSize() == "LARGE") {
//					return 1;
//				}
//				if (o1.size == o2.size)
//					return 0;
//				return -1;
//			} else
//			return -1;
//		}
		@Override
		public int compare(AirCraft o1, AirCraft o2){
			int o1Value = o1.type.getType()+o1.size.getSize();
			int o2Value = o2.type.getType()+o2.size.getSize();
			return o1Value-o2Value;
		}
	});

	static HashMap<AirCraft, Integer> positionMap = new HashMap<AirCraft, Integer>();

	// O(log(n)) time.
	public static void enqueue(AirCraft ac) {
		acQueue.add(ac);
		position = position +1;
		positionMap.put(ac, position);
	}

	// o(n) time. To update the position value in positionMap.
	public static AirCraft dequeue() {
		if (!acQueue.isEmpty()) {
			AirCraft obj = acQueue.poll();
			positionMap.remove(obj);
			for (AirCraft i : positionMap.keySet())
				positionMap.put(i, positionMap.get(i).intValue() - 1);
			return obj;
		}
		return null;
	}

	// o(1) time.
	public static int returnPostion(AirCraft ac) {
		for (AirCraft i : positionMap.keySet()){
			if(i.equals(ac))
				return positionMap.get(i);
		}
		return 0;		
	}

	// o(n) since the iterator iterates over all the keys in the positionMap.
	public static HashMap<AirCraft, Integer> returnList(String carrierName) {
		HashMap<AirCraft, Integer> obj = new HashMap<AirCraft, Integer>();
		for (AirCraft i : positionMap.keySet()){
			if(i.carrierName == carrierName)
				obj.put(i, positionMap.get(i));
		}
		return obj;

	}

}

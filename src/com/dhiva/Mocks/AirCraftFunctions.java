package com.dhiva.Mocks;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

public class AirCraftFunctions {
	static int position = 0;
	static PriorityQueue<AirCraft> acQueue = new PriorityQueue<AirCraft>(10, new Comparator<AirCraft>() {
		@Override
		public int compare(AirCraft o1, AirCraft o2) {
			if (o1.type.toString().compareTo(o2.type.toString()) > 0) {
				return 1;
			}
			if (o1.type.toString().compareTo(o2.type.toString()) == 0) {
				if (o1.size.toString() == "Large") {
					return 1;
				}
				if (o1.size.toString().compareTo(o2.type.toString()) == 0)
					return 0;
				return -1;
			}
			return -1;
		}
	});

	static HashMap<AirCraft, Integer> positionMap;

	// o(1) time.
	public static void enqueue(AirCraft ac) {
		acQueue.add(ac);
		position++;
		positionMap.put(ac, position);
	}

	// o(1) time. just removing the head of the queue.
	public static AirCraft dequeue(AirCraft ac) {
		if (!acQueue.isEmpty()) {
			AirCraft obj = acQueue.poll();
			positionMap.remove(obj);
			return obj;
		}
		return null;
	}

	// o(1) time.
	public static int returnPostion(AirCraft ac) {
		return positionMap.get(ac);
	}

	// o(n) since the iterator iterates over all the keys in the positionMap.
	public static HashMap<AirCraft, Integer> returnList(String carrierName) {
		HashMap<AirCraft, Integer> obj = new HashMap<AirCraft, Integer>();
		Iterator<AirCraft> i = positionMap.keySet().iterator();
		while (i.hasNext()) {
			if (i.next().getName().equals(carrierName)) {
				obj.put((AirCraft) i, positionMap.get(i));
			}
		}
		return obj;

	}
}

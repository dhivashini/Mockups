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
			if (o1.getType() == "PASSENGER") {
				return 1;
			} else if (o1.type == o2.type) {
				if (o1.getSize() == "LARGE") {
					return 1;
				}
				if (o1.size == o2.size)
					return 0;
				return -1;
			}
			return -1;
		}
	});

	static HashMap<AirCraft, Integer> positionMap;

	// O(log(n)) time.
	public static void enqueue(AirCraft ac) {
		acQueue.add(ac);
		position++;
		positionMap.put(ac, position);
	}

	// o(n) time. To update the position value in positionMap.
	public static AirCraft dequeue(AirCraft ac) {
		if (!acQueue.isEmpty()) {
			AirCraft obj = acQueue.poll();
			positionMap.remove(obj);
			Iterator<Integer> i = positionMap.values().iterator();
			while (i.hasNext()) {
				int pos = i.next();
				pos--;
			}
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

package tez.learn.test;

import java.util.ArrayList;
import java.util.List;

public class Swaps {
	
	public static long howManySwaps(List<Integer> arr) {
		int len = arr.size();
		Integer[] tempArr = new Integer[len];
		
		for(int i=0; i<len ;i++) {
			tempArr[i] = arr.get(i);
		}
		
		long noSwaps=0;
		for(int i=0; i< tempArr.length-2;i++) {
			for(int j=i+1; j<tempArr.length-1;j++) {
				if(tempArr[i] > tempArr[j]) {
					int temp =tempArr[i];
					tempArr[i] = tempArr[j];
					tempArr[j] = temp;
					noSwaps++;
				}
			}
		}
		return noSwaps;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(2);
		System.out.print(howManySwaps(list));

	}

}

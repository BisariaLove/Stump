import java.util.*;
import java.io.*;

class SubsetSum{
	
	
	public List<Integer> subsetSumOfCoins(int[] coins , int t){
		int[] C = numberOfCoinsPerSubtotal(t , coins);
		return makeExactChange(C,t);
	}

	private int[] numberOfCoinsPerSubtotal(int t, int[] coins) {
   		int[] C = new int[t + 1];
    	Arrays.fill(C, Integer.MAX_VALUE);
    	C[0] = 0;// base case
    	for (int coin : coins) {
      		for (int subtotal = 1; subtotal <= t; subtotal++) {
        		if (coin <= subtotal && C[subtotal] > C[subtotal - coin] + 1) {
         		 C[subtotal] = C[subtotal - coin] + 1;
        		}
      		}
    	}
    	return C;
  	}

  	private List<Integer> makeExactChange(int[] C, int t) {
    	List<Integer> result = new ArrayList<Integer>();
    	while (0 < C[t]) {
      		int big = t;
      		while (C[big] <= C[--t]);
      		result.add(big - t);
   		 }
    	return result;
  }
}
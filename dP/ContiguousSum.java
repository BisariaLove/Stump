
public class ContiguousSum {

	static int contiguousSum(int[] arr){
		int pstart = 0, pend = 0, start = 0, end = 0, prevSum = arr[0], curSum = arr[0];
		
		for(int i=1 ; i<arr.length ; i++){
			curSum += arr[i];
			end++;
			
			if(curSum < 0){
				curSum = 0;
				start = end+1;
			}
			
			if(curSum > prevSum){
				prevSum = curSum;
				pstart = start;
				pend = end;
			}
			
			
		}
		System.out.println("Start Index: "+pstart+", End Index: "+pend);
		return prevSum;
	}
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 3, -8, -1, 2, 4, -2, 3};
		int res = contiguousSum(arr);
		System.out.println(res);
	}

}

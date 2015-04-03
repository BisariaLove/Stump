import java.util.*;
public class Knapsack {
	static int calcSolution(int[] sol, int[] arr, int wt, int num){
		
		/*
		 * sol[i][j] = max (1+sol[i-1][w-wi], sol[i-1][j])
		 * 
		 */
		int i=0,weight=0;
		try{
			for( i=0 ; i<num ; i++){
				for(weight =1 ; weight<=wt ; weight++){
						if(arr[i] <= weight)
							sol[weight] = Math.max(sol[weight], arr[i]+sol[weight - arr[i]]);
				}
			}
		}
		catch(Exception e){
			System.out.println("i: "+i+"weight: "+weight);
			e.printStackTrace();
		}
		return sol[wt];
	}
	public static void main(String[] args){
		int wt, num;
		int[] arr;
		int[] sol;
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0 ; i<count ; i++){
			num = sc.nextInt();
			wt = sc.nextInt();
			
			arr = new int[num];
			for(int k=0; k<num ; k++){
				arr[k] = sc.nextInt();
			}
			sol = new int[wt+1];
			
			int res = calcSolution(sol, arr, wt, num);
			System.out.println(res);
		}
	}
}

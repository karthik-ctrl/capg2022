package mocktest2;

import java.util.HashSet;

public class Task1 {
	public static int solution(int[] arr) {
		int n = arr.length;
		HashSet<Integer> set = new HashSet<>();
		for(int a: arr) {
			set.add(a);
		}
		
		for(int i=1;i<=n+1;i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		System.out.println(solution(a));
	
		

	}
	

}

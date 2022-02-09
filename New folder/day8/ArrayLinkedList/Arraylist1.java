package account1;

import java.util.ArrayList;

//Develop a java class with a method public ArrayList<Integer> saveEvenNumbers(int N) {using 
//ArrayList to store even numbers from 2 to N, where N is a integer which 
//is passed as a parameter to the method saveEvenNumbers().
//The method should return the ArrayList (A1) created. In the same class create
//a method printEvenNumbers()which iterates through the arrayList A1 in step 1, 
//and It should multiply each number with 2 and display it in format 4,8,12….2*N. and add these 
//numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned. Create
//a method printEvenNumber(int N) parameter is a number N. 
//This method should search the arrayList (A1) for the existence of the number ‘N’ passed.
//If exists it should return the Number else return zero.Hint:
//Use instance variable for storing the ArrayList A1 and A2. 
//NOTE: You can test the methods using a main method.

 	


public class Arraylist1 {
	ArrayList<Integer> a1=new ArrayList<>();
	public ArrayList<Integer> saveEvenNumbers(int N)
	{
		a1=new ArrayList<Integer>();
		for(int i=1;i<=N;i++)
		{
			if(i%2==0)
			{
				a1.add(i);
			}
		}
		return a1;
	}
	public ArrayList<Integer> printEvenNumbers()
	{
		ArrayList<Integer> a2= new ArrayList<>();
		for(int k:a1)
		{
			a2.add(2*k);
		}
		System.out.println(a2);
		return a2;
		
		
	}
	public void printEvenNumbers(int N)
	{
		for(int k:a1)
		{
			if(k==N)
			{
				System.out.println("Yes");
				break;
			}
			else
			{
				System.out.println("No");
				break;
			}
		}
		//return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Arraylist1 k1=new Arraylist1();
		k1.saveEvenNumbers(10);
		k1.printEvenNumbers();
		k1.printEvenNumbers(2);
	}

}

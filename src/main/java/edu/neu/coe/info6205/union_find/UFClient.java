package edu.neu.coe.info6205.union_find;

import java.util.Random;
import edu.neu.coe.info6205.union_find.UF_HWQUPC;

public class UFClient {
	static int pairCount=0;
	public static void main(String[] args) {
		int[] num= {100,200,400,800,1600};
		for(int i=0;i<num.length;i++)
		{
		int n = num[i];
		pairCount =0;
		UF_HWQUPC ufhwqupc = new UF_HWQUPC(n);    //Takes true value for pathcompression as default this method calls UF_HWQUPC(n,true)
		while(ufhwqupc.components() != 1)
		{
			
		int p= generateRandomly(n);
		int q= generateRandomly(n);
		count();
		//System.out.println("p = "+p+" q = "+q);
		if(p==q)
			continue;
		if(ufhwqupc.connected(p, q)) continue;
		else {	
			ufhwqupc.union(p, q);
			
			
		}
		
		//System.out.println(obj.components());
		
		}
		System.out.println("No. of Sites : "+n+" Count : "+pairCount);
		}
	}
	public static  int generateRandomly(int max) {
	    Random random = new Random();
	    return random.nextInt(max);
	}
	public static int count()
	{
		return pairCount++;
	}

}
import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
	

		public static void main(String args[]) {
		ArrayList<Integer> list;
		
		
		list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();

		for(int k=0; k<n; k++) 
		{
			
			list.add(scan.nextInt());
			
		}
		for (int i = 0; i <list.size(); i++) {
			
		
		    for (int j =list.size() - 1; j > i; j--) {
		    	
		    
		        if (list.get(i) > list.get(j))
		        {
		        	int tmp = list.get(i);
		        	list.set(i,list.get(j));
		        	list.set(j,tmp);
		        	
		        }
		    }
		}
		for (int i:list) {
		    System.out.println(i);
		}
	}
}


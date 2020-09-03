import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) {
	ArrayList<Integer> list;
	
	
	list =  new ArrayList<Integer>();
	Scanner scan  = new Scanner(System.in);
	
	int n = scan.nextInt();

	for(int i=0; i<n; i++) {
		
		list.add(scan.nextInt());
		
	}
		
	int sum = 0;
    for (int i : list)
    {
        sum += i;
    }
    double average = sum / list.size();
    System.out.println( sum);
    System.out.println(average);
	}
}

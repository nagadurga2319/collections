import java.util.List;
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.stream.Collectors; 
 
public class Demo1 { 
 
private static int countDublicates(ArrayList list){ 
 
List<String> distinctList = (List<String>)list.stream().distinct().collect(Collectors.toList()); 
int dublicates = list.size()-distinctList.size(); 
 
return dublicates; 
} 
 
public static void main(String [ ] args){ 
 
	ArrayList<String> list;
	
	
	list = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();

	for(int k=0; k<n+1; k++) 
	{
		
		list.add(scan.nextLine());
		
	}
 
int countDublicates = countDublicates(list); 
 
System.out.println(countDublicates); 
 
} 
} 
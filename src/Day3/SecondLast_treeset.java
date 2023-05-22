package Day3;
import java.util.Scanner;
import java.util.TreeSet;

public class SecondLast_treeset {

	public static void main(String[] args) {
		int size,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of Treeset");
		size=sc.nextInt();
		TreeSet<Integer> set=new TreeSet<>();
		for(i=0;i<size;i++) {
			System.out.println("Enter the value of "+(i+1)+(" th element"));
			set.add(sc.nextInt());
		}
		set.remove(set.last());
		System.out.println("the second last maximum of the tree set is: "+set.last());

	}

}

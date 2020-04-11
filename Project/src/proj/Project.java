package proj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Project {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		/* Scanner in = new Scanner(new File("students.txt"));
		
		
		
			List<String> students = new ArrayList<String>();
			while(in.hasNextLine()) {
				
				students.add(in.nextLine());
			}
			for(int i=0; i < students.size(); i++) {
				
				System.out.println("name: " + students.get(i));
				
		in.close();
		
		*/
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("Caled");
		names.push("Sue");
		names.push("Saly");
		
		ListIterator<String> it = names.listIterator();
		it.hasNext();
		it.next();
		it.next();
		it.add("Susan");
		
		
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		}*/
		for(String s: names) {
			System.out.println(s);
		}
	}
		
}



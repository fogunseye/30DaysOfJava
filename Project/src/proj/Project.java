package proj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(new File("students.txt"));
		
		
		
			List<String> students = new ArrayList<String>();
			while(in.hasNextLine()) {
				
				students.add(in.nextLine());
			}
			for(int i=0; i < students.size(); i++) {
				
				System.out.println("name: " + students.get(i));
				
		in.close();
		
		/*
			*/
			
		}
		
	}
}



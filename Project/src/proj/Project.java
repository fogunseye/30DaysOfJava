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
	
		int[][] data = {
				{4, 6, 3, 10},
				{4, 2, 40, 1},
				{5, 34, 1, 43}
		};

		
		for(int i = 0; i < data.length; i++ ) {
			for(int j = 0; j < data[i].length; j++ )
			System.out.print(data[i][j] + " ");
			
		}
	}
		
}



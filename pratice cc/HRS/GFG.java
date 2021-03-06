// Java code to show implementation of 
// Guava's Table interface 
import java.util.Map; 
import java.util.Set; 

import com.google.common.collect.HashBasedTable; 
import com.google.common.collect.Table; 

class GFG { 

	// Driver method 
	public static void main(String args[]) 
	{ 

		// creating a table to store Student information 
		Table<String, String, String> studentTable = HashBasedTable.create(); 

		// Adding student details in the table 
		// The first field represents the department 
		// of student, second field represents the 
		// Roll no. and third field represents the 
		// student name 
		studentTable.put("CSE", "5", "Dhiman"); 
		studentTable.put("CSE", "7", "Shubham"); 
		studentTable.put("CSE", "9", "Abhishek"); 
		studentTable.put("CSE", "12", "Sahil"); 

		studentTable.put("ECE", "15", "Ram"); 
		studentTable.put("ECE", "18", "Anmol"); 
		studentTable.put("ECE", "20", "Akhil"); 
		studentTable.put("ECE", "25", "Amrit"); 

		// get Map corresponding to ECE department 
		Map<String, String> eceMap = studentTable.row("ECE"); 

		System.out.println("List of ECE students : "); 

		for (Map.Entry<String, String> student : eceMap.entrySet()) { 
			System.out.println("Student Roll No : " + student.getKey() + ", Student Name : " + student.getValue()); 
		} 

		System.out.println(); 

		// get a Map corresponding to Roll no. 12 
		Map<String, String> stuMap = studentTable.column("12"); 

		for (Map.Entry<String, String> student : stuMap.entrySet()) { 
			System.out.println("Student Roll No : " + student.getKey() + ", Student Name : " + student.getValue()); 
		} 
	} 
} 

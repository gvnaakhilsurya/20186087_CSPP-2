public class Solution {
	public static void main(String[] args) {
		// College constructor will have 2 parameters. College name and number of classrooms.
		College college = new College("MSIT-IIITH", 4);

		if (college != null) {
			System.out.println("Testcase 1 Passed");
		} else {
			System.out.println("Testcase 1 Failed");
		}

		// Each class room will be having maximum 4 students only.
		ClassRooms[] classrooms = college.getClassRooms();


		if (college.getClassRoomsCount() == 4) {
			System.out.println("Testcase 2 Passed");
		} else {
			System.out.println("Testcase 2 Failed");
		}

		// Student constructor will take 4 parameters. Name and marks of three subjects.
		classrooms[0].addStudent(new Student("Murthy", 56.70,65.80,76.09));
		classrooms[1].addStudent(new Student("Deepak", 36.70,95.80,46.09));
		classrooms[2].addStudent(new Student("Siva", 55.70,95.80,86.09));
		classrooms[3].addStudent(new Student("Manasa", 86.70,75.80,96.09));
		classrooms[0].addStudent(new Student("ABC", 52.70,69.80,76.09));
		classrooms[0].addStudent(new Student("DEF", 33.70,98.80,46.09));
		classrooms[0].addStudent(new Student("GHI", 54.70,97.80,86.09));
		classrooms[1].addStudent(new Student("JKL", 85.70,76.80,96.09));
		classrooms[1].addStudent(new Student("MNO", 57.70,64.80,76.09));
		classrooms[2].addStudent(new Student("PQR", 38.70,93.80,46.09));
		classrooms[2].addStudent(new Student("STU", 59.70,92.80,86.09));
		classrooms[3].addStudent(new Student("VWX", 80.70,71.80,96.09));

		System.out.println(classroom[2]);
		
		if (classrooms[0].studentsCount() == 4) {
			System.out.println("Testcase 3 Passed");
		} else {
			System.out.println("Testcase 3 Failed");
		}
	}
}
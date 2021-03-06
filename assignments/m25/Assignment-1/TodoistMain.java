import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
  * write your code below this comment
  */
class Task{
	private String title;
	private String assignedTo;
	private int timeToComplete;
	private boolean important;
	private boolean urgent;
	private String status;
	Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status){
		this.title = title;
		this.assignedTo = assignedTo;
		this.timeToComplete = timeToComplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
	}
	 public String gettitle(){
	  return title;
	}
	 
	public void settitle(String title){
	  this.title = title;
	}
	public String getassignedTo(){
	   return assignedTo;
	}
	  
	 public void setassignedTo(String assignedTo){
	   this.assignedTo = assignedTo;
	}
	 public int gettimeToComplete(){
	  return timeToComplete;
	}
	 
	public void settimeToComplete(int timeToComplete){
	  this.timeToComplete = timeToComplete;
	}
	  public boolean getimportant(){
	   return important;
	}
	  
	public void setimportant(boolean important){
	   this.important = important;
	}
	public boolean geturgent(){
	    return urgent;
	}
	   
	public void seturgent(boolean urgent){
	    this.urgent = urgent;
	}
	public String  getstatus(){
	    return status;
	}
	    
	public void setstatus(String  status){
	    this.status = status;
	}
	public void Isimportant(){

		if (getimportant()==true) {
			System.out.println("Important");
		}
		else{
			System.out.println("Not Important");	
			}
		}
	public void Isurgent(){

		if (geturgent()==true) {
			System.out.println("Urgent");
		}
		else{
			System.out.println(" Not Urgent");	
			}

	
	}

	public String toString() {
        String str = "";
        str = str + title +"," + assignedTo +","+ timeToComplete +","+important +","+urgent+","+status;
        return str;
    }
}

class Todoist{
	Task[]tasklist;
	
	Todoist(){
		Task[]tasklist = new Task[40];
	}
	public void addTask(Task task){

	}
}

/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                // case "get-next":
                //     System.out.println(todo.getNextTask(tokens[1]));
                // break;
                // case "get-next-n":
                //     int n = Integer.parseInt(tokens[2]);
                //     Task[] tasks = todo.getNextTask(tokens[1], n);
                //     System.out.println(Arrays.deepToString(tasks));
                // break;
                // case "total-time":
                //     System.out.println(todo.totalTime4Completion());
                // break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        if (!tokens[0].equals("task")) {
        	System.out.println("Title not provided");
        }
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        if (timeToComplete<0) {
        	System.out.println("Invalid timeToComplete<time value>");
        }
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        if (tokens[6].equals("todo") || (tokens[6].equals("done")) ) {
        	System.out.println("Invalid status value");
        	
        }

        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}

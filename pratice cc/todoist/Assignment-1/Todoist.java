class Todoist{
	List<Task> taskslist;

	public Todoist(){
		taskslist = new List<Task>();

	}
	public void addTask(Task task){

	}

	public Task getNextTask(String task){
		return null;
	}
	public Task[] getNextTask(String task,int num_tasks){
		return null;
	}
	public int  totalTime4Completion(){
		return 0;

	}
	public String toString(){
		String str = "";
		for (int i = 0;i < taskslist.size();i++) {
			str += taskslist.get(i);
		}
		return str;
	}



}
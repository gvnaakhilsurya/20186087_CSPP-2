class Todoist{
	List<Task> taskslist;
	int size;

	public Todoist(){
		taskslist = new List<Task>();
		size = taskslist.size();

	}
	public void addTask(Task task){
		taskslist.add(task);
		size++;
	}

	public Task getNextTask(String task_title){
		for (int i = 0;i < size;i++) {
			if (task_title.equals(taskslist.get(i).getTitle())) {
				return taskslist.get(i);
			}
		}
		return null;
	}
	public Task[] getNextTask(String task_title,int tt_tasks){
		return null;
		
	}
	public int  totalTime4Completion(){
		return 0;

	}
	public String toString(){
		String str = "";
		for (int i = 0;i < taskslist.size();i++) {
			str += taskslist.get(i) +"\n";
		}
		return str;
	}



}
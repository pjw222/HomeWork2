package ToDoList;

class Priority {

	private String toDo;
	private int importance;
	public void importance(String toDo, int importance)
	{
		this.toDo=toDo;
		this.importance=importance;
	}	
	public String getPriority()
	{
		return toDo;
	}
	public int getImportanceNum() {
		return importance;
	}
}

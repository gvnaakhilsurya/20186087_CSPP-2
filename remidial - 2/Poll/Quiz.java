class Quiz{

	Question[]list;
	int listsize;

	public Quiz(){
		list = new Question[10];
		listsize = 0;

	}
	public void addQuestion(Question question){
		for (int i = 0;i <list.length;i++) {
			if (list[i]==null) {
				list[i] = question;
				listsize++;
				break;
			}
			
		}

	}
	public int size(){
		return listsize;
	}
	public Question getQuestion(int quesno){
		 return list[quesno];

	}
}
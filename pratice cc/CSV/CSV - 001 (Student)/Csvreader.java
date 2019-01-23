class Csvreader{

	Csvreader[]csv;
	int csize;
	String[] data;

	public Csvreader(String[]data){
		this.data = data;
	}
	public Csvreader(){
		csv = new Csvreader[20];
		csize = 0;
	}
	public void additem(Csvreader ncsv){
		for (int i = 0;i < csv.length;i++) {
			if (csv[i]== null) {
				csv[i] = ncsv;
				csize++;
				break;
			}
		}
	}
	public int size(){
		return csize;
	}
	public void getrow(int num){
		if (num >= csize || num <= 0) {
			System.out.println("Row Not Found Exception");
		}else{
			for (int i = 1;i < csize;i++) {
				System.out.println(csv[num]);
				break;
				
			}
		}

	}
	public String toString(){
		return "date"+" " +"=" +" "+ this.data[0] +"\n"+ "l_ipn"+" "+ "=" +this.data[1]
		 + "\n"+ "r_asn"+"="+ " "+this.data[2]+"\n" +"f" + " "+ "=" + this.data[3] ;
	}
}
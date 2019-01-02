class Parking{
	int slotcount;
	Slot[]slots;
	int carscount;
	public Parking(int slotcount){
		slots = new Slot[slotcount];
		this.carscount = 0;
	}
	public void addToSlot(Slot slot){
		if (carscount == slots.length) {
			resize();
		}
		if (carscount != slots.length) {
			for (int i = 0;i <slots.length;i++) {
				if (slots[i]== null) {
					slots[i] =  slot;
					carscount++;
					break;
				}
			}
		}
	}
	public int carsCount(){
		return this.carscount;

	}
	public Slot getSlot(String person_name){
		for (int i = 0;i < this.carscount;i++) {
			if (slots[i]!= null) {
				if (slots[i].getName().equals(person_name)) {
					return slots[i];
				}
			}
		}
		return null;
	}
	private  void resize() {
        	Slot[] temp = new Slot[2*slots.length];
			System.arraycopy(slots,0,temp,0,slots.length);
			slots = temp;
    } 
	public void removeFromSlot(String person_name){
		for (int i = 0;i < carscount ;i++) {
			if (slots[i].getName()== person_name) {
				slots[i]=null;
				this.carscount--;
			}
		}
	}
	public int getEmptySlots(){
		int count = 0;
		for (int i = 0;i < slots.length;i++) {
			if (slots[i]==null) {
				count++;
			}
		}
		return count;
	}
	public void clearSlots(){
		slots = new Slot[0];
		this.carscount = 0;
	}
	public String toString(){
		String str = "";
		for (int i = 0;i < carscount;i++) {
			if (slots[i]!= null){
				str += slots[i];
				break;
			}
		}
		return str;
	}
}
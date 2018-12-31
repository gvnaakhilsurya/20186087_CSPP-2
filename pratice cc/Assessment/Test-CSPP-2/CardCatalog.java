import java.util.*;
class CardCatalog{
	private int numcards;
	Card[]catalog;
	private int size;


	public CardCatalog(int numcards){
		catalog =  new Card[numcards];
	}
	public CardCatalog(){
		catalog =  new Card[numcards];
		size = 0;
	}

	public void addACard(Card card){
		if(size == catalog.length){
			resize();
		}
		catalog[size++] = card;
		

	}
	public int sizeOfCatalog(){
		System.out.println(size);
		return size;
	}
	private  void resize() {
        	Card[] temp = new Card[2*catalog.length];
			System.arraycopy(catalog,0,temp,0,catalog.length);
			catalog = temp;
    } 
	public Card getCardByTitle(String title){
		int i;
		for (i = 0;i <size ;i++) {
			if(catalog[i]!=null){
			if(catalog[i].getbookTitle().equals(title)){
				return catalog[i];
			}
		}
		}
		return null;
		
	}
	public void removeCard(String title){
		for (int i = 0;i < size;i++) {
			if(catalog[i]!=null){
				if (catalog[i].getbookTitle().equals(title)) {
					catalog[i] = null;
					this.size--;
				}

			}
			
		}

	}
	public void clear(){
		// CardCatalog cc = new CardCatalog(0);
		size = 0;
	}

}
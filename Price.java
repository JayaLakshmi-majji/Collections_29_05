package SetExample;

public class Price {
	String Fruit;
	int price;
	Price(String Fruit,int price){
		this.Fruit=Fruit;
		this.price=price;
	}
	public String toString() {
		return Fruit+" "+price;
	}
}


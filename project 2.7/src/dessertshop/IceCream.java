package dessertshop;

public class IceCream extends DessertItem{
	float quantity;
	public IceCream(float q) {
		quantity=q;
	}
	public float getCost() {
		float cost = quantity*60f;
		float taxamount =(5f/100f)*cost;
		float totalcost = cost+taxamount;
		return totalcost;
	}

}

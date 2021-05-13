package dessertshop;

public class Candy extends DessertItem {
	float quantity;
	public Candy(float q) {
		quantity=q;
	}
	public float getCost() {
		float cost = quantity*2f*60f;
		float taxamount =(5f/100f)*cost;
		float totalcost = cost+taxamount;
		return totalcost;
	}
}

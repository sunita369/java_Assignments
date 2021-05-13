package dessertshop;

public class Cookies extends DessertItem{
	float quantity;
	public Cookies(float q) {
		quantity=q;
	}
	public float getCost() {
		float cost = quantity*3f*7;
		float taxamount =(5f/100f)*cost;
		float totalcost = cost+taxamount;
		return totalcost;
	}
}

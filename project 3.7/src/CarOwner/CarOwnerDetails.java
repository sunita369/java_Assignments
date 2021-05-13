package CarOwner;

import java.util.Comparator;

public class CarOwnerDetails implements Comparable<CarOwnerDetails> {
	
	String ownerName;
	String CarModel;
	int carNo;
	long ownerMobileNo;
	String ownerAddress;
	public CarOwnerDetails(String ownerName, String carModel, int carNo, long ownerMobileNo,
	String ownerAddress) {
	super();
	this.ownerName = ownerName;
	CarModel = carModel;
	this.carNo = carNo;
	this.ownerMobileNo = ownerMobileNo;
	this.ownerAddress = ownerAddress;
	}
	public String getOwnerName() {
	return ownerName;
	}
	public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
	}
	public String getCarModel() {
	return CarModel;
	}
	public void setCarModel(String carModel) {
	CarModel = carModel;
	}
	public int getCarNo() {
	return carNo;
	}
	public void setCarNo(int carNo) {
	this.carNo = carNo;
	}
	public long getOwnerMobileNo() {
	return ownerMobileNo;
	}
	public void setOwnerMobileNo(long ownerMobileNo) {
	this.ownerMobileNo = ownerMobileNo;
	}
	public String getOwnerAddress() {
	return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
	this.ownerAddress = ownerAddress;
	}
	@Override
	public int compareTo(CarOwnerDetails o) {
	// TODO Auto-generated method stub
	return 0;
	}
}
class ParkOrder implements Comparator<CarOwnerDetails>{
@Override
public int compare(CarOwnerDetails e1, CarOwnerDetails e2) {
return e1.getOwnerName().compareTo(e2.getOwnerName());
}



}

package home_project231228;

public class truck extends car {
	
	public int tireSize;

	truck(int displacemnet , int carKg , String carColor , String carMaker , int tireSize){
		super(displacemnet, carKg, carColor, carMaker);
		this.tireSize=tireSize;
	}
	
	
	@Override
	public String toString() {
		return "배기량 : " + super.displacement + " 차중량 : " + super.carKg + " 차색상 : " + super.carColor + " 차메이커 : " + super.carMaker + " 타이어크기 : " + tireSize;
	}
	
}

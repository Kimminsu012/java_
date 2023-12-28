package home_project231228;

public class suv extends car {

	
	
	int tireNum;
	
	protected suv(int displacemnet , int carKg , String carColor , String carMaker , int tireNum){
		super(displacemnet,carKg,carColor,carMaker);
		this.tireNum=tireNum;
	}
	
	@Override
	public String toString() {
		return "배기량 : " + super.displacement + " 차중량 : " + super.carKg + " 차색상 : " + super.carColor + " 차메이커 : " + super.carMaker + " 이륜 or 사륜 : " + tireNum;
	}
}

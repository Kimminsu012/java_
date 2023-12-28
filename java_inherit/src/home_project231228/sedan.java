package home_project231228;

public class sedan extends car{

	public String gear;
	
	sedan(int displacemnet , int carKg , String carColor , String carMaker , String gear){
		super(displacemnet, carKg, carColor, carMaker);
		this.gear=gear;
	}
	
	@Override
	public String toString() {
		return "배기량 : " + super.displacement + " 차중량 : " + super.carKg + " 차색상 : " + super.carColor + " 차메이커 : " + super.carMaker + " 기어 : " + gear;
	}
}

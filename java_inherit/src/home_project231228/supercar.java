package home_project231228;

public class supercar extends car {

	public String engine;

	
	
	protected supercar(int displacemnet , int carKg , String carColor , String carMaker , String engine){
		super(displacemnet,carKg,carColor,carMaker);
		this.engine=engine;
	}
	
	@Override
	public String toString() {
		return "배기량 : " + super.displacement + " 차중량 : " + super.carKg + " 차색상 : " + super.carColor + " 차메이커 : " + super.carMaker + " 엔진 : " + engine;
	}
}

package home_project;

public interface Coffee {
	int cost();
	String Ingredients();
}

class nomalCoffee implements Coffee{

	@Override
	public int cost() {
		return 1500;
	}

	@Override
	public String Ingredients() {
		return "기본 커피";
	}
	
}

abstract class Decorator implements Coffee{
	protected final Coffee Decorator;
	
	public Decorator(Coffee Decorator) {
		this.Decorator=Decorator;
	}
	
	public int Cost() {
		return Decorator.cost();
	}
	
	public String Ingredients() {
		return Decorator.Ingredients();
	}
	
}

class milkDecorator extends Decorator{
	public milkDecorator(Coffee Decorator) {
		super(Decorator);
	}

	@Override
	public int cost() {
		return super.Cost()+500;
	}
	
	public String Ingredients() {
		return super.Ingredients() + "\n우유 추가";
	}
}

class creamDecorator extends Decorator{
	public creamDecorator(Coffee Decorator) {
		super(Decorator);
	}

	@Override
	public int cost() {
		return super.Cost()+1000;
	}
	
	public String Ingredients() {
		return super.Ingredients() + "\n크림 추가";
	}
	
}













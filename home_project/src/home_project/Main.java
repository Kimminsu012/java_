package home_project;



public class Main{
	public static void print(Coffee coffee) {
		System.out.println("금액 : " + coffee.cost() + " ");
		System.out.println("추가 : " + coffee.Ingredients() + " ");
	}
	
	public static void main(String[] args) {
		Coffee nomalCoffee = new nomalCoffee();
		print(nomalCoffee);
		
		System.out.println("\n== 우유 커피 ==");
		Coffee milkCoffee = new milkDecorator(nomalCoffee);
		print(milkCoffee);
		
		System.out.println("\n== 크림 커피 ==");
		Coffee creamCoffee = new creamDecorator(nomalCoffee);
		print(creamCoffee);
		
		System.out.println("\n== 우유 크림 커피 ==");
		Coffee creamMilkCoffee = new milkDecorator(new creamDecorator(nomalCoffee));
		print(creamMilkCoffee);
	}
	
}

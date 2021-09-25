class Animal{
	public void eat(){
		System.out.println("Generic animal eating");
	}
}
class Horse extends Animal{
	public void eat(){
		System.out.println("Horse eating hay, oats, and horse treats");
	}
	public void buck(){}
}
public class TestAnimal{
	public static void main(String[] args){
		Animal a= new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();
		Horse c = new Horse();
		c.buck();
	}
}

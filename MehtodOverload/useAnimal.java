class Animal{}
class Horse extends Animal{}
class useAnimals{
	public void doStuff(Animal a){System.out.println("In the Animal version");}
	public void doStuff(Horse h){System.out.println("In the Horse version");}
	public static void main(String[] args){
		useAnimals ua = new useAnimals();
		Animal animalObj = new Animal();
		Horse horseObj = new Horse();
		ua.doStuff(animalObj);
		ua.doStuff(horseObj); 
	}
}

	
	
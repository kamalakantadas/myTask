class Animal{}
class Horse extends Animal{}
class useAnimals{
	public void doStuff(Animal a){
		System.out.println("In the Animal version");
	}
	public void doStuff(Horse h){
		System.out.println("In the Horse version");
	}
	public static void main(String[] args){
		useAnimals ua = new useAnimals();
		Animal animalObj = new Animal();
		Horse horseObj = new Horse();
		ua.doStuff(animalObj);//Animal version
		ua.doStuff(horseObj); //Horse version
		
		Animal animalRefToHorse = new Horse();
		ua.doStuff(animalRefToHorse);//Animal version// there is rule if parent refer to child during case of overload then parent reference will
		//be the result
	}
}

	
	
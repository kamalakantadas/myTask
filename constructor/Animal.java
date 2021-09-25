class Animal{
/*	String name;
	Animal(String name){
		this.name = name;
	}
	Animal(){
		this(makeRandomName());
	}
	 static String makeRandomName(){
		int x = (int)(Math.random()*5);
		//String[] nameList = {"Fluffy","Fido","Rover","Spike","Gigi"};
		//String name = nameList[x];
		String name = new String[] {"Fluffy","Fido","Rover","Spike","Gigi"}[x];//
		return name;
	}
	public static void main(String[] args){
		Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("zeus");
		System.out.println(b.name);
	}
*/
	void makeNoise(){
		System.out.println("generic Noise");
	}
	
}
class Dog extends Animal{
	void makeNoise(){
		System.out.println("bark");
	}
	void playDead(){
		System.out.println("roll over");
	}
}
interface Moveable{
	void moveIt();
}
interface Spherical{
	void doSphericalThing();
}
interface Bounceable extends Moveable,Spherical{
	void bounce();
	void setBounceFactor();
}
class B implements Bounceable{
	//Bounceable abstract method implementation
	public void bounce(){}	
	public void setBounceFactor(){}
	
	//Moveable abstract method implementation
	public void moveIt(){}
	
	//spherical abstract method implementation
	public void doSphericalThing(){}
}
abstract class Ball implements Bounceable{
	public void bounce(){}
	public void setBounceFactor(){}	
}
class SoccerBall extends Ball{
	public void moveIt(){}
	public void doSphericalThing(){}
	public void bounce(){}//override method from Bounceable

}

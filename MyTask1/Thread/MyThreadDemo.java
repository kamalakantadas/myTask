class Display {
 public void wish(String name){
synchronized(this){ 	for(int i=0;i<10;i++){
 		System.out.print("Good Morning: ");
 		try{
 			Thread.sleep(500);
 		}catch(InterruptedException e){}
 		System.out.println(name);
 	}
 	}
 }
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display dMethod, String name){
		this.d = dMethod;
		this.name = name;
		}
	public void run(){
		d.wish(name);
	}
}
class MyThreadDemo{
	public static void main(String[] args){
		Display d = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d,"Rahul");
		MyThread t2 = new MyThread(d2, "Kamalakanta");
		MyThread t3 = new MyThread(d, "Avantika");
	MyThread t4 = new MyThread(d2, "Aradhaya");
		t2.start();
		t1.start();
		t3.start();
		t4.start();
		}
	}
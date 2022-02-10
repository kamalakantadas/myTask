
class Display{
	public synchronized void wish(String name){
		for(int i=0;i<10;i++){
			System.out.println("Good Morning");
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e ){

			}
		System.out.println(name);
		}
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d, String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}

class SynchronizedDemo{
	public static void main(String[] args){
		Display d1 = new Display();
		Thread t1 = new MyThread(d1,"Dhoni");
		Thread t2 = new MyThread(d1,"Yuvraj");
		t1.start();
		t2.start();
	}
}
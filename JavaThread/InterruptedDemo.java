class MyThread extends Thread{
	public void run(){
		try{
			for(int i=0;i<100;i++){
				System.out.println("Lazy Thread");
				Thread.sleep(5);
				}
			}
			catch(InterruptedException e){
				System.out.println("I got interrupted");
			}
		}

}
class InterruptedDemo{
	public static void main(String[] args){
		Thread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("end of the main");
		}
	}

class MultipleTargetRunnable extends Thread{
	public void run(){System.out.println("hello there check the thread class extends method");}
	public static void main(String[] args){
			//Runnable r = ()->{System.out.println("Target Runnable");};
			Thread t = new Thread(new MultipleTargetRunnable());
			Thread f = new Thread(new MultipleTargetRunnable());
			Thread p = new Thread(new MultipleTargetRunnable());
			t.start();
			try{
				t.join();
			}catch(InterruptedException e){}
			f.start();
			try{
				t.join();
			}catch(InterruptedException e){}
			p.start();
			try{
				t.join();
			}catch(InterruptedException e){}
		}
}
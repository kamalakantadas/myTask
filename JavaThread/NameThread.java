/*class NameRunnable{
	public void run(){
		System.out.println("Name Runnable Running");
		System.out.println("Run by "+Thread.currentThread().getName());
		}

}*/
class NameThread{
	public static void main(String[] args){
			Runnable r = ()->{
					for(int x = 1;x<=3;x++){
						System.out.println("Run by "+Thread.currentThread().getName()+" x is "+ x);
						}
					//System.out.println("Name Runnable Running");
					//Thread.currentThread().getName();
					//System.out.println("Run by "+Thread.currentThread().getName());
			};
			Thread t = new Thread(r);
			Thread u = new Thread(r);
			Thread v = new Thread(r);

			t.setName("Rakesh");
			u.setName("Roshan");
			v.setName("avantika");
			t.start();
			u.start();
			v.start();
			//System.out.println("Name of thread is "+Thread.currentThread().getName());
		}
}
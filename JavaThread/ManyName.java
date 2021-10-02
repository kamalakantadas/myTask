class NameRunnable implements Runnable{
	public void run(){
		for(int i =1;i<4;i++){
			System.out.println("Run by "+Thread.currentThread().getName());
			try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					System.out.println(e);
					}
			}
		}

	}
public class ManyName{
	public static void main(String[] args){
			NameRunnable mr = new NameRunnable();

			Thread t1 = new Thread(mr);
			t1.setName("Rahul");
			/*Thread t2 = new Thread(mr);
			t2.setName("Ramesh");
			Thread t3 = new Thread(mr);
			t3.setName("Avantika");
*/
			t1.start();
			//t2.start();
			//t3.start();

		}
}
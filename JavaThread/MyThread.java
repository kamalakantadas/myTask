abstract class MyThread implements Runnable{
	//public void run(){}
		public static void main(String[] args){
			new Thread(()->System.out.println("Important job running in a runnable")).start();
			}
}


class ThreadJoinZero{

	static Runnable r = ()->{
		for(int x =1;x<10;x++){
			System.out.println("Runnable Thread "+Thread.currentThread().getName()+" Running");
		}};
		public static void main(String[] args){
			Thread t1= new Thread(r);
			Thread t2 = new Thread(r);

			t1.setName("Rahul Thread");
			t1.start();
			try{
				t1.join();//so what will happen here is "Rahul" is complete before "kamalakanta". so lets see
			}
			catch (InterruptedException e){
				System.out.println(e);
			}
			t2.setName("kamalakanta Thread");
			t2.start();
			/*try{
				t2.join();//kamalakanta Thread will complete before Rahul Thread
			}catch (InterruptedException e){
				System.out.println(e);
			}*/

			}
}
class MyThread implements Runnable{
	@Override
	public void run(){
			System.out.println("Runnable Implemented here");
		}

		public static void main(String[] args){
			new Thread(new MyThread()).start();
			}
}
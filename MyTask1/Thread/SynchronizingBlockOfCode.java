class SynchronizingBlockOfCode extends Thread{
		@Override
		public void run(){
			synchronized(this){

				}
		}
		SynchronizingBlockOfCode(StringBuffer s){


				for(int i=0;i<100;i++){
					System.out.println(s);

					}

		}
		public static void main(String[] args){
			StringBuffer ch1 = new StringBuffer("A");

			SynchronizingBlockOfCode sbc1 = new SynchronizingBlockOfCode(ch1);
			SynchronizingBlockOfCode sbc2 = new SynchronizingBlockOfCode(ch1);
			SynchronizingBlockOfCode sbc3 = new SynchronizingBlockOfCode(ch1);
			sbc1.start();
			sbc2.start();
			sbc3.start();
		}
}
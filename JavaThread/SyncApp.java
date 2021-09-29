class Printer{
	//synchronized void printDocuments(int numOfCopies, String docName){
		void printDocuments(int numOfCopies, String docName){
			for(int i =0;i<=numOfCopies;i++){
				try{
					Thread.sleep(500);
				}catch(InterruptedException e){
						e.printStackTrace();
				}
				System.out.println(">> Printing "+docName+" "+i);
			}
		}

}
class MyThread extends Thread{
		Printer pRef;

		MyThread(Printer p){
				pRef = p;
			}
		@Override
		public void run(){
			synchronized(pRef){
				pRef.printDocuments(10, "RahulProfile.pdf");
			}
		}
	}
class YourThread extends Thread{
		Printer pRef;

				YourThread(Printer p){
						pRef = p;
					}
				@Override
				public void run(){
						pRef.printDocuments(10, "AvantikaProfile.pdf");
					}

}



class SyncApp{
	public static void main(String[] args){
			System.out.println("==Application Started==");

			Printer printer = new Printer();
			//printer.printDocument(10, "kamalakantaProfile.pdf");

			MyThread mRef = new MyThread(printer);
			mRef.start();
			/*try{
				mRef.join();
			}
			catch(InterruptedException e){
				e.printStackTrace();
				}*/
			YourThread yRef = new YourThread(printer);
			yRef.start();

			System.out.println("==Application Finished");
		}
}
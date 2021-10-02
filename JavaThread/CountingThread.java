public class CountingThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            if(i%10==0)
            {
                System.out.println("Hello , avantika");
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
           
            
        }
    }
    public static void main(String[] args){
        CountingThread ct = new CountingThread();
        ct.start();
    }
}

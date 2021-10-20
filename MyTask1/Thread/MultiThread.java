class MultiThread{
    public static void main(String[] args){
        //Thread m1 = new Thread(new MultiThread());
        //Thread r1 = new Thread(new MultiThread());
        RahulThread rt = new RahulThread();
        AkanshaThread at = new AkanshaThread();
        rt.setName("Rahul");
        at.setName("Akansha");
        at.start();
        /*try{
            m1.join();//m1 execution complete before r1
        }
        catch(InterruptedException e){}*/
        rt.start();
    }

   //display method is what is synchronized means
   // it can access one thread at a time
   //it static because it access by using class MultiThread
    static synchronized void display(){
        for(int xyz = 0;xyz<5;xyz++){
            try{
                Thread.currentThread().sleep(500);
            }catch (InterruptedException e){
                
            }
            //current Thread Name will print
            //name is set using Access Class RahulThread or Akansh Thread on lin 7 and 8 respectively
            System.out.println(Thread.currentThread().getName()+" is Running with value :"+xyz);
        }
    }
}
//Thread 0 extending Thread class
//override Run method invoke static display() using MultiThread class
class RahulThread extends Thread{
    public void run(){
            MultiThread.display();
    }
}
//Thread 1 extending Thread class
//override run method invoke static display() using MultiThread class
class AkanshaThread extends Thread{
    public void run(){
            MultiThread.display();
    }
}
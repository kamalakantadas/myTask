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
   
    static synchronized void display(){ 
        for(int xyz = 0;xyz<5;xyz++){
            System.out.println(Thread.currentThread().getName()+" is Running with value :"+xyz);
        }
    }
}
class RahulThread extends Thread{
    public void run(){
            MultiThread.display();
    }
}
class AkanshaThread extends Thread{
    public void run(){
            MultiThread.display();
    }
}
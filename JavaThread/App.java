

public class App{
    public static void main(String[] args){
        //MyTask mt = new MyTask();
        //mt.start();//mt is object of MyTask which is implement Runnable interface
        //Thread mt = new Thread(new MyTask());
        //mt.start();
        Runnable r = new MyTask();
        Thread t = new Thread(r);
        t.start();
        
        for(int doc= 0;doc<10;doc++){
            System.out.println("Printing document @@"+doc +" on Main thread");
        }
        System.out.println("Main thread Ended");


        //myTask class method called
      
    }
}
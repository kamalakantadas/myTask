
//MyTask is a thread
class MyTask implements Runnable{    
    public void run(){
        //System.out.println("MyTask Thread");
        for(int doc=0;doc<10;doc++){
            System.out.println("Printing document **"+doc+"on MYTask Thread");
        }
    }
}
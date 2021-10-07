class SynchronizedCounter implements Runnable{
    private int c = 0;
    public  void increment(){
        System.out.println(c++);
    }
    public  void decrement(){
        System.out.println(c--);
    }
    public  int value(){
        return c;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" running");
            increment();
            decrement();
            value();
        }

    }
    public static void main(String[] args){
        System.out.println(Runtime.getRuntime().availableProcessors());
        SynchronizedCounter counter = new SynchronizedCounter();
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t1.setName("Rahul");
        t2.setName("Akansha");

        t1.start();
        t2.start();
    }

}
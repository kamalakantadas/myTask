Class MyThread implements Runnable{
    public void run(){
        System.out.println("Implementing Runnable Interface");
    }
    
    public static void main(String[] args){
        MyThread mt = new MyThread();
        my.start();
    }
}

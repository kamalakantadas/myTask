class MyRunnableThread implements Runnable{
    public void run(){
        System.out.println("Implementing Runnable Interface");
    }
    
    public static void main(String[] args){
        MyRunnableThread mt = new MyRunnableThread();
        mt.run();
    }
}

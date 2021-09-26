class MyRunnableThread implements Runnable{
    public void run(){
        System.out.println("Implementing Runnable Interface");
    }
    
    public static void main(String[] args){
        Thread mt = new Thread(new MyRunnableThread());
        mt.start();
    }
}

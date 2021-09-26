class MyThread extends Thread/*Extending Thread class*/{
    public void run(){
        System.out.println("Thread Class Running");
    }
    public static void main(String[] args){
        MyThread th= new MyThread();
        th.start();
    }
}
class SampleException{
    public static void main(String[] args){
        try{
            int x = 5/0;

        }
        catch(ArithmeticException e){
            System.out.println("Number cant be divided to zero");
        }
    }
}
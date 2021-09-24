class SampleException{
    public static void main(String[] args){
        try{
            //int x = 5/0; 
            int x = Integer.parseInt("hello");
        }
        catch(ArithmeticException e){
            System.out.println("Number cant be divided to zero");
        }
        catch(NumberFormatException e){
            System.out.println("String cant be assigned to int");
        }
    }
}
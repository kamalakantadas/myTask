class SampleException{
    static void avg() throws ArithmeticException{
        System.out.println("inside the function avg");
        throw new ArithmeticException("check");
    }
    public static void main(String[] args){
        try{
            //int x = 5/0; 
            avg();
            int x = Integer.parseInt("hello");
        }
        catch(ArithmeticException e){
            System.out.println("Number cant be divided to zero");
        }
        catch(NumberFormatException e){
            System.out.println("String cant be assigned to int");
        }
        catch(Exception e){
            System.out.println("check exceptin caught");
        }
    }
}
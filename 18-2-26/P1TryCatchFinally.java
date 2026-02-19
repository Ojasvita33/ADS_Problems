public class P1TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("The program is starting from here");
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("The result is: "+c);
        }catch(ArithmeticException ae){ //(Exception) when you don't know what excep
        System.out.println("Exception caught: "+ae);
        }finally{
            System.out.println("This is always excutable");
        }
        System.out.println("The program has ended");
    }
}
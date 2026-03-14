public class P2AgeValid {
    public static void main(String[] args) {
        int age=5;
        try{
            if(age<18){
                throw new ArithmeticException("You are not eligible for the vote");
            }
            System.out.println("You are eligible for the vote");
        }catch(Exception e){
                System.out.println("Exception: "+e.getMessage());
            }
        
    }
}
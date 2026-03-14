public class P2Inherit{
    public static void main(String[] args){
        child c = new child();
        c.details();
        c.dsa();
        c.impl();
    }
}

class Parent{
    void details(){
        System.out.println("This is Dsa class");
    }

    void dsa(){
        System.out.println("We are learning dsa");
    }
}

class child extends Parent{
    void impl(){
        System.out.print("We are implementing dsa using java");
    }
}

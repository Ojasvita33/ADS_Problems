public class P4MethodOverride {
        public static void main(String[] args){
        Child c = new Child();
        c.details();
    }
}

class Parent{
    void details(){
        System.out.println("we are on mission");
    }
}

class Child extends Parent{
    @Override
    void details(){
        System.out.println("Mission completed");
    }
}

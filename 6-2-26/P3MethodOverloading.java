public class P3MethodOverloading {
    public static void main(String[] args) {
    Student s=new Student();
    s.details();
    s.details(2);
    s.details(2,1.5f);
    }
}
class Student{
    void details(){
        System.out.println("This is G31");
    }
    void details(int a){
        System.out.println("We are learning DSA");
    }
    void details(int a,float b){
        System.out.println("We are implementing DSA using java");

    }
}

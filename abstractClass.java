abstract class A{

    abstract public void fun1();

    public void fun2(){
        System.out.println("Hello");
    }
    public void fun3(){
        System.out.println("Hello");
    }
}
class B extends A{
    @Override
    public void fun1() {
        System.out.println("helljskehwjk");
    }

}
public class abstractClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.fun1();
    }
}

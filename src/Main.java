class Assignment{
    public int a;
    public Assignment(int number){
        this.a = number;
    }
}
class Arguments{
    public String name;

    public Arguments(String name){
        this.name = name;
    }

}
public class Main {
    public static void main(String[] args) {
        Assignment as1 = new Assignment(12);
        Assignment as2 = as1;
        Assignment as3 = as2;
        System.out.println(as3.a);
        as2.a = 10;
        System.out.println(as1.a);
        as3.a = 13;
        System.out.println(as1.a);
        Arguments arg = new Arguments("Denys");
        System.out.println(arg.name);
        methodWithArguments(arg);
        System.out.println(arg.name);
    }
    public static void methodWithArguments(Arguments arg){
        arg.name = "Petro";
    }
}
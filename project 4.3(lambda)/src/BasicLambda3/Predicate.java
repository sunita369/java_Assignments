package BasicLambda3;

@FunctionalInterface
interface Predicat<String>{
    boolean test(String p);
}
public class Predicate {
    public static void main(String[] args){
    java.util.function.Predicate<String> pfunc= p->p.length()>5;
    System.out.println("The Outputs will be:");
    System.out.println(pfunc.test("Sunita"));
    System.out.println(pfunc.test("Megha"));
}}

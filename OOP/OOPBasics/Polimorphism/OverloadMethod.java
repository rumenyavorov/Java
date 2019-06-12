package OOP.OOPBasics.Polimorphism;

public class OverloadMethod {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        OverloadMethod overMeth = new OverloadMethod();

        System.out.println(overMeth.add(2, 2));
        System.out.println(overMeth.add(3, 3, 3));
        System.out.println(overMeth.add(4, 4, 4, 4));
    }
}

package JAVA.WrapClass;

public class example3 {
    public static void main(String[] args) {
        Integer i1=Integer.valueOf("123");
        int c=i1.intValue();
        System.out.println(c);
        System.out.println();

        Integer i2=Integer.valueOf("101010",2);
        int c1=i1.intValue();
        System.out.println(c);
        System.out.println();

        Float f=Float.valueOf("52.656");
        float f1=f.floatValue();
        System.out.println(f1);
        System.out.println();


        int x=Integer.parseInt("562");
        System.out.print(x);
        System.out.println();

        double y=Double.parseDouble("546.65");
        System.out.println(y);


    }
    
}

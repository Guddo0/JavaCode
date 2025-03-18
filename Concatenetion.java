package JAVA.OPPs.ClassAndObject;

public class Concatenetion {
    public static void main(String[] args) {
        String fstName="Md";
        String lastName="Sofiyan";
        //String fullName=fstName+" "+lastName;
        //System.out.println(fullName);

        String fullName=fstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
    }
    
}

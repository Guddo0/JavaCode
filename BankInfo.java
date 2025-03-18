package JAVA.OPPs.ClassAndObject;
class Bank{
    String accountHolderName;
    String openingDate;
    double accountNumbner;
    String accountType;
    public
    void createAccount(String name, String date, double acnumber,String acType){
        accountHolderName=name;
        openingDate=date;
        accountNumbner=acnumber;
        accountType=acType;

        System.out.println("Account Created!");
    }
    void showInfo(){
        System.out.println(accountHolderName);
        System.out.println(openingDate);
        System.out.println(accountNumbner);
        System.out.println(accountType);
    }
}

public class BankInfo {
    public static void main(String[] args) {
        Bank sofiyan=new Bank();
        sofiyan.createAccount("Sofiyan","1 January 2022",12325456,"Saving");
        sofiyan.showInfo();
        
    }
    
}

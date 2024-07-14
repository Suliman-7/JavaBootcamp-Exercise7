//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Account A001 = new Account("189902","Omar",3200);
        Account A002 = new Account("129330","Saad",7000);
        Account A003 = new Account("177421","Ali",9000);

        Employee E001 = new Employee("102294" , "Khalid" , 5000) ;
        Employee E002 = new Employee("133940" , "Osamah" , 8000) ;
        Employee E003 = new Employee("129903" , "Nawaf" , 10000) ;

        A001.setId("166778");
        System.out.println(A001.getId());
        A002.setName("Rami");
        System.out.println(A002.getName());
        A003.setBalance(10000);
        System.out.println(A003.getBalance());

        E001.setId("113840");
        System.out.println(E001.getId());
        E002.setName("Mohammed");
        System.out.println(E002.getName());
        E003.setSalary(5000);
        System.out.println(E003.getSalary());

        System.out.println(A001.toString());
        System.out.println("Credit 800");
        A001.credit( 800);
        System.out.println(A001.toString());

        System.out.println("----------------------------------------------");



        System.out.println(A002.toString());
        System.out.println("Debit 2000");
        A002.debit(2000);
        System.out.println(A002.toString());

        System.out.println("----------------------------------------------");



        System.out.println(A002.toString());
        System.out.println(A003.toString());
        System.out.println("Transfer from A001 to A002 , amount : 2000 ");
        A002.transferTo(A003 , 2000);
        System.out.println(A002.toString());
        System.out.println(A003.toString());

        System.out.println("----------------------------------------------");

        System.out.println(E001.toString());
        System.out.println("Salary raised 10% ");
        E001.raisedSalary(10);
        System.out.println(E001.toString());

        System.out.println("----------------------------------------------");
        System.out.println(E002.toString());
        System.out.println("Annual Salary : ");
        System.out.println(E002.getAnnualSalary());








    }
}
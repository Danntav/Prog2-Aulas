public class CommissionEmployeeTeste {

    public static void main(String[] args) {

       CommissionEmployee employee1 = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, 0.6);

       System.out.println("Employee information obtained by methods: \n");
       System.out.printf("%s %s\n", "First Name is", employee1.getFirstName());
       System.out.printf("Last name is %s\n", employee1.getLastName());
       System.out.printf("Social security number is %s\n", employee1.getSocialSecurityNumber());
       System.out.printf("Gross sales is %.2f\n", employee1.getGrossSales());
       System.out.printf("Commission rate is %.2f\n", employee1.getCommissionRate());

       employee1.setGrossSales(500);
       employee1.setCommissionRate(.1);


       System.out.printf("\n%s:\n\n%s\n","Updated information obtained by toString", employee1);
       

    }
}

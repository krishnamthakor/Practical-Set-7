public class AccountHolder
{
    int age;
    double income;
    float experience;
    String citizenship;
    boolean eligiblity;
 
    // default constructor
    AccountHolder(int age, double income, float experience, String citizenship)
    {
        this.age=age;
        this.income=income;
        this.experience=experience;
        this.citizenship=citizenship;
    }
 
    // checks if the account holder is eligible for a loan or not
    public String eligiblity()         
    {
        if(age>=21 && age<=60 && income>=15000 && experience>=1 && citizenship.equals("India"))
        {
            System.out.println("Account details: ");
            System.out.println("Age: " + this.age);
            System.out.println("Income: " + this.income);
            System.out.println("Experience: " + this.experience);
            System.out.println("Citizenship: " + this.citizenship + "n");
            return "eligible.";
        }
        else
        {
            return "not eligible.";
        }
    }
}
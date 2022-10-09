//ID : 21CE142
//Name : Krishna M. Thakor
//Aim : Personal Loan Eligibility Criteria for Salaried Applicant is as follows:
//Eligible Age Group - 21 years to 60 years
//Minimum Net Monthly Income - Rs. 15,000
//Minimum Total Work Experience - 1 year
//Citizenship – Indian
//Create a class AccountHolder to store above given information entered by a user. Create 5 objects of AccountHolder class and store them in an ArrayList. Display names of account holders , who are eligible to get a loan based on given criteria.


import java.util.ArrayList;
import java.util.Scanner;
 
public class Practical3 
{
    public static void main(String[] args) 
    {
        // creating arraylist
        ArrayList<AccountHolder> ah = new ArrayList<>();
 
        int i=1;
 
        // loop to add account holder details
        while(i<6)
        {
            System.out.print("\nEnter Details of Account Holder " + i + " :\n");
            System.out.print("Enter Age : ");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
 
            System.out.print("Enter Net Monthly Income : ");
            double income = input.nextDouble();
 
            System.out.print("Enter work experience in years : ");
            float experience = input.nextFloat();
 
            System.out.print("Enter name of your country : ");
            String citizenship = input.next();
 
            ah.add(new AccountHolder(age, income, experience, citizenship));
 
            i++;
        }
 
        // prints if the account is eligible or not and its details if it is eligible
        for(int j=1; j<ah.size()+1; j++)
        {
            System.out.println("\nAccount Holder " + j + " is " + ((AccountHolder) ah.get(j-1)).eligiblity());
        }
        
        System.out.println("\nID : 21CE142 \nName : Krishna M. Thakor");
    }
} 

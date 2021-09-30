import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankTest{
    public static void main(String[] args){
        BankAccount andrew = new BankAccount();
        andrew.depositChecking(100);
        System.out.println(andrew.getChecking());
        andrew.depositSaving(100);
        System.out.println(andrew.getSaving());
        System.out.println(andrew.getTotal());
        System.out.println(BankAccount.accountCount());
        System.out.println(BankAccount.moneyTotal());
        andrew.withdrawChecking(50);
        System.out.println(andrew.getChecking());
        andrew.withdrawSaving(200);
        System.out.println(andrew.getSaving());
    }
}
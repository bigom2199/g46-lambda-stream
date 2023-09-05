package lexicon.se.utilExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

        /*
        Consumer<T>
        void accept(T t);
        Ues Cases:
        printing elements of a collection
        Modifying elements in a collection
        Performing actions on elements during iteration.
         */



    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>() ;
        Account account1 = new Account("DEV1" ,Role.ROLE_USER) ;
        account1.activate();
                Account account2= new Account("DEV2" ,Role.ROLE_USER) ;
        Account account3 = new Account("DEV3", Role.ROLE_USER) ;
        account2.activate();
        Account account = new Account("MANAGER1",Role.ROLE_ADMIN) ;
        Account account4 = new Account("MANAGER2" ,Role.ROLE_ADMIN) ;
        System.out.println("----------");
        Consumer<Account> printAccountInfo = (account5) -> System.out.println(account.getUsername() +" " + account.getRole());
        Consumer<Account> printAccountDetails= (account5) -> System.out.println(account.getUsername()+"" + account.getRole());
        accounts.forEach((printAccountInfo));
        accounts.forEach((printAccountDetails));
        accounts.forEach(account5->account.activate());

    }
}

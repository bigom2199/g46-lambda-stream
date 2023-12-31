package lexicon.se.utilExamples;

import jdk.internal.joptsimple.internal.Strings;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        String[] strings = {"I","Love","Java!"} ;
        Function<String[], String> arrayToString = array-> {
            String result = " " ;
            for(String element : array) {
                result = result + element;

            }
            return result;
        };
        System.out.println(arrayToString.apply(strings));
        Function<Account,String> extractuserPass = (account) ->account-getUsername()+ " " + account.getPassword();
        Account account = new Account("user",Role.ROLE_USER) ;
        System.out.println(extractuserPass.apply(account));



    }
}

package Emailvalidation;

import java.util.Scanner;

public class Emailsearch {

	private static Scanner var;
	
	public static void main(String[] args) {
		String[] emailList = {"perugusoujanya2018@gmail.com", 
				"perugusathish978@gmail.com", "perugurajesh987@gmail.com",
				"perugusaisrikar@gmail.com","perugumadhavi@gmail.com"};

          var = new Scanner(System.in);
        System.out.print("Enter email ID to search:");
        String searchEmail = var.nextLine();

        boolean found = searchEmail(emailList, searchEmail);

        if (found) {
            System.out.println(searchEmail + " is in the list.");
        } 
        else {
            System.out.println(searchEmail + " is not in the list.");
     
        }
        
        
    }
	
    public static boolean searchEmail(String[] emailList, String searchEmail) {
        for (String email : emailList) {
            if (email.equals(searchEmail)) {
                return true;
            }
        }
        return false;
    }

	}



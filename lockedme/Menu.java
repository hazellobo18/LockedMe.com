package lockedme;

import java.util.Scanner;


public class Menu {
	public static void main(String[] args){
		System.out.println("-----------------------\nWelcome to LockedMe.com\n-----------------------\n");
		System.out.println(" Developer By-");
		System.out.println(" 	Hazel Lobo\n 	BNP Paribas-Batch 2\n");
		
		while(true){
		System.out.println("Enter the choice\n 1.Retrieving the file names in an ascending order\n "
				+ "2.More Operations\n 3.Close the application\n");
		int ch = new Scanner(System.in).nextInt();

		switch(ch) {
		case 1: new RetrieveFiles().retrieve();
				break;
				
		case 2: Menu.Operations();
				break;
				
		case 3: System.out.println("Exiting Application....");
				System.exit(0);
				
		}
	}
		
	}



	static void Operations(){
		
		while(true){
		System.out.println("Select choice:\n 1. Add file\n 2. Delete file\n 3. Search File\n 4. Navigate to Main Menu\n");
		int choice= new Scanner(System.in).nextInt();
		switch(choice){
			case 1: System.out.println("Enter filename you want to add");
					String filename=new Scanner(System.in).nextLine();
					new Operator().add(filename);
					break;

			case 2: System.out.println("Enter filename you want to delete");
					String filename1=new Scanner(System.in).nextLine();
					new Operator().delete(filename1);
					break;

			case 3: System.out.println("Enter filename you want to search");
					String filename2=new Scanner(System.in).nextLine();
					new Operator().search(filename2);
					break;

			case 4: System.out.println("Navigating Back \n");
					return;
					//break;
				}
		}//while end
	}//switch end
	
}	
	

	
	
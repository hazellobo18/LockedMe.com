package lockedme;

import java.util.Scanner;
import java.io.File;
import java.util.Arrays;


class RetrieveFiles{
    public void retrieve(){
        File temp;
   		System.out.println("Enter the folder path/name you want to retrieve" );
      	String input= new Scanner(System.in).nextLine();
        File dir= new File(input);  
        
        if(dir.isDirectory()){
        File [] files= dir.listFiles();

       // for(int i=0; i<files.length-1;i++)
         //   System.out.println(files[i]);
		Arrays.sort(files);  //SORTING 
          
		System.out.println("Sorted Order");
		System.out.println("--------------------------------");
		for(File f: files)
			System.out.println(f.getName());

		}else{
				
			System.out.println(dir.getAbsolutePath() + " is not a directory");
		}            

	        
	    }//fucntion end
}
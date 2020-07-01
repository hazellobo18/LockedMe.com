package lockedme;

import java.io.File;
import java.io.IOException;

class Operator{

 void add(String filename){
      try {

	     File file = new File(filename);	
         boolean check = file.createNewFile();
	     if (check){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println(file.getName()+" already exists at this location");
	     }
    	} catch (IOException e) {
    		System.out.println("Exception Occurred:");
	        e.printStackTrace();
	  }
   }



void delete(String filename){
	try{         
		File file= new File(filename);    
		if(file.delete()){                        
			System.out.println(file.getName() + " deleted successfully");   //getting and printing the file name  
		}  
		else{  
			System.out.println("File not found");  
		}  
	}catch(Exception e){  
			e.printStackTrace();  
	}  

}

void search(String filename){

	File file = new File(filename); 
    if (file.exists()) 
        System.out.println("Filename: "+file.getName()+" exists at location "+file.getAbsolutePath()); 
    else
        System.out.println("Filename: "+file.getName()+" does not exists."); 
    } 

	
}
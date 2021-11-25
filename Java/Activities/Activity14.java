package Activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
		File file = new File("C:\\Users\\IBMADMIN\\Documents\\Newtxt.txt");
		boolean fStatus = file.createNewFile();
		
			if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }
		
			//Write some data to file
			Scanner scan = new Scanner(System.in);
			String data = scan.nextLine();
			
			FileWriter myWriter = new FileWriter("C:\\Users\\IBMADMIN\\Documents\\Newtxt.txt");
			myWriter.write(data);
			myWriter.close();
            //get the file Object
            File fileUtil = FileUtils.getFile("C:\\\\Users\\\\IBMADMIN\\\\Documents\\\\Newtxt.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
 
            //Create directory
            File destDir = new File("C:\\Users\\IBMADMIN\\Downloads\\resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);
 
            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "Newtxt.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
		}

	}



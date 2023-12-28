
package Forms;


import java.io.*;
import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
        
public class fileHandling {
    
    public void read(){
        try {
            File file = new File("C:\\Everbooks\\books.txt"); // change path
            Scanner sc = new Scanner(file);
            //debug purpose
            //int i = 0; 
            while (sc.hasNextLine()){ 
                MainMenuUI.title.add(sc.nextLine());
                MainMenuUI.author.add(sc.nextLine());
                MainMenuUI.price.add(Integer.valueOf(sc.nextLine()));
                if (sc.hasNextLine())
                    sc.nextLine();
                
                //debug purpose
                //System.out.printf("%s %s %d \n", title.get(i), author.get(i), price.get(i++));
            }
          } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e);
        }
    }
    
    
    
    public void write(String name, String date, String mop, String address, ArrayList<String> bookOrders, int total){
        
        try{
            String bookDetails = "";
            for (int i = 0; i < bookOrders.size(); i++){
                bookDetails += bookOrders.get(i);
                if (i != bookOrders.size() - 1) 
                    bookDetails += "\n";
            }
            
                                                           // gawa muna kayo ng folder (transactions) and change path
                                                           // separate na nyan na rerecord ung mga transactions for each account
                                                           // unlike dun sa nauna na "Everbooks Transactions" doon lahat narerecord
                                                           // yung mga transactions :))
            FileWriter file = new FileWriter(String.format("C:\\Everbooks\\transactions\\%s.txt", LoginFormUI.username), true); 
                                                                                                                                
            file.write(String.format("""
                                     %s
                                     %s
                                     %s
                                     %s
                                     %s
                                     ₱%d
                                     
                                     """, name, date, mop, address, bookDetails, total));
            file.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("error");
        }
    }
}
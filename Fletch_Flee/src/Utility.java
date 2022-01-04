import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Utility {
    
//########################################## Class Attributes ############################################
    private static String USERNAME;
    private static String PASSWORD;
    
// ###################### Setter Getter Methods ########################
    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    
//########################################### Class Methods ###########################################
    public void infoWriter(String line,String fileName){
        //password, username, name, number of people, seat selection, date, start,end cost
        try {
            FileWriter myWriter = new FileWriter(fileName,true);
            myWriter.write(line);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public String getPassword(String username) throws FileNotFoundException{
        
        String got_The_Full_info="";
        Scanner input = new Scanner(new FileInputStream("login.txt"));
        while(input.hasNextLine()) {
           String line = input.nextLine();
           //System.out.println(line);
           if(line.contains(username)) {
               //System.out.println(line);
              got_The_Full_info = line;
           }
        }
        
        String word[] = got_The_Full_info.split(",");
        //String username = word[0]; 
        String password = word[1];
        return password;
    }
    
    public void clearFile(String filepath){
        try {
            FileWriter myWriter = new FileWriter(filepath);
            myWriter.write("");
            myWriter.close();
            System.out.println("Successfully Clear the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    
    public String getRandomTrain(){
        String[] TRAIN_NAME = {"Suborno Express","Mohanagar Provati","Ekota Express","Tista Express"
        ,"Parabat Express","Upakul Express","Karatoya Express","Kapotaksha Express","Jayantika Express"
        ,"Paharika Express","Mohanagar Express","Udayan Express","Sundarban Express","Rupsha Express"
        ,"Meghna Express","Barendra Express","Titumir Express","Agnibina Express","Egarosindhur Provati"
        ,"Upaban Express","Turna Express","Brahmaputra Express","Jamuna Express","Simanta Express"
        ,"Egarosindhur Godhuli","Lalmoni Express","Silkcity Express","Madhumati Express","Drutojan Express"
        ,"Padma Express","Sagardari Express","Chitra Express","Nilsagar Express","Dolonchapa Express"
        ,"Dhumketu Express","Rangpur Express","Kalni Express","Sirajganj Express","Haor Express","Dhalarchar Express"
        ,"Kishoreganj Express","Tungipara Express","Bijoy Express","Shonar Bangla Express"
        ,"Mohanganj Express","Banalata Express","Panchagarh Express","Benapole Express","Kurigram Express","Jamalpur Express"
        ,"Chattala Express","Banglabandha Express"};
        
        int randomIndex = (int)(Math.random() * 51);
        return TRAIN_NAME[randomIndex];
    }
    
    
}

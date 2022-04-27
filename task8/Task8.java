package task8;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Task8 {
    public static void main(String[] args) {
        try{
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("file.txt"));
            for (int i = 0; i < 101; i++){
                int a = (int)(Math.random()*100)+1;
                String mess = String.valueOf(a);
                writer.write(mess + " ");
            }
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

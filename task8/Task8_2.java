package task8;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Task8_2 {

    public static void main(String[] args) {
        try{
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("file7_2.txt"));
            for (int i = 0; i < 101; i++){
                int a = (int)(Math.random()*100)+1;
                String bin = Integer.toBinaryString(a);
                writer.write(bin + " ");
            }
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac2;
import java.util.Scanner;
import java.util.Formatter;
/**
 *
 * @author Riko Wolhuter
 */
public class Prac2 {

    /**
     * @param args the command line arguments
     */
    private static String moduleName;
    private static int numElements;
    
    public static String getModuleName() {
        return moduleName;
    }

    public static void setModuleName(String moduleName) {
        Prac2.moduleName = moduleName;
    }
    

    public static int getNumElements() {
        return numElements;
    }

    public static void setNumElements(int numElements) {
        Prac2.numElements = numElements;
    }
    
    public static int[] arrResults = new int[getNumElements()+1];
    

    
    public static double calculateAverage(){
        double avg = 0;
        
        int total=0;
        
         
        for (int j = 1; j<getNumElements()+1;j++){
            
         
         
         total = total + arrResults[j];
         
            
            
        }
        
        avg = total/getNumElements();
        
        
        return avg;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String moduleName;
        int numElements;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the module name: ");
        moduleName = input.nextLine();
        setModuleName(moduleName);
        System.out.print("Enter the number of student results you want to capture: ");
        numElements = input.nextInt();
        setNumElements(numElements);
        int[] arrResults = new int[getNumElements()+1];
        for(int i =1;i<getNumElements()+1;i++){
            
            System.out.print("Enter student " + i + " result: ");
            arrResults[i] = input.nextInt();
            if ((arrResults[i]<0) || arrResults[i]>100){
                
                System.out.println("Please enter a result greater or equal to zero and less than hundred");
                i = getNumElements()+1;
            }
            
            
        }
        
        double avg = 0;
        
        int total=0;
        
        System.out.println("--------------------------------------------");
        System.out.println(getModuleName() + " RESULTS REPORT");
        System.out.println("--------------------------------------------");
        
        
        for (int j = 1; j<getNumElements()+1;j++){
            
         System.out.println("STUDENT: "+ j +" RECEIVED: " + arrResults[j] + "%");
         
         total = total + arrResults[j];
         
            
            
        }
        System.out.println("--------------------------------------------");
        avg = total/getNumElements();
        
        //System.out.printf("%-25s %-10d\n%-25s %-10.1f %"
            //    ,"STUDENT COUNT:",getNumElements()
             //   ,"AVERAGE RESULT:",avg );
        Formatter formatAvg = new Formatter();
        formatAvg.format("%,.1f", avg);
        System.out.println("STUDENT COUNT: " + getNumElements());
        System.out.println("AVERAGE RESULT: "+ avg + "%");
        
        System.out.println("\n--------------------------------------------");
}
}

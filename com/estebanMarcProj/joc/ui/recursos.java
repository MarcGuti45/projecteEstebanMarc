package com.estebanMarcProj.joc.ui;

import java.util.Scanner;
import com.estebanMarcProj.utils.BoxDrawing;

public class Recursos{
    public static void showTable(String [] args){
        int posicio [] = new int [42];
    
        for (int i = 0; i < posicio.length; i++) {
            posicio [i] = i+10;
        }
            System.out.println("");                      
            System.out.println("| " + posicio[17] + " | " + posicio[16] + " | " + posicio[15] + " | " + posicio[14] + " | " + posicio[13] + " | " + posicio[12] + " | " +posicio[11] + " |");
            System.out.println("------------------------------------");
            System.out.println("| " + posicio[18] + " | " + posicio[33] + " | " + posicio[32] + " | " + posicio[31] + " | " + posicio[30] + " | " + posicio[29] + " | " +posicio[10] + " |");
            System.out.println("------------------------------------");
            System.out.println("| " + posicio[19] + " | " + posicio[34] + " | " + posicio[41] + " | " + posicio[40] + " | " + posicio[39] + " | " + posicio[28] + " | " +posicio[9] + " |");
            System.out.println("------------------------------------");
            System.out.println("| " + posicio[20] + " | " + posicio[35] + " | " + posicio[36] + " | " + posicio[37] + " | " + posicio[38] + " | " + posicio[27] + " | " +posicio[8] + " |");
            System.out.println("------------------------------------");
            System.out.println("| " + posicio[21] + " | " + posicio[22] + " | " + posicio[23] + " | " + posicio[24] + " | " + posicio[25] + " | " + posicio[26] + " | " +posicio[7] + " |");
            System.out.println("------------------------------------");
            System.out.println("| " + posicio[0] + " | " + posicio[1] + " | " + posicio[2] + " | " + posicio[3] + " | " + posicio[4] + " | " + posicio[5] + " | " +posicio[6] + " |");
            System.out.println("------------------------------------");       
    }
}



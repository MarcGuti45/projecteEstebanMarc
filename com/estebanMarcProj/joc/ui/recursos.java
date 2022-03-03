package com.estebanMarcProj.joc.ui;

import java.util.Scanner;
import com.estebanMarcProj.utils.BoxDrawing;
import com.estebanMarcProj.utils.Colors;
public class Recursos{
    public static void showTable(int posicio []){
    
        for (int i = 0; i < posicio.length; i++) {
            posicio [i] = i+10;
        }

            System.out.println(BoxDrawing.ESQUINA_TOP_L + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.DOWN_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.DOWN_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.DOWN_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.DOWN_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.DOWN_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.ESQUINA_TOP_R);                      
            System.out.println(BoxDrawing.VERTICAL  + " " + posicio[15] + " " + BoxDrawing.VERTICAL + " " + posicio[14] + " " + BoxDrawing.VERTICAL + " " + posicio[13] + " " + BoxDrawing.VERTICAL + " " + posicio[12] + " " + BoxDrawing.VERTICAL + " " + posicio[11] + " " + BoxDrawing.VERTICAL + " " + posicio[10] + " " + BoxDrawing.VERTICAL);
            System.out.println(BoxDrawing.RIGHT_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.LEFT_T);
            System.out.println(BoxDrawing.VERTICAL + " " + posicio[16] + " " + BoxDrawing.VERTICAL + " " + posicio[29] + " " + BoxDrawing.VERTICAL + " " + posicio[28] + " " + BoxDrawing.VERTICAL + " " + posicio[27] + " " + BoxDrawing.VERTICAL+ " "  + posicio[26] + " " + BoxDrawing.VERTICAL + " " + posicio[9] + " " + BoxDrawing.VERTICAL);
            System.out.println(BoxDrawing.RIGHT_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.LEFT_T);
            System.out.println(BoxDrawing.VERTICAL + " " + posicio[17] + " " + BoxDrawing.VERTICAL + " " + posicio[30] + " " + BoxDrawing.VERTICAL + " " + posicio[35] + " " + BoxDrawing.VERTICAL + " " + posicio[34] + " " + BoxDrawing.VERTICAL + " " + posicio[25] + " " + BoxDrawing.VERTICAL + " " + posicio[8] + " " + BoxDrawing.VERTICAL);
            System.out.println(BoxDrawing.RIGHT_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.LEFT_T);
            System.out.println(BoxDrawing.VERTICAL + " " + posicio[18] + " " + BoxDrawing.VERTICAL + " " + posicio[31] + " " + BoxDrawing.VERTICAL + " " + posicio[32] + " " + BoxDrawing.VERTICAL + " " + posicio[33] + " " + BoxDrawing.VERTICAL + " " + posicio[24] + " " + BoxDrawing.VERTICAL + " " + posicio[7] + " " + BoxDrawing.VERTICAL);
            System.out.println(BoxDrawing.RIGHT_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.LEFT_T);
            System.out.println(BoxDrawing.VERTICAL + " " + posicio[19] + " " + BoxDrawing.VERTICAL + " " + posicio[20] + " " + BoxDrawing.VERTICAL + " " + posicio[21] + " " + BoxDrawing.VERTICAL + " " + posicio[22] + " " + BoxDrawing.VERTICAL + " " + posicio[23] + " " + BoxDrawing.VERTICAL + " " + posicio[6] + " " + BoxDrawing.VERTICAL);
            System.out.println(BoxDrawing.RIGHT_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.CROSS + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.LEFT_T);
            System.out.println(BoxDrawing.VERTICAL + " " + posicio[0] + " " + BoxDrawing.VERTICAL + " " + posicio[1] + " " + BoxDrawing.VERTICAL + " " + posicio[2] + " " + BoxDrawing.VERTICAL + " " + posicio[3] + " " + BoxDrawing.VERTICAL + " " + posicio[4] + " " + BoxDrawing.VERTICAL + " " + posicio[5] + " " + BoxDrawing.VERTICAL);
            System.out.println(BoxDrawing.ESQUINA_BOT_L + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.TOP_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.TOP_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.TOP_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.TOP_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.TOP_T + BoxDrawing.HORITZONTAL.repeat(4) + BoxDrawing.ESQUINA_BOT_R);       
    }

    public static void askPlayers(int numeroJugadors){
        Scanner kb = new Scanner(System.in);
        do{
            System.out.println("Quantes persones jugarán? (2-4)");
            numeroJugadors = kb.nextInt();

            if(numeroJugadors < 2 || numeroJugadors > 4){
                System.out.println(Colors.RED + "ERROR: Ha d’escollir entre 2 i 4 jugadors" + Colors.ANSI_RESET);
            } 

        }while(numeroJugadors < 2 || numeroJugadors > 4);

        System.out.println(Colors.GREEN + "    ===================" + Colors.ANSI_RESET);
        System.out.println(Colors.GREEN + "     COMENÇA EL JOC !" + Colors.ANSI_RESET);
        System.out.println(Colors.GREEN + "    ===================" + Colors.ANSI_RESET);
    }
}




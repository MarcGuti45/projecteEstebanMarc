package com.estebanMarcProj.joc.init;

import java.util.Scanner;

import com.estebanMarcProj.joc.ui.*;
import com.estebanMarcProj.utils.*;

public class start{
    public static void main(String [] args){
        Scanner kb = new Scanner (System.in);

        int posicio [] = new int [36];

        int numeroJugadors;

        do{
            System.out.println("Quantes persones jugarán? (2-4)");
            numeroJugadors = kb.nextInt();

            if(numeroJugadors < 2 || numeroJugadors > 4){
                System.out.println(Colors.RED + "ERROR: Ha d’escollir un número entre 0 i 3" + Colors.ANSI_RESET);
            }
            
        }while(numeroJugadors < 2 || numeroJugadors > 4);

        

        Recursos.showTable(posicio);
    }
}
    

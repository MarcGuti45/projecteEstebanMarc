package com.estebanMarcProj.joc.init;

import java.util.Scanner;

import com.estebanMarcProj.joc.ui.*;
import com.estebanMarcProj.utils.*;

public class start{
    public static void main(String [] args){
        Scanner kb = new Scanner (System.in);

        int posicio [] = new int [36];
        int numeroJugadors = 0;
        int torn = 2;
        String jugadorTorn = "";
        String jugador1 = "";
        String jugador2 = "";

        System.out.println(Colors.BLUE + " ===============================" + Colors.ANSI_RESET);
        System.out.println(Colors.BLUE + "    - BENVINGUT AL TRIVIAL - " + Colors.ANSI_RESET);
        System.out.println(Colors.BLUE + " ===============================" + Colors.ANSI_RESET);
        System.out.println();

        jugador1 = Recursos.askPlayer1(jugador1);
        jugador2 = Recursos.askPlayer2(jugador2);

        System.out.println(Colors.GREEN + "      ====================" + Colors.ANSI_RESET);
        System.out.println(Colors.GREEN + "       - COMENÇA EL JOC -" + Colors.ANSI_RESET);
        System.out.println(Colors.GREEN + "      ====================" + Colors.ANSI_RESET);

        Recursos.showTable(posicio);
        Recursos.playerTurn(torn, jugadorTorn, jugador1, jugador2);
    }
}
    

package com.estebanMarcProj.joc.init;

import java.util.Scanner;

import com.estebanMarcProj.joc.ui.*;
import com.estebanMarcProj.utils.*;

public class start{
    public static void main(String [] args){
        Scanner kb = new Scanner (System.in);

        int posicio [] = new int [36];
        int numeroJugadors = 0;
        int torn;
        String jugadorTorn;
        String jugador1 = "";
        String jugador2 = "";

        Recursos.askPlayers(numeroJugadors, jugador1, jugador2);
        Recursos.showTable(posicio);
    }
}
    

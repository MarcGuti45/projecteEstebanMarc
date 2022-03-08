package com.estebanMarcProj.joc.ui;

import java.util.Random;
import java.io.*;
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

    public static String askPlayer1(String jugador1){
        Scanner kb = new Scanner(System.in);

        System.out.println("Introdueix el nom del jugador 1: ");
        jugador1 = kb.next();
        return jugador1;
        
    }

    public static String askPlayer2(String jugador2){
        Scanner kb = new Scanner(System.in);

        System.out.println("Introdueix el nom del jugador 2: ");
        jugador2 = kb.next();
        return jugador2;
    }

    public static void playerTurn(int torn, String jugadorTorn, String jugador1, String jugador2){
        if (torn == 1){
            torn = 2;
            jugadorTorn = jugador2;
        }
        else {
            torn = 1;
            jugadorTorn = jugador1;
        }
        System.out.println("Torn del jugador " + jugadorTorn + " tira el dau");

    }

    public static int dados() {
        Scanner kb = new Scanner(System.in);
        Random ranNum = new Random();
        System.out.println("Pulsa una tecla per tirar el dau: ");
        String tecla = kb.next();

        System.out.print("Has llançat un dau!");
        int resultado = 0;
        int numeroAleatorio = 0;

        for (int i = 0; i < 1; i++) {
            numeroAleatorio = ranNum.nextInt(6) + 1;
            resultado = resultado + numeroAleatorio;
            System.out.print(" ");
        }

        System.out.println("");
        System.out.println("Resultat: " + resultado);
        return resultado;
    }

    public static void questions(int posicioDau){
        Scanner kb = new Scanner(System.in);
        Random aleatori = new Random();
        Console input = System.console();
        int opcio;
        String seleccio; 
        String llistatPreguntes[][] = new String [10][2];

        llistatPreguntes[0][0] = "Quien fundó Amazon? \nA: Jeff Bezos \nB: Steve Jobs \nC: Mark Zuckerberg";
        llistatPreguntes[0][1] = "A";
        llistatPreguntes[1][0] = "Vigo pertany a la provincia de? \nA: Lugo \nB: Pontevedra \nC: La Coruña";
        llistatPreguntes[1][1] = "B";
        llistatPreguntes[2][0] = "Com va morir Joana d'Arc? \nA: Decapitada \nB: Cremada  \nC: Envenenada";
        llistatPreguntes[2][1] = "B";
        llistatPreguntes[3][0] = "Els reis catolics van reinar entre? \nA: 1475 - 1515 \nB: 1470 - 1516 \nC: 1474 - 1516";
        llistatPreguntes[3][1] = "C";
        llistatPreguntes[4][0] = "La capital de Paraguay es? \nA: Asuncion - 1515 \nB: Managua - 1516 \nC: San Diego";
        llistatPreguntes[4][1] = "A";
        llistatPreguntes[5][0] = "La batalla del Ebre va ocurrir durant? \nA: La primera guerra mundial \nB: La segona guerra mundial \nC: La guerra civil Espanyola";
        llistatPreguntes[5][1] = "C";
        llistatPreguntes[6][0] = "L'estat de solid a liquid s'anomena? \nA: Punt de fusio \nB: Punt d'ebullicio \nC: Transicio de fase";
        llistatPreguntes[6][1] = "A";
        llistatPreguntes[7][0] = "On es troba el museu del prat? \nA: Barcelona \nB: Madrid \nC: Sevilla";
        llistatPreguntes[7][1] = "B";
        llistatPreguntes[8][0] = "Per la comunitat d'Andalucio pasa el riu? \nA: Duero \nB: Guadiana \nC: Tajo";
        llistatPreguntes[8][1] = "B";
        llistatPreguntes[9][0] = "Qui va ser el primer president dels Estats Units? \nA: George Washintong \nB: Abraham Lincoln \nC: Barack Obama";
        llistatPreguntes[9][1] = "A";

        int ronda = 0;
        while (ronda < 1){
            opcio = aleatori.nextInt(4);
            System.out.println(llistatPreguntes[opcio][0]);
            seleccio = input.readLine();
            if (seleccio.equals(llistatPreguntes[opcio][1])){ 
                System.out.println("¡Correcte! Avances" +  posicioDau + " posicions"); 
            }

            else{ 
                System.out.println("Incorrecte, la respuesta era " + llistatPreguntes[opcio][1]); 
            }
            ronda += 1;
        }
    }
}
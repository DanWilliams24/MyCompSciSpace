package com.example.daniel.mycompsciworkspace.School;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Daniel on 9/16/17.
 */

public class InventoryControl {
    public static void main(String[] args) {

        Integer totalCount = 0;
        Integer actionCount = 0;
        Integer thrillerCount = 0;
        Integer comedyCount = 0;
        Integer documentaryCount = 0;
        ArrayList<Integer> idStore = new ArrayList(); //Stores ID Numbers
        Integer data;
        Integer idInput;
        String codeInput;
        Scanner input = new Scanner(System.in);  // Reading from System.in

        System.out.println("Data amount: ");
        data = input.nextInt();
        if(data < 0){
            System.err.println("Not enough data");
            System.exit(1);
        }
        for(int i = 0; i < data; i++){
            System.out.println("Input Movie ID and code letter: ");
            idInput = input.nextInt();
            idStore.add(idInput);

            codeInput = input.next();

            if(codeInput.equalsIgnoreCase("A")){
                totalCount = totalCount + 1;
                actionCount = actionCount + 1;

            }else if(codeInput.equalsIgnoreCase("T")){
                totalCount = totalCount + 1;
                thrillerCount = thrillerCount + 1;

            }else if(codeInput.equalsIgnoreCase("C")){
                totalCount = totalCount + 1;
                comedyCount = comedyCount + 1;

            }else if(codeInput.equalsIgnoreCase("D")){
                totalCount = totalCount + 1;
                documentaryCount = documentaryCount + 1;

            }else{
                System.err.println("Invalid Character, Restarting Program...");
                main(null);//auto-restarts program
                System.exit(2);
            }
        }
        System.out.println("=================== Results ====================");
        System.out.println("Action Category: "+ actionCount + "\t Thriller Category: "+thrillerCount);
        System.out.println("Comedy Category: "+comedyCount + "\t Documentary Category: "+documentaryCount+ "\n");
        System.out.println("Total: " +totalCount);
        System.out.println("ID #s: " + idStore);
        input.close();
    }
}






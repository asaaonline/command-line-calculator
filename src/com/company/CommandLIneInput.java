package com.company;

import java.util.Scanner;

public class CommandLIneInput implements Input {

    private Scanner scn;

    public CommandLIneInput() {
        scn = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        return scn.nextLine();

    }

}

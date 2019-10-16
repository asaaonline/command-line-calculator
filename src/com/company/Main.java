package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Input commandlineInput = new CommandLIneInput();


        AlgorithamSelectors selector = new CommandLinAlgorithamSelector();
        ValueSeparator separator = new CommandLineValueSeparator();
        Display display=new CommandLineDisplay();

        RunCommand importCommand = new ImportCommand(
                commandlineInput, selector, separator, display);

        importCommand.run();
    }
}

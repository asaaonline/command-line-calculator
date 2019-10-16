package com.company;


public class ImportCommand implements RunCommand {

    private Input commandlineInput;
    private AlgorithamSelectors algorithamSelectors;
    private ValueSeparator commandLineValueSeparator;
    private Display display;

    public ImportCommand(Input commandlineInput, AlgorithamSelectors selector, ValueSeparator commandLineValueSeparator, Display display) {
        this.commandlineInput = commandlineInput;
        this.algorithamSelectors = selector;
        this.commandLineValueSeparator = commandLineValueSeparator;
        this.display = display;

    }

    @Override
    public void run() {
        String input = commandlineInput.getInput();
        Algorithems algorithems = algorithamSelectors.selectAlgoritham(input);
        Float[] separate = commandLineValueSeparator.separate(input);

        Float solotion = algorithems.solve(separate);

        display.display(Float.toString(solotion));
    }
}

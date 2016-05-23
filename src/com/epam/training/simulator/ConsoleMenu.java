package com.epam.training.simulator;

import java.util.Scanner;

public class ConsoleMenu {

    public void startConsole() {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        while (!inputText.equals("q")) {
            doMenuStuffs(inputText);
        }
    }

    private void doMenuStuffs(String command) {
        switch (command) {
            case "q": {
                break;
            }
        }
    }
}

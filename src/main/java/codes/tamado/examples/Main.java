package codes.tamado.examples;

import codes.tamado.examples.obj.Abstraction;

public class Main {
    public static void main(String[] args) {
        Abstraction blah = new Abstraction() {
            public String printInformation(String param1, int param2) {
                return "hello";
            }
        };

        blah.printInfo();
    }
}
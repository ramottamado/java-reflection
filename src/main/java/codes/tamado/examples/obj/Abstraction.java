package codes.tamado.examples.obj;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public abstract class Abstraction {

    public void printInfo() {
        Class<? extends Abstraction> cls = this.getClass();

        for (Method m : cls.getDeclaredMethods()) {
            System.out.println("Printing Method Info");
            System.out.println(m.getName());
            System.out.println("\n");

            for (Parameter param : m.getParameters()) {
                System.out.println("Printing parameter Info");
                System.out.println(param.getName());
                System.out.println(param.getType().getName());
                System.out.println(param.getParameterizedType().getTypeName());
                System.out.println("OK\n");
            }
        }
    }
}

package dev.onet;

import consumer.specific.ChildClass;
import dev.onet.generic.BaseClass;

import java.io.IOException;

public class Main {

    public static void main(String[]Args) throws IOException {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferedtoAsBase = new BaseClass();

        parent.recommendedMethod();
        System.out.println("---------------------------------");
        childReferedtoAsBase.recommendedMethod();
        System.out.println("----------------------------------");
        child.recommendedMethod();
    }
}

package dev.onet.generic;

public class BaseClass {

    public final void recommendedMethod(){
        System.out.println("[BaseClass.recommendedMethod] Best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod(){
        System.out.println("[BaseClass.optionalMethod] : Customize Optional Method");
    }

    private void mandatoryMethod(){
        System.out.println("[BaseClass.mandatoryMethod] : NON Negotiable Method");
    }
}

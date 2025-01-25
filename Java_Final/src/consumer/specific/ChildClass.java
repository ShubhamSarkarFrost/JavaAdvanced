package consumer.specific;

import dev.onet.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("[Child:OptionalMethod] EXTRA STUFF HAPPENED");
        super.optionalMethod();
    }


//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child:RecommendedMethod] EXTRA STUFF HAPPENED");
//        super.recommendedMethod();
//    }

    private void mandatoryMethod(){
        System.out.println("[Child:mandatoryMethod]: My Own Important Stuff");
    }
}

package ioc.typeOfInjection.ConstourBasedInjection;

import org.springframework.stereotype.Component;

@Component
public class Demo {
private DepencecyA depencecyA;
    private DepencecyB depencecyB;
    private DepencecyC depencecyC;

    public Demo(DepencecyA depencecyA, DepencecyB depencecyB, DepencecyC depencecyC) {
        this.depencecyA = depencecyA;
        this.depencecyB = depencecyB;
        this.depencecyC = depencecyC;
    }

    public void show() {
        System.out.println("In show");
    }
}

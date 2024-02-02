package main.java.decorater.skills;

import main.java.decorater.builders.Builder;

public class MoverBuildSkill implements Builder {
    private Builder builder;

    public MoverBuildSkill(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void action() {
        builder.action();
        System.out.println("I can be mover");
    }
}

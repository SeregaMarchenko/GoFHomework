package main.java.decorater.skills;

import main.java.decorater.builders.Builder;

public class ManageBuildSkill implements Builder{
    private Builder builder;

    public ManageBuildSkill(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void action() {
        builder.action();
        System.out.println("I can be manage");
    }
}

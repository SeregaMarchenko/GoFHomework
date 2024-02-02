package main.java.decorater.skills;

import main.java.decorater.builders.Builder;

public class InstallerBuildSkill implements Builder {
    private Builder builder;

    public InstallerBuildSkill(Builder builder) {
        this.builder = builder;
    }

    @Override
    public void action() {
        builder.action();
        System.out.println("I can install something...");
    }
}

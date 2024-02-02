package main.java.decorater;

import main.java.decorater.builders.Builder;
import main.java.decorater.builders.BuilderCutter;
import main.java.decorater.builders.BuilderPaver;
import main.java.decorater.skills.InstallerBuildSkill;
import main.java.decorater.skills.ManageBuildSkill;
import main.java.decorater.skills.MoverBuildSkill;

public class Main {
    public static void main(String[] args) {
        Builder builderPaver = new BuilderPaver();
        Builder builderPaverAndInstaller = new InstallerBuildSkill(builderPaver);
        Builder builderPaverInstallerAndManager = new ManageBuildSkill(builderPaverAndInstaller);
        builderPaverInstallerAndManager.action();
        System.out.println("-----------------------------");
        Builder builderCutter = new BuilderCutter();
        Builder builderCutterAndInstaller = new InstallerBuildSkill(builderCutter);
        Builder builderCutterInstallerAndMover = new MoverBuildSkill(builderCutterAndInstaller);
        builderCutterInstallerAndMover.action();
    }
}

package com.company;

import java.util.List;

public abstract class Application {
    private final List<Runnable> projects;

    protected Application(List<Runnable> projects) {
        this.projects = projects;
    }

    protected void start() {
        this.projects.forEach(Runnable::run);
    }

}

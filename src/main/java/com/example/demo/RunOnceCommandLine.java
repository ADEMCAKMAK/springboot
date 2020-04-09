package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/// ref : https://howtodoinjava.com/spring-boot/command-line-runner-interface-example/
@Component
@Order(1)
public class RunOnceCommandLine implements CommandLineRunner {

    private final CommandLineRunnerProperties commandLineRunnerProperties;

    public RunOnceCommandLine(CommandLineRunnerProperties commandLineRunnerProperties) {
        this.commandLineRunnerProperties = commandLineRunnerProperties;
    }

    /**
     * @param args
     */
    @Transactional
    @Override
    public void run(String... args) {

        if (!this.commandLineRunnerProperties.getBootstrap().isRunOnce())
            return;

        System.out.println("run a code block only once in application’s lifetime – after application is initialized.");
    }
}

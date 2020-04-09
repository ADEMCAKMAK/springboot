package com.example.demo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "command")
public class CommandLineRunnerProperties {

    private final CommandLine commandLine = new CommandLine();

    public CommandLine getBootstrap() {
        return commandLine;
    }

    public static class CommandLine {

        private boolean runOnce = false;

        public boolean isRunOnce() {
            return runOnce;
        }

        public void setRunOnce(boolean runOnce) {
            this.runOnce = runOnce;
        }
    }
}

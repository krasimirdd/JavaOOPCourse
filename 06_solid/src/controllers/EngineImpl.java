package controllers;

import enums.ReportLevel;
import intefaces.Engine;
import intefaces.Logger;

import java.io.BufferedReader;
import java.io.IOException;

public class EngineImpl implements Engine {

    private Logger logger;

    public EngineImpl(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void run(String endString, BufferedReader reader) throws IOException {

        String input = reader.readLine();
        while (!input.equals(endString)) {

            String[] tokens = input.split("\\|");

            String time = tokens[1];
            String message = tokens[2];

            this.logger.log(time, message, ReportLevel.valueOf(tokens[0]));

            input = reader.readLine();
        }
    }

    @Override
    public String toString() {
        return this.logger.toString();
    }
}

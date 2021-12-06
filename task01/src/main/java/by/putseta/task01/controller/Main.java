package by.putseta.task01.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main class for start the program
 *
 * @author Saulius
 */
public class Main {

    //     Define a static logger variable so that it references the
//     Logger instance named "Main".
    private static final Logger LOGGER = LogManager.getLogger(Main.class.getName());

    /**
     * Here start point of the program
     *
     * @param args
     */
    public static void main(String[] args) {

        LOGGER.info("Entering application");

        RunnerLinearTasks runnerLinearTasks = new RunnerLinearTasks();
        RunnerBranchingTasks runnerBranchingTasks = new RunnerBranchingTasks();
        RunnerCyclesTasks runnerCyclesTasks = new RunnerCyclesTasks();
        RunnerAdditionalTasks runnerAdditionalTasks = new RunnerAdditionalTasks();

        runnerLinearTasks.runLinearTask();
        runnerBranchingTasks.runBranchingTask();
        runnerCyclesTasks.runCyclesTask();
        runnerAdditionalTasks.runAdditionalTask();

        LOGGER.info("Exiting application");
    }
}

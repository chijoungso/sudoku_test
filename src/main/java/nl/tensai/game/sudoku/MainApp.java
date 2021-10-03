package nl.tensai.game.sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import nl.tensai.game.sudoku.logic.SudokuBuildLogic;
import nl.tensai.game.sudoku.ui.UserInterfaceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class MainApp extends Application {

    private static Logger log = LoggerFactory.getLogger(MainApp.class);

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Get SudokuGame object for a new game
        UserInterfaceImpl uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            log.warn("Failed to start game.", e);
            throw e;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
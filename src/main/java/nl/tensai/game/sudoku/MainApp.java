package nl.tensai.game.sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import nl.tensai.game.sudoku.logic.SudokuBuildLogic;
import nl.tensai.game.sudoku.ui.UserInterfaceImpl;

import java.io.IOException;

public class MainApp extends Application {


    private UserInterfaceImpl uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Get SudokuGame object for a new game
        uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.HashSet;

public class Layout extends Application {

	private static BorderPane window;
	private static Button update;
	private static Stage stage;
	private static GridPane grid;
    private static Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        stage = primaryStage;
        window = new BorderPane();
        button = new Button("update");

        grid = new GridPane();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i == j) {
                    Rectangle current = new Rectangle(10, 10);
                    grid.add(current, i, j);
                }
            }
        }

        window.setCenter(grid);
        window.setRight(button);
        stage.setScene(new Scene(window));
        stage.show();
    }
}

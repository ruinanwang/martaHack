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

    private static Reader reader;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        reader = new Reader();

        stage = primaryStage;
        window = new BorderPane();
        button = new Button("update");

        grid = new GridPane();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                Rectangle current = new Rectangle(10, 10);
                current.setFill(Color.DARKGRAY);
                grid.add(current, i, j);
            }
        }

        for (Location location: reader.readInputText()) {
            int x = location.getX();
            int y = location. getY();
            Rectangle r = new Rectangle(10, 10);
            double weight = (double)location.getpFlow() / (double)100;
            System.out.println(weight);
            double red = (double)255 * weight;
            r.setFill(Color.rgb((int)red, 0, 0));
            grid.add(r, x, y);
        }

        window.setCenter(grid);
        window.setRight(button);
        stage.setScene(new Scene(window));
        stage.show();
    }
}

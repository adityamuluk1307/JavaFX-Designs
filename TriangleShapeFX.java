import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class TriangleShapeFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Creating a triangle using Polygon
        Polygon triangle = new Polygon(
                100, 20,   // Top point
                50, 150,   // Bottom-left
                150, 150   // Bottom-right
        );
        triangle.setFill(Color.BLUE);
        triangle.setStroke(Color.BLACK);

        pane.getChildren().add(triangle);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Triangle Shape");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
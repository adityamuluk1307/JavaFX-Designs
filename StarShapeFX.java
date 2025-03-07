import javafx.scene.shape.Polygon;
import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;;

public class StarShapeFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Creating a star using Polygon
        Polygon star = new Polygon(
                100, 20,   // Top point
                120, 80,
                180, 80,
                130, 120,
                150, 180,
                100, 140,
                50, 180,
                70, 120,
                20, 80,
                80, 80
        );
        star.setFill(Color.YELLOW);
        star.setStroke(Color.BLACK);

        pane.getChildren().add(star);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Star Shape");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
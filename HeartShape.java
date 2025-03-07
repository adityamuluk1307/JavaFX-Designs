import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class HeartShape extends Application {
    @Override
    public void start(Stage stage) {
        // Create a heart shape using cubic curves
        Path heart = new Path();
        heart.getElements().add(new MoveTo(250, 200));

        // Left curve
        heart.getElements().add(new CubicCurveTo(100, 50, 50, 200, 250, 350));
        // Right curve
        heart.getElements().add(new CubicCurveTo(450, 200, 400, 50, 250, 200));

        // Style the heart
        heart.setFill(Color.RED);
        heart.setStroke(Color.DARKRED);

        // Set up the scene
        Group root = new Group(heart);
        Scene scene = new Scene(root, 500, 400, Color.WHITE);
        stage.setTitle("Heart Shape in JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

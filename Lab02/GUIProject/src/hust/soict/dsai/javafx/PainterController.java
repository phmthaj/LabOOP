package hust.soict.dsai.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup identical;

    @FXML
    private RadioButton isEraserMode;

    @FXML
    private RadioButton isPenMode;

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void penMode(ActionEvent event) {
        isEraserMode.setSelected(false);
        isPenMode.setSelected(true);
    }

    @FXML
    void eraserMode (ActionEvent event) {
        isPenMode.setSelected(false);
        isEraserMode.setSelected(true);
    }
}
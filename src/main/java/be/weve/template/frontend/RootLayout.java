package be.weve.template.frontend;

import be.weve.template.frontend.loader.CustomFXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.stereotype.Component;

@Component
public class RootLayout {

    private Stage stage;
    private BorderPane layout;
    private CustomFXMLLoader loader;

    public RootLayout(CustomFXMLLoader customFXMLLoader) {
        this.loader = customFXMLLoader;
    }

    public void setStage(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public Stage getStage() {
        return this.stage;
    }

    public void init() {
        createPrimaryStage();
        createRootLayout();
        createMenuBar();
        createFooter();
    }

    private void createPrimaryStage() {
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Test generator");
        setSize();
    }

    private void setSize() {
        if (!stage.isMaximized()) {
            stage.setWidth(800);
            stage.setHeight(500);
        }
    }

    private void createRootLayout() {
        layout = new BorderPane();
        layout.getStyleClass().clear();
        layout.getStyleClass().add("borderPane");

        Scene scene = new Scene(layout);
        scene.getStylesheets().add("css/app.css");

        stage.setScene(scene);
        stage.show();
    }

    private void createMenuBar() {
        layout.setTop(loader.loadView("FXML/MenuBar.fxml"));
    }

    private void createFooter() {
        layout.setBottom(loader.loadView("FXML/Footer.fxml"));
    }

    // Test Pane for start project
    public void showStart() {
        Pane pane = new Pane();
        Label label = new Label("Start");
        pane.getChildren().add(label);
        layout.setCenter(pane);
    }

    // Test Pane for start project
    public void showPage2() {
        Pane pane = new Pane();
        Label label = new Label("Page 2");
        pane.getChildren().add(label);
        layout.setCenter(pane);
    }

    public void minimize() {
        stage.setIconified(true);
    }

    public void maximize() {
        stage.setMaximized(!stage.isMaximized());
        setSize();
    }

    public void close() {
        stage.close();
    }


}

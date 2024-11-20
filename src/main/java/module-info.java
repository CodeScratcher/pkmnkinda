module org.example.pkmnkinda {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens org.example.pkmnkinda to javafx.fxml;
    exports org.example.pkmnkinda;
}
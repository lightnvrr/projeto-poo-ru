module com.example.projetopooru {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetopooru to javafx.fxml;
    exports com.example.projetopooru;
}
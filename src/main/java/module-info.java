module com.example.syn_jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.syn_jfx to javafx.fxml;
    exports com.example.syn_jfx;
}
module com.tarea_corta.tareacorta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tarea_corta.tareacorta to javafx.fxml;
    exports com.tarea_corta.tareacorta;
}
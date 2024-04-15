module com.brunoblanco.actividadpolimorfismo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.brunoblanco.actividadpolimorfismo to javafx.fxml;
    exports com.brunoblanco.actividadpolimorfismo;
    opens com.brunoblanco.actividadpolimorfismo.Models to javafx.fxml;
    exports com.brunoblanco.actividadpolimorfismo.Models;
    exports com.brunoblanco.actividadpolimorfismo.Controller;
    opens com.brunoblanco.actividadpolimorfismo.Controller to javafx.fxml;
}
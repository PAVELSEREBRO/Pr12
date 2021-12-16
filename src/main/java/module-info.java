module com.example.pr12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.gibo01.probnik to javafx.fxml;
    exports ru.mirea.gibo01.probnik;
}
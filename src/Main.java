import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Diez productos");
        int contador = 0;

        String descripcionMasLarga = "";
        int longitudMasLarga = 0;

        String descripcionMasUnidades = "";
        int maxUnidades = -1;

        String descripcionMasPronto = "";
        LocalDate fechaMasPronto = null;
        boolean salir = false;
    }
}
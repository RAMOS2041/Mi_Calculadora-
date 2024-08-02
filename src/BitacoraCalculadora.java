import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BitacoraCalculadora {

    private static final String ARCHIVO_BITACORA = "bitacoraCalculadora.txt";

    // Método para registrar la operación en el archivo
    public void registrarOperacion(String operacion) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_BITACORA, true))) {
            writer.write(operacion);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de bitácora: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        BitacoraCalculadora bitacora = new BitacoraCalculadora();
        bitacora.registrarOperacion("5 + 3 = 8");
        bitacora.registrarOperacion("10 - 4 = 6");
        bitacora.registrarOperacion("2 * 7 = 14");
        bitacora.registrarOperacion("20 / 5 = 4");

        System.out.println("Operaciones registradas en la bitácora.");
    }
}


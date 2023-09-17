package expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidacionNumerosTelefono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de teléfono(ejemplo:(55) 1234-5678 o (555) 123-4567):");
        String numeroTelefono = scanner.nextLine();

        String regex = "^\\(\\d{2,3}\\) \\d{3,4}-\\d{4}$";//se crea patron para plicar a un texto 

        Pattern pattern = Pattern.compile(regex);//en este se evalua el patron creado anteriormente 
        Matcher matcher = pattern.matcher(numeroTelefono);//se aplica el patron a la variable numeroTelefono

        if (matcher.matches()) {
            System.out.println("El número de teléfono es correcto en formato Mexicano");
        } else {
            System.out.println("El número de teléfono no es válido en el formato Mexicano");
        }//cierre de else
    }//cierre de main
}//cierre de clase principal

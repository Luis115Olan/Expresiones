package expresiones;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionCorreoElectronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el correo electronico: ");
        String correo = scanner.nextLine();

        String regex = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-]?[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);//se crea un patron de busqueda en una expresion a partir 
        Matcher matcher = pattern.matcher(correo); //con el patron de busqueda anterior se le aplica a el texto de la varibale correo

        if (matcher.matches()) {
            System.out.println("El correo es correcto");
        } else {
            System.out.println("El correo no es valido");
        }//cierre de else
    }//cierre de main
}//cierre de clase principal


package expresiones;

public class EnumEjemplo {

    public enum Color {
        ROJO, VERDE, AZUL, AMARILLO, NARANJA
    }

    public static void main(String[] args) {
        Color colorFavorito = Color.AZUL;

        System.out.println("Mi color favorito es " + colorFavorito);
    }
}


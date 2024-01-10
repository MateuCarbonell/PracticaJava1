import java.util.Scanner;
// Simplemente en vez de usar brake se añade un booleano mas para condicionar el bucle a salir cuando credencialesCorrectas sea true.
public class ComprobarCredencialesSinBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentosMaximos = 3;
        boolean credencialesCorrectas = false;

        for (int i = 0; i < intentosMaximos && !credencialesCorrectas; i++) {
            String usuario = sc.nextLine();
            String contraseña = sc.nextLine();

            if (comprobarCredenciales(usuario, contraseña)) {
                System.out.println("Bienvenido!");
                credencialesCorrectas = true;
            } else {
                System.out.println("Denegado!");
                System.out.println("Vuelve a intentarlo");
            }
        }

        if (!credencialesCorrectas) {
            System.out.println("Demasiados intentos.");
        }
    }

    public static boolean comprobarCredenciales(String user, String pass) {
        return user.equals("usuario1") && pass.equals("asdfg");
    }
}

import java.util.Scanner;

public class ComprobarCredenciales {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int intentosMaximos = 3;
    for(int i=0; i< intentosMaximos;i++){
        String usuario = sc.nextLine();
        String contraseña = sc.nextLine();
        if (comprobarCredenciales(usuario, contraseña)) {
            System.out.println("Bienvenido!");
            break;
        }else{
            System.out.println("Denegado!");
            System.out.println("Vuelve a intentarlo");
        }
    }
    
}

public static boolean comprobarCredenciales(String user, String pass){
    return user.equals("usuario1") && pass.equals("asdfg");
}
}

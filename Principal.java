import java.util.Date;
public class Principal {
	public static void main(String args[]) {
		System.out.println("Hola Mundo");
		time();
		Usuario[] arrayUsers = new Usuario[num]();
		arrayUsers = array(2);
		for(int i = 0; i < arrayUsers.length(); i++) {
			System.out.println("Usuario " + i+1);
			System.out.println("Nombre: " + arrayUsers[i].nombre);
			System.out.println("Apellidos: " + arrayUsers[i].apellidos);
			System.out.println("Email: " + arrayUsers[i].email);
			System.out.println();
		}
	}
	public static void time() {
		System.out.println("Hora acutal:" + new Date());
	}

	public static Usuario[] array(int num) {
		Usuario[] arrayUsers = new Usuario[num]();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num; i++) {
			System.out.println("Introduce nombre del " + i+1 + " usuario");
			arrayUsers[i].nombre = sc.nextLine();
			System.out.println("Introduce apellidos del " + i+1 + " usuario");
			arrayUsers[i].apellidos = sc.nextLine();
			System.out.println("Introduce email del " + i+1 + " usuario");
			arrayUsers[i].email = sc.nextLine();
		}
		sc.close();
		return arrayUsers;
	}
}

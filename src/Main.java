import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        String v;
        Scanner a;
        Scanner reader;
        String numero;
        String nombre;
        do {
            a = new Scanner(System.in);
            System.out.println("l: load      s:save      i:list      c:create       d:delete      x:exit ");

            v = a.nextLine();

            switch (v)
            {
                case "l":
                    book.load();
                    break;
                case "s":
                    book.save();
                    break;
                case "i":
                    book.list();
                    break;
                case "c":
                    System.out.println("Telefono: ");
                    reader = new Scanner(System.in);
                    numero = reader.nextLine();
                    System.out.println("Nombre: ");
                    reader = new Scanner(System.in);
                    nombre = reader.nextLine();
                    book.create(numero, nombre);
                    break;
                case "d":
                    System.out.println("Telefono: ");
                    reader = new Scanner(System.in);
                    numero = reader.nextLine();
                    book.delete(numero);
                    break;
                case "x":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Comando no reconocido");
                    break;
            }
        }while(true);
    }
}

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Fila fila = new Fila();
    public static int turnos = 1;
    public static void main(String[] args) {

        menu();
    }

    public static void menu (){

        boolean start = false;
        int option;

        while (!start){

            System.out.println("1. Dar turno"
                + "\n2. Mostrar turno actual"
                + "\n3. Pasar turno"
                + "\n4. Seguir"
                + "\n5. Imprimir fila completa"
                + "\n6. Cerrar programa");
            option = sc.nextInt();
            switch (option){
                case 1:
                    fila.addTurno(
                            new Turno(turnos)
                    );
                    turnos += 1;
                    break;
                case 2:
                    if (fila.getActual() == 0) System.out.println("No hay turnos aun");
                    else System.out.println("Turno " + fila.getActual());
                    break;
                case 3:
                    fila.pasarturno();
                    break;
                case 4:
                    fila.seguir();
                    break;
                case 5:
                    fila.print();
                    break;
                case 6:
                    start = true;
                    break;
                default:
                    System.out.println(option + "No es una opcion disponible");
            }
        }
    }
}
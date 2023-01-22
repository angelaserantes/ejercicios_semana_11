import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.ejercicios.semana11.Perfil;
import com.ejercicios.semana11.Agenda;
public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Bienvenido/a, vamos a solicitar tus datos personales"
        );
        Scanner datos = new Scanner(System.in);
        int opcion = 0;
        String nombre = null;
        String apellido1 = null;
        String apellido2 = null;
        String telefono = null;
        int edad = 0;
        boolean nombreOk = false;
        boolean apellido1OK = false;
        boolean apellido2OK = false;
        boolean edadOK = false;
        boolean telefonoOK = false;
        Agenda agenda = new Agenda();


        do {
            nombreOk = false;
            apellido1OK = false;
            apellido2OK = false;
            edadOK = false;
            telefonoOK = false;
            System.out.println("1- Pulsa 1 para añadir un perfil a la agenda");
            System.out.println("2- Pulsa 2 para mostrar los perfiles de la agenda");
            System.out.println("3-Pulsa 3 para salir");
            opcion = datos.nextInt();
            switch (opcion) {
                case 1:
                    //excepcion1
                    while (!nombreOk) {
                        try {
                            System.out.println("Introduce tu nombre");
                            nombre = datos.next();
                            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
                            Matcher matcher = pattern.matcher(nombre);
                            if (matcher.find()) {
                                nombreOk = true;
                            } else {
                                nombreOk = false;
                                throw new Exception("No es una cadena");
                            }
                        } catch (Exception e) {
                            System.out.println(e.toString());

                        }
                    }


//excepcion2
                    while (!apellido1OK) {
                        try {
                            System.out.println("Introduce tu primer apellido");
                            apellido1 = datos.next();
                            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
                            Matcher matcher = pattern.matcher(apellido1);
                            if (matcher.find()) {
                                apellido1OK = true;
                            } else {
                                apellido1OK = false;
                                throw new Exception("No es una cadena");
                            }
                        } catch (Exception e) {
                            System.out.println(e.toString());

                        }
                    }

//excepcion3

                    while (!apellido2OK) {
                        try {
                            System.out.println("Introduce tu segundo apellido");
                            apellido2 = datos.next();
                            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
                            Matcher matcher = pattern.matcher(apellido2);
                            if (matcher.find()) {
                                apellido2OK = true;
                            } else {
                                apellido2OK = false;
                                throw new Exception("No es una cadena");
                            }
                        } catch (Exception e) {
                            System.out.println(e.toString());

                        }


                    }

//excepcion4
                    while (!edadOK) {

                        try {
                            edadOK = true;
                            System.out.println("Introduce tu edad con numero entero");
                            edad = datos.nextInt();
                        } catch (InputMismatchException ex) {
                            edadOK = false;
                            ex.printStackTrace();
                            //System.out.println(ex.getMessage());
                            datos.next();
                        }
                    }
//excepcion 5

                    while (!telefonoOK) {
                        try {
                            System.out.println("Introduce tu numero de móvil");
                            telefono = datos.next();
                            if (!telefono.matches("^((7|6)[0-9]{8})$")) {
                                throw new IllegalArgumentException("El número de teléfono no tiene el formato correcto");
                            } else {
                                telefonoOK = true;
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }


                    }
                    try {
                        Perfil perfil = new Perfil(nombre, apellido1, apellido2, edad, telefono);
                        agenda.addPerfil(perfil);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("La agenda está llena");
                    }
                    break;


                case 2:
                    System.out.println("Datos de los perfiles guardados en la agenda:");
                    agenda.recorreragenda();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar la agenda, hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción no disponible");
            }
        }
            while (opcion != 3) ;
        }

    }
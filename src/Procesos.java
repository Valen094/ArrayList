import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	
    static ArrayList<String> estudiantes = new ArrayList<String>();
    static ArrayList<Integer> edades = new ArrayList<Integer>();
	
    public static void iniciar() {
    	 int opcion;

         do {
             opcion = Integer.parseInt(JOptionPane.showInputDialog(
                     "Seleccione una opción:\n" +
                     "1. Agregar estudiante y edad\n" +
                     "2. Imprimir lista de estudiantes con edades\n" +
                     "3. Calcular promedio de edades\n" +
                     "4. Estudiantes de mayor edad\n" +
                     "5. Estudiantes de menor edad\n" +
                     "6. Estudiantes mayores de edad\n" +
                     "7. Buscar estudiante por nombre\n" +
                     "8. Buscar estudiantes por edad\n" +
                     "9. Salir"
             ));

             switch (opcion) {
                 case 1:
                     agregarEstudiante();
                     break;
                 case 2:
                     imprimirLista();
                     break;
                 case 3:
                     calcularPromedio();
                     break;
                 case 4:
                     estudiantesMayoresEdad();
                     break;
                 case 5:
                     estudiantesMenoresEdad();
                     break;
                 case 6:
                     estudiantesMayores();
                     break;
                 case 7:
                     buscarPorNombre();
                     break;
                 case 8:
                     buscarPorEdad();
                     break;
                 case 9:
                     JOptionPane.showMessageDialog(null, "Saliendo...");
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "Opción inválida");
                     break;
             }

         } while (opcion != 9);
    }
    

    public static void agregarEstudiante() {
    	
    	int cantidad = 0;
    	
    	cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos estudiantes quiere registrar"));
    	
    	for (int i = 0; i < cantidad; i++) {
			
    		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
    		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombre + ":"));
    		
    		estudiantes.add(nombre);
    		edades.add(edad);
		}

        JOptionPane.showMessageDialog(null, "Estudiantes agregado correctamente");
    }

    public static void imprimirLista() {
        String lista = "";

        for (int i = 0; i < estudiantes.size(); i++) {
            lista += estudiantes.get(i) + " - " + edades.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }

    public static void calcularPromedio() {
        int sumatoria = 0;

        for (int i = 0; i < edades.size(); i++) {
            sumatoria += edades.get(i);
        }

        double promedio = (double) sumatoria / edades.size();

        JOptionPane.showMessageDialog(null, "El promedio de edades es: " + promedio);
    }

    public static void estudiantesMayoresEdad() {
        ArrayList<String> mayores = new ArrayList<String>();
        int mayor = 0;

        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) > mayor) {
                mayores.clear();
                mayores.add(estudiantes.get(i));
                mayor = edades.get(i);
            } else if (edades.get(i) == mayor) {
                mayores.add(estudiantes.get(i));
            }
        }

        JOptionPane.showMessageDialog(null, "Estudiantes de mayor edad: " + mayores);
    }

    public static void estudiantesMenoresEdad() {
        ArrayList<String> menores = new ArrayList<String>();
        int menor = edades.get(0);

        for (int i = 0; i < edades.size(); i++) {
        	if (edades.get(i) < menor) {
        	    menores.clear();
        	    menores.add(estudiantes.get(i));
        	    menor = edades.get(i);
        	} else if (edades.get(i) == menor) {
        	    menores.add(estudiantes.get(i));
        	}
        	}

        	JOptionPane.showMessageDialog(null, "Estudiantes de menor edad: " + menores);
        	}

        	public static void estudiantesMayores() {
        	int contador = 0;

        	for (int i = 0; i < edades.size(); i++) {
        	if (edades.get(i) >= 18) {
        	contador++;
        	}
        	}

        	JOptionPane.showMessageDialog(null, "Hay " + contador + " estudiantes mayores de edad");
        	}

        	public static void buscarPorNombre() {
        	String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");

        	for (int i = 0; i < estudiantes.size(); i++) {
        	if (estudiantes.get(i).equalsIgnoreCase(nombre)) {
        	JOptionPane.showMessageDialog(null, nombre + " tiene " + edades.get(i) + " años");
        	return;
        	}
        	}

        	JOptionPane.showMessageDialog(null, nombre + " no se encuentra en la lista de estudiantes");
        	}

        	public static void buscarPorEdad() {
        	int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de los estudiantes que desea buscar:"));
        	ArrayList<String> encontrados = new ArrayList<String>();

        	for (int i = 0; i < edades.size(); i++) {
        	if (edades.get(i) == edad) {
        	encontrados.add(estudiantes.get(i));
        	}
        	}

        	if (encontrados.size() == 0) {
        	JOptionPane.showMessageDialog(null, "No se encontraron estudiantes con esa edad");
        	} else {
        	JOptionPane.showMessageDialog(null, "Estudiantes de " + edad + " años: " + encontrados);
        	}
        	}

        	
        }



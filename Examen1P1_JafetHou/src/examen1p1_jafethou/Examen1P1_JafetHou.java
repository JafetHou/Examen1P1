package examen1p1_jafethou;

import java.util.Scanner;

public class Examen1P1_JafetHou {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("\n1. Sumador Binario \n");
            System.out.println("2. Estrella de David \n");
            System.out.println("3. Ingrese para salir: \n");
            System.out.println("Ingrese una opcion: ");
            int opc = leer.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("Debe Ingresar solo numeros 1 y 0, y ambas cadenas deben tener el mismo numero de caracteres.\n ");
                    System.out.println("Ingrese la primera cadena de numero binarios: ");
                    String bin1 = leer.next();
                    System.out.println("Ingrese la segunda cadena de numero binarios: ");
                    String bin2 = leer.next();
                    boolean cadena = false;
                    boolean cadena1 = false;
                    boolean cadena2 = false;// Validaciones 
                    char cont = '0';
                    char cont1 = '0';
                    for (int i = 0; i < bin1.length(); i++) {
                        cont += bin1.charAt(i);
                        if (cont == 48 || cont == 49) {
                            System.out.println("si");
                        } else {
                            cadena = true;
                        }// inicio de validaciones de primera cadena
                    }
                    for (int k = 0; k < bin2.length(); k++) {
                        cont += bin2.charAt(k);
                        if (cont == 48 || cont == 49) {
                            System.out.println("si");
                        } else {
                            cadena1 = true;
                        }//inicio de validaciones de segunda cadena
                    }
                    if (bin1.length() != bin2.length()) {
                        cadena2 = true;
                    }// validacion de numeros de caracteres

                    if (cadena == true && cadena1 == true && cadena2 == true) {
                        System.out.println("Debe ingresar numero que sea 1 o 0, y la cadena debe ser el mismo numero de caracteres. ");
                        // por si es falso
                    } else {
                        int contador = 0;
                        for (int i = 0; i < bin1.length(); i++) {
                            cont += bin1.charAt(i);
                            contador++;
                        }
                        char cero1 = '0';
                        char uno1 = '1';
                        char acont1 = ' ';
                        char acont2 = ' ';
                        // INICIO DE SUMA Y CONTADOR
                        for (int i = contador; i >= contador; i--) {
                            for (int k = contador; k > bin1.length(); k--) {
                                acont1 += bin1.charAt(k);
                                boolean cero = false;
                                boolean uno = false;
                                for (int n = contador; n > bin2.charAt(n); n--) {
                                    acont2 += bin2.charAt(n);
                                    if (acont1 == 49 && acont2 == 49) {
                                        cero = true;
                                        uno = true;
                                    }else
                                        if (acont1 == 48 && acont2 == 49 && uno == true) {
                                            cero = true;
                                            uno = true;
                                        }else 
                                        if (acont1 == 49 && acont2 == 48 && uno == true) {
                                            cero = true;
                                            uno = true;
                                        }else 
                                        if (acont1 == 48 && acont2 == 49) {
                                            uno = true;

                                        }else 
                                        if (acont1 == 49 && acont2 == 48) {
                                            uno = true;
                                        } else if (cero == true) {
                                            cero1++;
                                            System.out.print(cero1);
                                        } else if (uno == true) {
                                            uno1++;
                                            System.out.print(uno1);
                                        }// FIN DE VALIDACIONES Y CONTADOR 
                                    for (int l = 0; cero1 >= uno1; l++){
                                    }// RESPUESTA NO TERMINE
                                        
                                }
                               
                            }
                        }
                         System.out.println("hola   "+cero1);
                         System.out.println("adios    "+uno1);
                        // NO PUDE HACER QUE FUNCIONARA, PERO LAS VALIDACION ESTAN BUENAS.
                                
                        
                    }

                    break;
                }
                case 2: {
                    System.out.println("La estrella debe ser mayor a 9 y solo se permite numero impares \n");
                    System.out.println("Ingrese el tamano de la estrella: ");
                    int num = leer.nextInt();
                        for (int vacio = 0; vacio <= num-2; vacio++) {
                            if (vacio == num / 2) {
                                System.out.print("+");
                            }
                                System.out.print(" ");
                        }
                            System.out.println(" ");
                            // PRIMER + DE LA PRIMERA LINEA
                    for (int estre1 = 1; estre1 <= 1; estre1++) {
                        for (int espacio = 0; espacio <= num-1; espacio++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }// PRIMERA LINEA DEL TRIANGULO VERTICAL
                    for (int vacio = 0; vacio <= num-2; vacio++) {
                            if (vacio == num - num + 1 || vacio == num/2 + 1 ) {
                                System.out.print("*");
                            }// PAREDES DE LO TRIANGULOS
                            else 
                                if (vacio == num/2-3||vacio == num/2){
                                    System.out.print("+");
                                }
                                System.out.print(" ");
                    }
                            System.out.println(" ");
                            
                            for (int vacio = 0; vacio <= num-2; vacio++) {
                                if (vacio == num/2 - 3 || vacio == num/2 + 2 ) {
                                    System.out.print("*");
                                }
                                    System.out.print(" ");
                                
                            }
                                System.out.println(" ");
                            for (int vacio = 0; vacio <= num-2; vacio++) {
                                if (vacio == num - num + 1 || vacio == num/2 + 1 ) {
                                    System.out.print("+");
                                }
                                else 
                                    if (vacio == num/2-3||vacio == num/2){
                                        System.out.print("*");
                                    }
                                        System.out.print(" ");
                            }// FIN DE PAREDES DE LOS TRIANGULOS
                                    System.out.println(" ");
                            for (int vacio = 0; vacio <= num-2; vacio++) {
                                if (vacio == num / 2) {
                                    System.out.print("*");
                                }
                                    System.out.print("+");
                            }//ULTIMA LINEA DEL TRIANGULO BIEN COLOCADO
                                System.out.println(" ");
                            for (int vacio = 0; vacio <= num-2; vacio++) {
                                if (vacio == num / 2) {
                                    System.out.print("*");
                                }
                                    System.out.print(" ");
                            }// CACHITO DE *
                                System.out.println(" ");
                            
                            

                    break;
                }
                case 3: {
                    seguir = false;
                    break;

                }
            }

        }
    }

}

import java.util.Scanner;

public class TraducirNumero{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a traducir:");
        System.out.println(TraducirNumero.traducir(sc.nextLine()));
        sc.close();
    }
    
    
    
    
    public static String traducir(String numero){
        String leyendo = "", devolver = "";
        boolean cien = false;

        for(int i=0;i<numero.length();i++){
            leyendo = leyendo + numero.charAt(i);

            switch (leyendo) {
                case "uno" -> {
                    if(cien)
                        devolver = devolver + "01";
                    else
                        devolver = devolver + "1";
                    leyendo = "";
                }
                case "dos" -> {
                    if(cien)
                        devolver = devolver + "02";
                    else
                        devolver = devolver + "2";
                    leyendo = "";
                }
                case "tres" -> {
                    if(devolver.equals("ciento"))
                        devolver = devolver + "03";
                    else
                        devolver = devolver + "3";
                    leyendo = "";
                }
                case "cuatro" -> {
                    if(devolver.equals("ciento"))
                        devolver = devolver + "04";
                    else
                        devolver = devolver + "4";
                    leyendo = "";
                }
                case "cinco" -> {
                    if(devolver.equals("ciento"))
                        devolver = devolver + "05";
                    else
                        devolver = devolver + "5";
                    leyendo = "";
                }
                case "seis" -> {
                    if(devolver.equals("ciento"))
                        devolver = devolver + "06";
                    else
                        devolver = devolver + "6";
                    leyendo = "";
                }
                case "siete" -> {
                    if(devolver.equals("ciento"))
                        devolver = devolver + "07";
                    else
                        devolver = devolver + "7";
                    leyendo = "";
                }
                case "ocho" -> {
                    if(devolver.equals("ciento"))
                        devolver = devolver + "08";
                    else
                        devolver = devolver + "8";
                    leyendo = "";
                }
                case "nueve" -> {
                    if(devolver.equals("ciento"))
                        devolver = devolver + "09";
                    else
                        devolver = devolver + "9";
                    leyendo = "";
                }
                case "diez" -> {
                    devolver = devolver + "10";
                    leyendo = "";
                }
                case "once" -> {
                    devolver = devolver + "11";
                    leyendo = "";
                }
                case "doce" -> {
                    devolver = devolver + "12";
                    leyendo = "";
                }
                case "trece" -> {
                    devolver = devolver + "13";
                    leyendo = "";
                }
                case "catorce" -> {
                    devolver = devolver + "14";
                    leyendo = "";
                }
                case "quince" -> {
                    devolver = devolver + "15";
                    leyendo = "";
                }
                case "dieci" -> {
                    devolver = devolver + "1";
                    leyendo = "";
                }
                
                case "veinte" -> {
                    devolver = devolver + "20";
                    leyendo = "";
                }

                case "veinti" -> {
                    devolver = devolver + "2";
                    leyendo = "";
                }
                
                case "treinta" -> {
                    try {
                        if(numero.charAt(i+1) == 'i'){
                            devolver = devolver + "3";
                            i++;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "30";
                        leyendo = "";
                    }
                }
                
                case "cuarenta" -> {
                    try {
                        if(numero.charAt(i+1) == 'i'){
                            devolver = devolver + "4";
                            i++;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "40";
                        leyendo = "";
                    }
                }
                case "cincuenta" -> {
                    try {
                        if(numero.charAt(i+1) == 'i'){
                            devolver = devolver + "5";
                            i++;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "50";
                        leyendo = "";
                    }
                }

                case "sesenta" -> {
                    try {
                        if(numero.charAt(i+1) == 'i'){
                            devolver = devolver + "6";
                            i++;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "60";
                        leyendo = "";
                    }
                }

                case "setenta" -> {
                    try {
                        if(numero.charAt(i+1) == 'i'){
                            devolver = devolver + "7";
                            i++;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "70";
                        leyendo = "";
                    }
                }

                case "ochenta" -> {
                    try {
                        if(numero.charAt(i+1) == 'i'){
                            devolver = devolver + "8";
                            i++;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "80";
                        leyendo = "";
                    }
                }

                case "noventa" -> {
                    try {
                        if(numero.charAt(i+1) == 'i'){
                            devolver = devolver + "9";
                            i++;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "90";
                        leyendo = "";
                    }
                }

                case "cien" -> {
                    try {
                        if(numero.charAt(i+1) == 't'){
                            devolver = devolver + "1";
                            cien = true;
                            leyendo = "";
                        }
                    } catch (Exception e) {
                        devolver = devolver + "100";
                        leyendo = "";
                    }
                }
                
                
                default -> {
                }
                    
            }
        }

        return devolver;
    }

}
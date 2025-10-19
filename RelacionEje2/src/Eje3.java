import java.util.Scanner;

public class Eje3 {
    //signo del zodiaco a partir del día y el mes de nacimiento.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes;
        String signo = " ";

        System.out.print("Introduce tu día de nacimiento: ");
        dia= sc.nextInt();
        System.out.print("Introduce tu mes de nacimiento: ");
        mes= sc.nextInt();

        if ((dia>=21 && mes ==3) || (dia<=19 && mes== 4)) {
           signo = "ARIES"; 
        } else if ((dia>=20 && mes ==4) || (dia<=20 && mes== 5)) {
           signo = "TAURO";
        } else if ((dia>=21 && mes ==5) || (dia<=20 && mes== 6)) {
           signo = "GÉMINIS";
        } else if ((dia>=21 && mes ==6) || (dia<=22 && mes== 7)) {
           signo = "CÁNCER";
        } else if ((dia>=23 && mes ==7) || (dia<=22 && mes== 8)) {
           signo = "LEO";
        } else if ((dia>=23 && mes ==8) || (dia<=22 && mes== 9)) {
           signo = "VIRGO";
        } else if ((dia>=23 && mes ==9) || (dia<=22 && mes== 10)) {
           signo = "LIBRA";
        } else if ((dia>=23 && mes ==10) || (dia<=21 && mes== 11)) {
           signo = "ESCORPIO";
        } else if ((dia>=22 && mes ==11) || (dia<=21 && mes== 12)) {
           signo = "SAGITARIO";
        } else if ((dia>=22 && mes ==12) || (dia<=19 && mes== 1)) {
           signo = "CAPRICORNIO";
        } else if ((dia>=20 && mes ==1) || (dia<=18 && mes== 2)) {
           signo = "ACUARIO";
        } else if ((dia>=19 && mes ==2) || (dia<=20 && mes== 3)) {
           signo = "PISCIS";
        } else {
            signo = "Fecha no válida";
        }

        System.out.println("Tu signo del zodiaco es: " + signo);

    }
}

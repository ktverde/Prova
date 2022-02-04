package Questao_7;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LocalTime hora;
        Login login;
        while (true) {
            System.out.println("Digite seu usuário: ");
            String usuario = teclado.next();
            System.out.println("Digite sua senha: ");
            String senha = teclado.next();

            try {
                login = new Login(usuario, senha);
                hora = LocalTime.now();

                DateTimeFormatter meuFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
                System.out.println(hora.format(meuFormato));
                break;

            } catch (LoginFailedException | DateTimeException lfe) {
                System.out.println(lfe.getMessage());
            }
        }
        if (hora.getHour() >= 0 && hora.getHour() < 6) {
            System.out.println("Boa madrugada, " + login.getLogin() + "! Você se logou ao nosso sistema.");
        }
        else if (hora.getHour() >= 6 && hora.getHour() < 12){
            System.out.println("Bom dia, "+ login.getLogin() + "! Você se logou ao nosso sistema.");
        }
        else if(hora.getHour() >= 12 && hora.getHour() < 18){
            System.out.println("Boa tarde, "+ login.getLogin() + "! Você se logou ao nosso sistema.");
        }
        else{
            System.out.println("Boa noite, "+ login.getLogin() + "! Você se logou ao nosso sistema.");
        }
    }

}

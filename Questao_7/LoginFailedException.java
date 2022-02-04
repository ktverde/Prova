package Questao_7;

public class LoginFailedException extends RuntimeException
{
    public LoginFailedException(){}

    public LoginFailedException(String str){ super(str);}
}

package Questao_7;

public class Login
{
    private String login;
    private String senha;

    public Login(String login, String senha){
        this.login = "ktverde";
        this.senha = "paulo";
        if(!this.login.equals(login) || !this.senha.equals(senha)){
            throw new LoginFailedException("\nUsuário e/ou senha inválidos!");
        }
    }

    public String getLogin(){ return this.login; }
    public String getSenha(){ return this.senha; }
}
